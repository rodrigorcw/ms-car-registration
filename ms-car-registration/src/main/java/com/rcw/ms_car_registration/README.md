
# 🚗 Car Registration API

## 📖 Description

An API for managing car registrations, allowing you to add, view, and update detailed vehicle information such as make, model, fuel type, number of doors, mileage, and more.

---

## 🛠️ Technologies Used

- ☕ Java 17+
- 🌱 Spring Boot
- 🗄️ Spring Data JPA (Hibernate)
- 🛢️ Relational database (e.g. MySQL, PostgreSQL)
- 🧰 Lombok
- 📦 Jackson (for JSON serialization)

---

## 🚙 `Car` Model

Represents a registered car in the system with the following fields:

| Field               | Type          | Description                                  |
|---------------------|---------------|----------------------------------------------|
| `id`                | Long          | 🔑 Unique identifier (auto-generated)         |
| `make`              | String        | 🏭 Car manufacturer                           |
| `name`              | String        | 🏷️ Car model/name                            |
| `fuelType`          | String        | ⛽ Fuel type (e.g. Petrol, Diesel)             |
| `bodyType`          | String        | 🚗 Body style (e.g. Saloon, SUV)               |
| `doors`             | int           | 🚪 Number of doors                            |
| `mileage`           | Double        | 🛣️ Mileage (in miles or kilometres)            |
| `transmission`      | String        | ⚙️ Transmission type (Manual, Automatic)        |
| `seats`             | int           | 💺 Number of seats                           |
| `colour`            | String        | 🎨 Car colour                               |
| `engine`            | Float         | 🔧 Engine capacity                           |
| `nctExpire`         | LocalDate     | 📅 NCT (vehicle inspection) expiry date        |
| `totalOwners`       | int           | 👥 Total previous owners                      |
| `registrationPlate` | String        | 🏷️ Vehicle registration plate (unique)        |
| `price`             | Double        | 💰 Car price                                 |
| `status`            | CarStatus     | 📋 Car status (e.g. available, sold)           |

---

## 🚀 How to Run the Project

### 📋 Prerequisites

- Java 17 or higher  
- Maven 3.x  
- Configured relational database (MySQL, PostgreSQL, etc.)

### ⚙️ Steps

1. **Clone the repository:**  
```bash
git clone https://github.com/your-username/car-registration-api.git
```

2. **Configure your database connection** in `application.properties` or `application.yml`:  
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/car_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

3. **Build and run the application using Maven:**  
```bash
mvn clean install
mvn spring-boot:run
```

4. The API will be available at:  
```
http://localhost:8080
```

---

## 📡 API Endpoints (examples)

| Method | Endpoint       | Description            |
|--------|----------------|------------------------|
| GET    | `/cars`        | List all cars          |
| GET    | `/cars/{id}`   | Get car by ID          |
| POST   | `/cars`        | Create a new car record|
| PUT    | `/cars/{id}`   | Update a car record    |
| DELETE | `/cars/{id}`   | Delete a car record    |

---

## 🧪 Testing

To run tests (if any):  
```bash
mvn test
```

---

## ✍️ Author

Rodrigo Wenzel — your.email@example.com

---

## 📄 Licence

This project is licensed under the **MIT Licence**. See the LICENSE file for details.

---
