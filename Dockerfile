FROM openjdk:16-jdk-slim-bullseye
VOLUME /tmp
COPY build/libs/*.jar app.jar

RUN apt-get update && apt-get upgrade -y

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar", "--spring.config.location=file:/config/application.properties"]