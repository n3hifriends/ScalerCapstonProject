# root file path -> right click -> new file -> Dockerfile
# https://hub.docker.com/_/openjdk
# download docker engine app(terminal) and run first
FROM openjdk:17

# package the app first

# target jar file that will be running in container
COPY target/DockerDemo-0.0.1-SNAPSHOT.jar app.jar

# to run java app:-> java -jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

#3nitin -> is my account name: n3.hifriends@gmail.com -> Newp@as123 (https://hub.docker.com)
# to build -> docker build -t 3nitin/dec2024:v1 .   (there is a dot, & lowercase)
# to run (create container) -> docker run -t 3nitin/dec2024:v1 .
# to generate docker image -> docker push 3nitin/dec2024:v1

# to run on another port from port 8080 to mentioned port since my something work on local machines 8080
# docker run -d --name local -p 8080:8080 3nitin/dec2024:v1

# docker ps -> to see running controller

