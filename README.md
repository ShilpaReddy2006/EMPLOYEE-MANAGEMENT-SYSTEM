# Employee Management System

A simple Employee Management System built using Spring Boot, Spring Data JPA, and MySQL.  
This project provides REST APIs to perform CRUD operations on employee records.

---

## Features

- Add Employee
- Get All Employees
- Get Employee by ID
- Update Employee
- Delete Employee
- RESTful API architecture
- MySQL database integration
- Spring Data JPA support

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## Project Structure

```bash
src/main/java/com/example/employee
│
├── controller
│   └── EmployeeController.java
│
├── model
│   └── Employee.java
│
├── repository
│   └── EmployeeRepository.java
│
├── service
│   └── EmployeeService.java
│
└── EmployeeApplication.java
```

---

## Database Configuration

Update the `application.properties` file with your MySQL configuration.

```properties
spring.application.name=employee

spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=root123

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8083
```

---

## API Endpoints

### Add Employee

```http
POST /employee
```

Request Body:

```json
{
  "name": "John",
  "department": "IT",
  "salary": 50000
}
```

---

### Get All Employees

```http
GET /employees
```

---

### Get Employee By ID

```http
GET /employee/{id}
```

Example:

```http
GET /employee/1
```

---

### Update Employee

```http
PUT /employee
```

Request Body:

```json
{
  "id": 1,
  "name": "John Updated",
  "department": "HR",
  "salary": 60000
}
```

---

### Delete Employee

```http
DELETE /employee/{id}
```

Example:

```http
DELETE /employee/1
```

---

## How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/employee-management-system.git
```

### 2. Navigate to Project Directory

```bash
cd employee-management-system
```

### 3. Create MySQL Database

```sql
CREATE DATABASE employee_db;
```

### 4. Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the `EmployeeApplication.java` file directly from your IDE.

---

## Server Details

- Application URL: `http://localhost:8083`

---

## Sample Employee JSON

```json
{
  "id": 1,
  "name": "Alice",
  "department": "Finance",
  "salary": 75000
}
```

---

## Important Fixes

### Fix Delete Mapping

Replace this:

```java
@DeleteMapping("/employee{id}")
```

With this:

```java
@DeleteMapping("/employee/{id}")
```

## Future Improvements

- Exception Handling
- Validation using Hibernate Validator
- Swagger API Documentation
- Authentication & Authorization
- Pagination and Sorting
- Unit Testing

---

## Author

Developed by Your Name
