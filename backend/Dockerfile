FROM openjdk:17-jdk-alpine3.13

WORKDIR /backend_app

COPY . .

COPY target/GreenCommute*.jar app.jar

EXPOSE 8000

ENTRYPOINT [ "java","-jar","./app.jar" ]