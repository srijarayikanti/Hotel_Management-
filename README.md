# 🏨 Hotel Management System — Full Stack (Spring Boot)

A **full-stack Hotel Management System** built with Java Spring Boot backend and REST APIs. It covers end-to-end hotel operations including room management, booking, customer handling, and billing — secured with Spring Security and JWT.

---

## 🚀 Features

- 🏠 Room Management — add, update, delete, view room availability
- 📅 Booking Management — create, modify, cancel reservations
- 👤 Customer Registration & Profile Management
- 💳 Billing & Invoice Generation
- 🔐 JWT Authentication & Role-Based Access Control (Admin / Staff / Customer)
- 📄 API Documentation with Swagger/OpenAPI (SpringDoc)
- 🗃️ MySQL Integration via Spring Data JPA & Hibernate

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot 3.4.5 |
| Security | Spring Security + JWT |
| ORM | Spring Data JPA + Hibernate |
| Database | MySQL 8 |
| Build Tool | Maven |
| Utilities | Lombok |
| API Docs | SpringDoc OpenAPI (Swagger UI) |
| Dev Tools | Spring Boot DevTools |

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   ├── controller/     # REST Controllers (Room, Booking, Customer, Billing)
│   │   ├── service/        # Business Logic Layer
│   │   ├── repository/     # Spring Data JPA Repositories
│   │   ├── model/          # JPA Entity Classes
│   │   ├── dto/            # Request/Response DTOs
│   │   └── security/       # JWT Filter, Security Config
│   └── resources/
│       └── application.properties
└── test/
```

---

## ⚙️ Setup & Run

### Prerequisites
- Java 17+
- MySQL 8+
- Maven 3.6+

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/srijarayikanti/Hotel_Management-.git
cd Hotel_Management-

# 2. Create MySQL database
CREATE DATABASE hotel_management;

# 3. Update src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/hotel_management
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

# 4. Build and run
mvn clean install
mvn spring-boot:run
```

App runs at: `http://localhost:8080`  
Swagger UI at: `http://localhost:8080/swagger-ui.html`

---

## 📡 Key API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/auth/register` | Register new user |
| POST | `/api/auth/login` | Login & receive JWT |
| GET | `/api/rooms` | Get all rooms |
| GET | `/api/rooms/available` | Get available rooms |
| POST | `/api/booking/create` | Create a booking |
| GET | `/api/booking/{id}` | Get booking details |
| PUT | `/api/booking/cancel/{id}` | Cancel a booking |
| GET | `/api/billing/{bookingId}` | Get invoice |

---

## 👩‍💻 Author

**Rayikanti Srija** — Java Full Stack Developer  
[GitHub](https://github.com/srijarayikanti) | [LinkedIn](https://linkedin.com/in/srija-srinivas-593121238/)
