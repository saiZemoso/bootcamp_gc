FROM openjdk:11.0.11-jdk

WORKDIR /backend_app

COPY . .

COPY target/GreenCommute*.jar backend.jar

EXPOSE 8000

ENTRYPOINT [ "java","-jar","backend.jar" ]