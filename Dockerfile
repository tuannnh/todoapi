FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD

MAINTAINER Hung Tuan

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn package

FROM openjdk:8-jdk-alpine
WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/todoapi.jar /app/app.jar

EXPOSE 9900

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
