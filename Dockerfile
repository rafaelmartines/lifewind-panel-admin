FROM eclipse-temurin:17-jdk-alpine
LABEL org.opencontainers.image.authors="rafael.martines@gmail.com"
ENV SPRING_PROFILES_ACTIVE=dev

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw \
    && ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
