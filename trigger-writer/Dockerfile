FROM openjdk:8-jre-alpine
WORKDIR /trigger-writer
EXPOSE 8080
COPY build/libs/*.jar /trigger-writer/app.jar
CMD ["java", "-jar", "/trigger-writer/app.jar"]