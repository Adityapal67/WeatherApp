🚀 Weather App (Backend)

A simple backend application that provides 3-day weather forecasts for any city using a RESTful API.

📌 Overview

This project is a basic Weather Forecast API built using Spring Boot.
It allows users to search for a city and retrieve weather data, demonstrating core backend concepts like CRUD operations, API design, and database integration.

🎯 Features
🌍 Search weather by city name
📅 Get forecast for up to 3 days
🔄 Basic CRUD operations
🗄️ Persistent storage using MySQL
⚡ RESTful API architecture
🛠️ Tech Stack
Language: Java
Framework: Spring Boot
Database: MySQL
ORM: JPA (Hibernate)
Build Tool: Maven
🏗️ Architecture
REST API-based backend
Layered architecture:
Controller (API layer)
Service (business logic)
Repository (data access)
🚀 Getting Started
Prerequisites
Java (JDK 8 or above)
Maven
MySQL
🔧 Setup & Run Locally
# Clone the repository
git clone https://github.com/Adityapal67/WeatherApp.git

# Navigate into the project
cd weather-app
1. Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/weather_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
2. Run the Application
mvn spring-boot:run

Server will start at:

http://localhost:8080
🔌 API Endpoints
📍 Get Weather by City
GET /api/weather/{city}

Description: Fetch weather forecast for a specific city

➕ Add Weather Data
POST /api/weather
🔄 Update Weather Data
PUT /api/weather/{id}
❌ Delete Weather Data
DELETE /api/weather/{id}
🧪 Testing

Basic API testing can be done using:

Postman
cURL
📸 Demo

This is a backend-only project, so no UI is included.

⚡ Learnings
Built REST APIs using Spring Boot
Understood CRUD operations in depth
Integrated MySQL with JPA
Learned project structuring in backend development
📈 Future Improvements
Add real-time weather API integration
Implement authentication (JWT)
Add frontend (React/Angular)
Improve error handling and validation
👨‍💻 Author
Aditya Pal
