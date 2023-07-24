FROM eclipse-temurin:17-jdk-alpine
LABEL org.opencontainers.image.authors="rafael.martines@gmail.com"

ENV SPRING_PROFILES_ACTIVE=dev

RUN apk --update --no-cache add maven

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw \
    && mvn clean package \
    && ./mvnw dependency:resolve

COPY src ./src

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/paneladmin-0.0.1-SNAPSHOT.jar"]
