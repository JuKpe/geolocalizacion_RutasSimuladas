FROM eclipse-temurin:17-jdk AS builder
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTest

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/targer/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","app.jar"]