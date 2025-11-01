FROM maven:3.9.9-eclipse-temurin-21
WORKDIR /app

# Copy pom.xml first to pre-fetch dependencies (cached layer)
COPY pom.xml .
RUN mvn -q dependency:go-offline

# Copy source (the rest comes from the volume during runtime)
COPY src ./src

EXPOSE 8080
CMD ["mvn", "spring-boot:run"]
