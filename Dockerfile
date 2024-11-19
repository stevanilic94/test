FROM maven:3.8-openjdk-17-slim as builder
RUN mkdir -p /app/source
WORKDIR /app/source
COPY . /app/source
RUN mvn clean package -Dmaven.test.skip=true

FROM builder
COPY --from=builder /app/source/target/*.jar /app/app.jar
EXPOSE 8081
CMD ["java", "-jar", "/app/app.jar"]