# Employee Management System

## Overview
A RESTful API-based Employee Management System built with Spring Boot that provides comprehensive CRUD operations for managing employee data.

## Features
- Create, Read, Update, and Delete (CRUD) operations for employees
- RESTful API architecture
- Spring Boot framework
- MySQL database integration
- Employee data management

## Technologies Used
- **Java** - Programming Language
- **Spring Boot** - Application Framework
- **Spring Data JPA** - Data Access Layer
- **MySQL** - Database
- **Maven** - Dependency Management
- **Hibernate** - ORM Framework

## Prerequisites
- Java 8 or higher
- Maven 3.6+
- MySQL 5.7+

## Database Configuration
Update the `application.properties` file with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Installation

1. Clone the repository:
```bash
git clone https://github.com/Sudheernidamanuri/EmployeeManagementSystem1.git
cd EmployeeManagementSystem1
```

2. Create MySQL database:
```sql
CREATE DATABASE employee_management;
```

3. Build the project:
```bash
mvn clean install
```

4. Run the application:
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

### Employee Operations

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/employees` | Get all employees |
| GET | `/api/employees/{id}` | Get employee by ID |
| POST | `/api/employees` | Create new employee |
| PUT | `/api/employees/{id}` | Update employee |
| DELETE | `/api/employees/{id}` | Delete employee |

### Sample Request/Response

**Create Employee (POST /api/employees)**
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "department": "IT",
  "salary": 50000
}
```

**Response**
```json
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "department": "IT",
  "salary": 50000
}
```

## Project Structure
```
EmployeeManagementSystem1/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/employee/management/
│   │   │       ├── controller/    # REST Controllers
│   │   │       ├── model/         # Entity Classes
│   │   │       ├── repository/    # JPA Repositories
│   │   │       ├── service/       # Business Logic
│   │   │       └── Application.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

## Testing
Run the tests using:
```bash
mvn test
```

## Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License
This project is open source and available under the MIT License.

## Contact
- GitHub: [@Sudheernidamanuri](https://github.com/Sudheernidamanuri)

## Acknowledgments
- Spring Boot Documentation
- Spring Data JPA
- MySQL Database
