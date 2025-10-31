# spring-api-dev

A lightweight Spring Boot REST API running in Docker with hot reload support.

## 🧰 Requirements

- Docker & Docker Compose
- No local JDK or Maven required (everything runs inside the container)

## 🚀 Run the API

run
```bash
docker compose down -v && docker compose up --build
```

check 
```url
http://localhost:8080/api/hello
```
