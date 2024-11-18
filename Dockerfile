FROM openjdk:17-jdk-slim
EXPOSE 8090:8080
ADD target/jay-bbq.jar jay-bbq.jar
ENTRYPOINT ["java","-jar","/jay-bbq.jar"]
