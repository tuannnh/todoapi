FROM openjdk:8-jdk-alpine

ADD target/todoapi.jar app.jar

EXPOSE 8080

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]

RUN docker-compose up -d --remove-orphans
