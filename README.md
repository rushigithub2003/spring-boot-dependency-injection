# Spring Boot Dependency Injection

## 📌 About the Project

This project demonstrates Dependency Injection in Spring Boot using `@Autowired` and `@Qualifier`. It implements a customer management example in which customers are processed using different service implementations based on their customer type.

The application uses Spring Data JPA to save customer details to a database.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven

## 📂 Project Structure

```text
com.example.di
├── controller
│   └── CustomerController.java
├── entity
│   └── Customer.java
├── repository
│   └── CustomerRepo.java
└── service
    ├── CustomerService.java
    ├── CustomerServiceImpl.java
    └── PremiumCustomerServiceImpl.java
```

## 🧩 Concepts Covered

- Dependency Injection (DI)
- Inversion of Control (IoC)
- `@Autowired` annotation
- `@Qualifier` annotation
- Interface-based programming
- Multiple service implementations
- Spring Data JPA
- Entity mapping using `@Entity` and `@Id`

## 👤 Customer Entity

The `Customer` entity contains the following fields:

| Field   | Data Type |
| ------- | --------- |
| id      | int       |
| name    | String    |
| email   | String    |
| address | String    |
| type    | String    |

## ⚙️ Service Implementations

### 1. CustomerServiceImpl

Handles regular customer requests and saves customer details using `CustomerRepo`.

### 2. PremiumCustomerServiceImpl

Handles premium customer requests and saves customer details using `CustomerRepo`.

Both classes implement the `CustomerService` interface.

The `@Qualifier` annotation identifies which service implementation should be injected into the controller.

## 🌐 API Endpoint

| HTTP Method | Endpoint    | Description                        |
| ----------- | ----------- | ---------------------------------- |
| POST        | `/customer` | Adds a regular or premium customer |

## 📥 Sample Request — Regular Customer

```json
{
  "id": 1,
  "name": "Rahul",
  "email": "rahul@example.com",
  "address": "Pune",
  "type": "customerServiceImpl"
}
```

## 📥 Sample Request — Premium Customer

```json
{
  "id": 2,
  "name": "Amit",
  "email": "amit@example.com",
  "address": "Mumbai",
  "type": "premiumCustomerServiceImpl"
}
```

## 📤 Expected Response

```text
Customer Added
```

## ▶️ How to Run

1. Clone this repository.
2. Import the project into Spring Tool Suite (STS) as an existing Maven project.
3. Configure the database connection in `application.properties`.
4. Ensure the database is running.
5. Run the Spring Boot application.
6. Test the `/customer` endpoint using Postman with a POST request.

## 🎯 Learning Objective

The main objective is to understand how Spring Boot injects different implementations of the same interface using `@Autowired` and `@Qualifier`, allowing the controller to select the appropriate service based on the customer type.
