#  Expense Tracker API

The Expense Tracker project is designed to help users record, categorize, and retrieve their daily financial transactions. It allows users to input income and expenses, assign them to relevant categories, and retrieve a monthly financial summary.

##  Table of Contents

- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Project Structure](#project-structure)
- [Swagger Documentation](#swagger-documentation)
- [Screenshots](#screenshots)

##  Introduction

The **Expense Tracker API** is a backend service built using **Spring Boot**. It provides:

-  Adding income and expense transactions
-  Monthly summaries of transactions
-  Filter transactions by type and date
-  Ready for frontend integration

This project is ideal for learning Spring Boot and RESTful API development with categorized data handling.

##  Technologies Used

- **Java** 17+
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Lombok**
- **Swagger UI** for API testing and documentation
- **Postman**

##  Usage

### Step-by-step:

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/expense-tracker.git
   ```

2. **Navigate to the Project Directory**
   ```bash
   cd expense-tracker
   ```

3. **Configure MySQL**
   Update your `application.properties` with your database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```

4. **Run the Project**
   Use your IDE (like IntelliJ) or:
   ```bash
   ./mvnw spring-boot:run
   ```

## 🔌 API Endpoints

| Method | Endpoint                        | Description                              |
|--------|----------------------------------|------------------------------------------|
| POST   | `/api/transaction`              | Add a new transaction                    |
| GET    | `/api/all`                      | Get all transactions                     |
| GET    | `/api/monthlysummary?month=5&year=2025` | Get transactions for a specific month    |

##  Project Structure

```
src/
├── controller/       # REST controllers
├── model/            # Entity and DTO classes
├── repository/       # JPA repositories
├── service/          # Business logic
├── configuration/    # Swagger and other config (optional)
└── ExpenseTrackerApplication.java
```

##  Swagger Documentation

Access Swagger UI at:

```
http://localhost:8080/swagger-ui/index.html
```

This interface allows you to interact with the API directly for testing and development.

##  Screenshots

![Screenshot 2025-05-23 001419](https://github.com/user-attachments/assets/efbf34e3-e22e-4063-acab-96b8e6fb0f4d)
![Screenshot 2025-05-23 010038](https://github.com/user-attachments/assets/d833f793-b9cb-4bee-ae5f-7bed52e92832)
![Screenshot 2025-05-23 010055](https://github.com/user-attachments/assets/dca2bb03-4177-4388-a56d-fd69ea928c5f)


