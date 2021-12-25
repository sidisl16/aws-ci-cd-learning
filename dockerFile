FROM openjdk:8-jdk-alpine

COPY target/aws-ci-cd-learning-0.0.1-SNAPSHOT.jar runnable.jar

ENTRYPOINT ["java","-jar","runnable.jar"]