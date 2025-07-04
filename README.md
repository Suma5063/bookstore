# 📚 BookStore Spring Boot Application

This is a simple BookStore application built using **Spring Boot** and **MongoDB**.  
It supports basic CRUD operations on books and is designed to be deployed easily on platforms like **Azure** or any cloud.

---

## 🚀 Features

- Add, view, update, and delete books
- RESTful API using Spring Web
- MongoDB as the database
- Environment-specific configuration (Azure/local)
- Dockerized for easy deployment

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data MongoDB
- Maven
- Docker
- Azure (optional deployment)
- Git & GitHub for version control

---

bookStore/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/bookstore/
│   │   │       ├── Book.java                # Entity representing a Book
│   │   │       ├── BookController.java      # REST controller for managing books
│   │   │       ├── BookRepository.java      # Spring Data MongoDB repository
│   │   │       └── BookStoreApplication.java# Main class to run the Spring Boot app
│   │   └── resources/
│   │       ├── application.properties       # Common Spring Boot configuration
│   │       ├── application.local.properties # Local environment configs
│   │       └── application.azure.properties # Azure-specific configuration
│
├── target/                                  # Compiled bytecode and JAR files (generated)
├── pom.xml                                  # Maven configuration file
├── Dockerfile                               # Docker image build configuration
├── README.md                                # Project documentation


📝 Description of Key Components
Book.java: Defines the book model with fields like title, author, price, etc.

BookController.java: Provides RESTful APIs to add, fetch, and manage books.

BookRepository.java: Interface for CRUD operations with MongoDB.

application.properties: Shared properties for all environments.

application.local.properties: Used when running locally.

application.azure.properties: Used when deploying to Azure.