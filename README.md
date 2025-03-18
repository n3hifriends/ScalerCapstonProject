
The **Product Catalog Application** developed as part of a **comprehensive backend system**, integrating multiple microservices to achieve a scalable and secure solution. This project involved mastering version control, backend service development, authentication mechanisms, payment integration, and deployment strategies.  


Capstone_Project: https://github.com/n3hifriends/capstone_project.git

PaymentGateway: https://github.com/n3hifriends/PaymentGateway.git

EmailService: https://github.com/n3hifriends/EmailService.git

ServiceDiscovery: https://github.com/n3hifriends/ServiceDiscovery.git

UserAuthentication: https://github.com/n3hifriends/UserAuthenticationServices.git



### **Key Components & Linked Microservices**  

1. **Capstone Project (Main Orchestrator)**  
   - Serves as the **central backend service** for handling product catalog operations.  
   - Implements **Spring Boot with REST APIs**, using MVC architecture.  
   - Manages **database interactions with Spring Data JPA**, including schema versioning and cardinality mappings.  
   - Ensures authentication and authorization using **JWT tokens and OAuth 2.0**.  
   - Integrates **Redis for caching** and **Kafka for asynchronous event processing**, improving performance and scalability.  
   - **Deployment:** Hosted on AWS using **EC2, RDS, VPCs, and Security Groups** for a secure architecture.  

2. **EmailService** (Notification and Communication)  
   - Handles **email notifications** for user interactions (e.g., SignUp complete).  
   - Utilizes **Spring Boot with Java Mail API** for sending emails.  
   - Implements **Kafka consumers** for real-time event-driven email triggers.  
   - Ensures **SMTP configuration and security** for reliable email delivery.  

3. **PaymentGateway** (Transaction Processing)  
   - Integrates **Stripe API** for processing payments securely.  
   - Implements **webhooks** for real-time transaction status updates.  

4. **ServiceDiscovery** (Microservices Communication)  
   - Implements **Spring Cloud Eureka** for service discovery and dynamic load balancing.  
   - Enables seamless communication between microservices, including **Product Catalog, PaymentGateway, and EmailService**.  
   - Ensures **fault tolerance** and **automatic service registration**.  

5. **UserAuthenticationService** (Security & Identity Management)  
   - Manages **user authentication and authorization** using **Spring Security and OAuth 2.0**.  
   - Issues **JWT tokens** for secure API access.  
   - Supports **role-based access control (RBAC)** for different user roles.  

### **Final Deployment & Quality Assurance**  
- Comprehensive **unit testing and mocking** ensure application reliability.  
- **Docker & Kubernetes** manage containerization and deployment.  
- Hosted on **AWS infrastructure**, leveraging **EC2 for hosting, RDS for databases, and S3 for storage**.  

This project exemplifies a **modular microservices approach**, ensuring scalability, security, and maintainability. 🚀  
