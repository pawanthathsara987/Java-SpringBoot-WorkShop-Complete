# 🍽️ Restaurant Management System

A full-stack **CRUD** web application built with **Spring Boot** and **Thymeleaf** for managing restaurant records. This project demonstrates the MVC architecture pattern using Spring Boot, JPA/Hibernate, and a MySQL database.

---

## 📋 Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Application Endpoints](#application-endpoints)
- [Database Configuration](#database-configuration)
- [Screenshots](#screenshots)

---

## ✨ Features

- **View** all restaurants in a styled, responsive table
- **Add** a new restaurant with name, location, rating, and cuisine
- **Edit** existing restaurant details
- **Delete** a restaurant from the list
- Auto-creates the database if it doesn't exist
- Clean, modern UI with gradient styling

---

## 🛠️ Tech Stack

| Layer        | Technology                          |
|--------------|-------------------------------------|
| Language     | Java 17                             |
| Framework    | Spring Boot 4.0.3                   |
| View Engine  | Thymeleaf                           |
| ORM          | Spring Data JPA / Hibernate         |
| Database     | MySQL                               |
| Build Tool   | Maven                               |
| Utilities    | Lombok                              |

---

## 📁 Project Structure

```
src/main/java/ruh/tec/restaurant/
├── RestaurantApplication.java          # Spring Boot entry point
├── controller/
│   └── RestaurantController.java       # Handles HTTP requests (MVC Controller)
├── model/
│   └── Restaurant.java                 # JPA Entity (id, name, location, rating, cuisine)
├── repository/
│   └── RestaurantRepository.java       # JPA Repository interface
└── service/
    └── RestaurantService.java          # Business logic layer

src/main/resources/
├── application.yml                     # Application & database configuration
└── templates/
    ├── index.html                      # Home page – lists all restaurants
    ├── new_restaurant.html             # Form to add a new restaurant
    └── edit.html                       # Form to edit an existing restaurant
```

---

## ✅ Prerequisites

- **Java 17** or higher
- **Maven 3.6+**
- **MySQL 8.0+** running locally on port `3306`

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone <repository-url>
cd restaurant
```

### 2. Configure the database

Open `src/main/resources/application.yml` and update the MySQL credentials if needed:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/restaurant_management_system?createDatabaseIfNotExists=true
    username: root
    password: 1234
```

> The database `restaurant_management_system` will be **created automatically** if it doesn't exist.

### 3. Build and run

Using the Maven wrapper:

```bash
./mvnw spring-boot:run
```

Or on Windows:

```cmd
mvnw.cmd spring-boot:run
```

### 4. Open in browser

Navigate to: **[http://localhost:8080](http://localhost:8080)**

---

## 🌐 Application Endpoints

| Method | URL                        | Description                     |
|--------|----------------------------|---------------------------------|
| GET    | `/`                        | Home page – list all restaurants|
| GET    | `/new`                     | Show "Add New Restaurant" form  |
| POST   | `/saveRestaurant`          | Save a new restaurant           |
| GET    | `/edit/{id}`               | Show edit form for a restaurant |
| POST   | `/updateRestaurant/{id}`   | Update an existing restaurant   |
| GET    | `/delete/{id}`             | Delete a restaurant by ID       |

---

## 🗄️ Database Configuration

The application uses **Spring Data JPA** with Hibernate's `ddl-auto: update` strategy, which automatically creates/updates the `restaurants` table based on the `Restaurant` entity:

| Column   | Type      | Description             |
|----------|-----------|-------------------------|
| id       | INT (PK)  | Auto-generated ID       |
| name     | VARCHAR   | Restaurant name         |
| location | VARCHAR   | Restaurant location     |
| rating   | DOUBLE    | Restaurant rating       |
| cuisine  | VARCHAR   | Type of cuisine served  |

---

## 📸 Screenshots

| Home Page | Add Restaurant | Edit Restaurant |
|-----------|----------------|-----------------|
| Lists all restaurants in a styled table with edit/delete actions | Form to add a new restaurant entry | Pre-filled form to update restaurant details |

---

## 📄 License

This project is for educational/workshop purposes.

