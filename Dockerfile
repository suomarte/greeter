FROM openjdk:17-jdk-alpine
COPY target/greeter-0.0.1-SNAPSHOT.jar greeter-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "greeter-0.0.1.jar"]