# 🔗 SmartLinkr-Backend


<img width="804" height="1555" alt="SmartLinker Backend Architecture" src="https://github.com/user-attachments/assets/17a63a64-5076-423e-ac12-efd7333482ba" />

A full-stack URL shortening platform with real-time analytics dashboard and secure authentication using Spring Boot, React.js, and PostgreSQL.

📌 Project Overview

This project is a scalable URL Shortening System that allows users to:

Convert long URLs into short, shareable links
Seamlessly redirect to original destinations
Track real-time click analytics
Access a secure dashboard with authentication
The system successfully generated 150+ shortened URLs and simulated authentication for 100+ test users, demonstrating secure and scalable backend design.

🚀 Key Features
🔗 1. URL Shortening Engine

Converts long URLs into unique short codes
Stores mappings in PostgreSQL
Supports seamless redirection
Efficient lookup using indexed database queries

📊 2. Analytics Dashboard (React.js)

A modern React-based dashboard to visualize:
Total clicks per URL
Real-time usage metrics
Most accessed links
Click frequency

✔ Dynamic UI updates
✔ API-driven data visualization
✔ Clean and responsive layout

🔐 3. Secure Authentication & Authorization

Implemented using:
Spring Security
JWT (Stateless Authentication)
BCrypt password hashing

Features:

Secure login system
Protected dashboard routes
Role-based access control
Token-based API validation

Simulated authentication for 100+ users to mimic real-world system behavior.

🛠 Tech Stack
🔹 Frontend

React.js
Axios
CSS

🔹 Backend

Spring Boot
Spring Data JPA
Spring Security
JWT Authentication
REST APIs
🔹 Database
PostgreSQL

🏗 System Architecture
React Frontend
      ↓
Spring Boot REST APIs
      ↓
Service Layer (Business Logic)
      ↓
Spring Data JPA
      ↓
PostgreSQL Database

JWT is used for secure communication between frontend and backend.
