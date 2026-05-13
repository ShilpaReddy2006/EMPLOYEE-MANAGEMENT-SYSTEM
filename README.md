# Employee Management System

A simple Employee Management System built using **Spring Boot**, **Spring Data JPA**, and **MySQL**.  
This project provides REST APIs to perform basic CRUD operations on employee records.

---

## 🚀 Features

- Add a new employee
- Retrieve all employees
- Get employee by ID
- Update employee details
- Delete employee
- RESTful API architecture
- MySQL database integration
- Spring Data JPA support

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## 📁 Project Structure

```
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

## ⚙️ Database Configuration

Update `application.properties` with your MySQL settings:

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

## 📌 API Endpoints

### ➕ Add Employee
**POST** `/employee`

```json
{
  "name": "John",
  "department": "IT",
  "salary": 50000
}
```

---

### 📄 Get All Employees
**GET** `/employees`

---

### 🔍 Get Employee by ID
**GET** `/employee/{id}`

Example:
```
/employee/1
```

---

### ✏️ Update Employee
**PUT** `/employee`

```json
{
  "id": 1,
  "name": "John Updated",
  "department": "HR",
  "salary": 60000
}
```

---

### ❌ Delete Employee
**DELETE** `/employee/{id}`

Example:
```
/employee/1
```

---

## ▶️ How to Run the Project

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/employee-management-system.git
```

### 2. Navigate to Project Folder
```bash
cd employee-management-system
```

### 3. Create Database
```sql
CREATE DATABASE employee_db;
```

### 4. Run the Application
```bash
mvn spring-boot:run
```

OR run `EmployeeApplication.java` from your IDE.

---

## 🌱 Future Improvements

- Global exception handling using `@ControllerAdvice`
- Input validation using Hibernate Validator
- API documentation using Swagger/OpenAPI
- Authentication & Authorization (Spring Security + JWT)
- Pagination and sorting for employee lists
- Unit and integration testing

---

## 👩‍💻 Author

**Yerravalla Shilpa Reddy**
