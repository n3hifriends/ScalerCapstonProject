package com.scaler.paymentgateway.paymentgateways;

import com.razorpay.PaymentLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.json.JSONObject;
import com.razorpay.Payment;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public class RazorPaymentGateway implements IPaymentGateway {

    @Autowired
    private RazorpayClient razorpayClient;

    // https://razorpay.com/docs/api/payments/payment-links/create-standard?search-string=create%20a%20standard
    public String createStandardPaymentLink(Long amount, String orderId, String phoneNumber, String name, String email) {
        try {
            JSONObject paymentLinkRequest = new JSONObject();
            paymentLinkRequest.put("amount", amount);
            paymentLinkRequest.put("currency", "INR");
            paymentLinkRequest.put("accept_partial", true);
            paymentLinkRequest.put("first_min_partial_amount", 100);
            paymentLinkRequest.put("expire_by", 1738345082);//future value. Taken from epochconverter.com
            paymentLinkRequest.put("reference_id", orderId);
            paymentLinkRequest.put("description", "Payment for policy no #23456");
            JSONObject customer = new JSONObject();
            customer.put("name", phoneNumber);
            customer.put("contact", name);
            customer.put("email", email);
            paymentLinkRequest.put("customer", customer);
            JSONObject notify = new JSONObject();
            notify.put("sms", true);
            notify.put("email", true);
            paymentLinkRequest.put("notify", notify);
            paymentLinkRequest.put("reminder_enable", true);
            JSONObject notes = new JSONObject();
            notes.put("policy_name", "Jeevan Bima");
            paymentLinkRequest.put("notes", notes);
            paymentLinkRequest.put("callback_url", "https://example-callback-url.com/");
            paymentLinkRequest.put("callback_method", "get");

            PaymentLink payment = razorpayClient.paymentLink.create(paymentLinkRequest);
            payment.get("short_url").toString();// https://razorpay.com/docs/api/payments/payment-links/create-standard?search-string=create%20a%20standard
        } catch (RazorpayException e) {
            throw new RuntimeException(e.getMessage());
        }

        return null;
    }
}
