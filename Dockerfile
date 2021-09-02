FROM openjdk:16-jdk-alpine
VOLUME /tmp
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar", "--spring.config.location=file:/config/application.properties"]