# Hike Meal Planner

A full-stack web application to help hikers plan their meals and snacks for upcoming hikes.

## Features

- **Meal & Snack Management**: Create and manage a personal database of meals and snacks
- **Hike Planning**: Create hikes and plan meals across the duration of your hike
- **Authentication**: Secure login system with JWT tokens
- **Sharing & Collaboration**: Invite other hikers to collaborate on hike planning
- **Private Hikes**: Keep your hikes private or share them with specific members

## Tech Stack

### Frontend
- React with TypeScript
- Vite as build tool
- Axios for API calls
- Tailwind CSS for styling

### Backend
- Java Spring Boot
- Spring Security with JWT
- PostgreSQL database
- Spring Data JPA

## Project Structure

```
hike-meal-planner/
├── frontend/              # React TypeScript application
│   ├── src/
│   ├── public/
│   ├── package.json
│   └── vite.config.ts
├── backend/               # Spring Boot application
│   ├── src/
│   ├── pom.xml
│   └── application.properties
└── README.md
```

## Getting Started

### Prerequisites
- Node.js 18+
- Java 17+
- PostgreSQL 12+

### Frontend Setup
```bash
cd frontend
npm install
npm run dev
```

### Backend Setup
```bash
cd backend
mvn clean install
mvn spring-boot:run
```

## Database Setup

Create a PostgreSQL database:
```sql
CREATE DATABASE hike_meal_planner;
```

Update `backend/src/main/resources/application.properties` with your database credentials.

## API Documentation

API runs on `http://localhost:8080`
Frontend runs on `http://localhost:5173`

## Contributing

Feel free to submit issues and enhancement requests.
