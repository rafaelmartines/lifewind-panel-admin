FROM eclipse-temurin:17-jdk-alpine
LABEL org.opencontainers.image.authors="rafael.martines@gmail.com"

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
