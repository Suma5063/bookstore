# 📚 BookStore App

A Spring Boot REST API to manage books with MongoDB, Docker, and Swagger integration.

---

## 🚀 Features

- CRUD operations for books
- MongoDB Atlas database integration
- Dockerized for container deployment
- Swagger UI for API documentation
- Deployed to Azure VM using Docker

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- MongoDB Atlas
- Docker
- Swagger (SpringDoc)

---

## 📦 Run with Docker

```bash
docker build -t bookstore-app .
docker run -d -p 8080:8080 --name bookstore bookstore-app
