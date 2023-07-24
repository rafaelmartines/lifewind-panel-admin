#
# Build stage
#
FROM maven:3.8.2-jdk-17 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests


#
# Package stage
#
FROM openjdk:17-jdk-slim
LABEL org.opencontainers.image.authors="rafael.martines@gmail.com"
ENV SPRING_PROFILES_ACTIVE=dev

COPY --from=build /target/paneladmin-0.0.1-SNAPSHOT.jar paneladmin.jar

# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "paneladmin.jar"]
