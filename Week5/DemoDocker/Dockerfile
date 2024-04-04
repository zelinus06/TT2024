FROM ubuntu:latest
LABEL authors="thaidang"

WORKDIR /DemoDocker

COPY target/DemoDocker-0.0.1-SNAPSHOT.jar app.jar

RUN apt-get update && apt-get install -y openjdk-19-jdk

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
