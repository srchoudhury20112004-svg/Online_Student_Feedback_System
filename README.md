# Online Student Feedback System

A secure and user-friendly **web application** that allows students to submit feedback online and enables administrators to efficiently manage and review responses.  
Built using **Java Servlets, MySQL, HTML, CSS**, and deployed on **Apache Tomcat**.

---

## 🌟 Project Overview

The Online Student Feedback System digitizes the traditional feedback process by providing a centralized platform where:

- Students can share honest feedback anytime, anywhere  
- Administrators can analyze feedback for academic and service improvements  
- Data is stored securely in a relational database  

This system improves transparency, efficiency, and decision-making in educational institutions.

---

## 🚀 Key Features

### 👨‍🎓 Student Module
- Secure login system  
- Submit feedback through validated forms  
- View submission confirmation  

### 👩‍💼 Admin Module
- Secure admin login  
- View all submitted feedback  
- Manage student responses  
- Monitor feedback trends  

### ⚙️ System Features
- Role-based authentication (Student / Admin)  
- Responsive UI design  
- Server-side and client-side validation  
- Secure database connectivity  
- Modular MVC-style architecture  

---

## 🛠 Tech Stack

- **Backend:** Java Servlets  
- **Frontend:** HTML, CSS  
- **Database:** MySQL  
- **Build Tool:** Maven  
- **Server:** Apache Tomcat  
- **Version Control:** Git & GitHub  

---

## 📁 Project Structure

OnlineStudentFeedbackSystem/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── companyname/
│       │           └── feedbacksystem/
│       │               ├── config/                 # Application configuration
│       │               │   └── AppConfig.java
│       │               │
│       │               ├── controller/             # Servlets (Controllers)
│       │               │   ├── AuthController.java
│       │               │   ├── FeedbackController.java
│       │               │   └── AdminController.java
│       │               │
│       │               ├── service/                # Business logic layer
│       │               │   ├── AuthService.java
│       │               │   └── FeedbackService.java
│       │               │
│       │               ├── dao/                    # Data access layer
│       │               │   ├── UserDAO.java
│       │               │   └── FeedbackDAO.java
│       │               │
│       │               ├── model/                  # Entity / Domain classes
│       │               │   ├── User.java
│       │               │   └── Feedback.java
│       │               │
│       │               ├── dto/                    # Data Transfer Objects
│       │               │   └── FeedbackDTO.java
│       │               │
│       │               ├── exception/              # Custom exceptions
│       │               │   └── ApplicationException.java
│       │               │
│       │               └── util/                   # Utility classes
│       │                   ├── DBConnection.java
│       │                   └── PasswordEncoder.java
│       │
│       ├── resources/
│       │   ├── db.properties                       # Database configuration
│       │   └── log4j2.xml                          # Logging configuration
│       │
│       └── webapp/
│           ├── assets/
│           │   ├── css/
│           │   │   └── style.css
│           │   ├── js/
│           │   │   └── validation.js
│           │   └── images/
│           │
│           ├── WEB-INF/
│           │   └── web.xml                         # Servlet configuration
│           │
│           ├── views/                              # JSP views
│           │   ├── login.jsp
│           │   ├── feedback.jsp
│           │   └── admin.jsp
│           │
│           └── index.jsp                           # Entry point
│
├── database/
│   └── database_setup.sql                          # Database schema
│
├── docs/
│   └── project-report.pdf                          # Documentation
│
├── pom.xml                                         # Maven build file
└── README.md                                       # Project documentation


