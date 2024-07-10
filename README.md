# Simple SpringBoot Web Application

This simple SpringBoot web application exposes endpoints to perform CRUD operations on `Topic` objects.

## Table of Contents
- [Introduction](#introduction)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
  - [GET /topics](#get-topics)
  - [GET /topics/{id}](#get-topicsid)
  - [POST /topics](#post-topics)
  - [PUT /topics/{id}](#put-topicsid)
  - [DELETE /topics/{id}](#delete-topicsid)
- [Project Structure](#project-structure)
- [Models](#models)
- [Controllers](#controllers)
- [Services](#services)

## Introduction

This application demonstrates a basic RESTful web service built with Spring Boot. The service manages a list of topics, allowing clients to create, read, update, and delete topics.

## Getting Started

### Prerequisites
- Java 8 or later
- Maven 3.6.0 or later

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/simple-springboot-webapp.git
   cd simple-springboot-webapp
   ```

2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

### Running the Application
To run the application, use the following Maven command:
```bash
mvn spring-boot:run
```
The application will start on `http://localhost:8080`.

## API Endpoints

### GET /topics
Retrieve all topics.
```bash
curl -X GET http://localhost:8080/topics
```

### GET /topics/{id}
Retrieve a specific topic by ID.
```bash
curl -X GET http://localhost:8080/topics/{id}
```

### POST /topics
Create a new topic.
```bash
curl -X POST -H "Content-Type: application/json" -d '{
  "id": "python",
  "name": "Python",
  "description": "Python Programming Language"
}' http://localhost:8080/topics
```

### PUT /topics/{id}
Update an existing topic.
```bash
curl -X PUT -H "Content-Type: application/json" -d '{
  "name": "Advanced Python",
  "description": "Advanced Python Programming Language"
}' http://localhost:8080/topics/{id}
```

### DELETE /topics/{id}
Delete a topic by ID.
```bash
curl -X DELETE http://localhost:8080/topics/{id}
```

## Project Structure
```
src/main/java/com/mycompany/app
├── models
│   └── Topic.java
├── controllers
│   └── topic
│       └── TopicController.java
├── services
│   └── TopicService.java
└── Application.java
```