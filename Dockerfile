FROM maven:3.6.1-jdk-8 as build-stage
WORKDIR /workspace
COPY . .
COPY config/mvn-settings.xml /root/.m2/settings.xml
RUN mvn clean package -DskipTests

FROM openjdk:8u222-jre
WORKDIR /app
COPY --from=build-stage /workspace/target/dps-demo-1.0.jar /app/dps-demo-1.0.jar.jar
COPY dps-entrypoint.sh /app/dps-entrypoint.sh
ENTRYPOINT ["sh", "/app/dps-entrypoint.sh"]