# Online Student Feedback System

A secure and scalable **web-based application** that enables students to submit feedback online and allows administrators to efficiently manage and analyze responses.  
Built using **Java Servlets, MySQL, HTML, CSS**, and deployed on **Apache Tomcat** following an enterprise-level layered architecture.

---

## 🌟 Project Overview

The Online Student Feedback System modernizes the traditional feedback process by providing a centralized digital platform where:

- Students can submit feedback anytime, anywhere  
- Administrators can review feedback efficiently  
- Institutions can improve academic and service quality  
- Data is stored securely and accessed in a controlled manner  

This system ensures **transparency, efficiency, and accountability** in feedback management.

---

## 🚀 Features

### 👨‍🎓 Student Module
- Secure authentication  
- Submit feedback using validated forms  
- Confirmation after successful submission  

### 👩‍💼 Admin Module
- Secure admin login  
- View all student feedback  
- Manage feedback records  
- Monitor feedback trends  

### ⚙️ System Features
- Role-based access control  
- Responsive UI  
- Server-side and client-side validation  
- Secure JDBC connectivity  
- Enterprise-level layered architecture  

---

## 🛠 Tech Stack

- **Backend:** Java Servlets  
- **Frontend:** HTML, CSS  
- **Database:** MySQL  
- **Build Tool:** Maven  
- **Server:** Apache Tomcat  
- **Version Control:** Git & GitHub  

---

## 📁 Project Structure (Enterprise Level)

```text
OnlineStudentFeedbackSystem/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── companyname/
│       │           └── feedbacksystem/
│       │               ├── config/                     # Application configuration
│       │               │   └── AppConfig.java
│       │               │
│       │               ├── controller/                 # Servlets (Controllers)
│       │               │   ├── AuthController.java
│       │               │   ├── FeedbackController.java
│       │               │   └── AdminController.java
│       │               │
│       │               ├── service/                    # Business logic layer
│       │               │   ├── AuthService.java
│       │               │   └── FeedbackService.java
│       │               │
│       │               ├── dao/                        # Data access layer
│       │               │   ├── UserDAO.java
│       │               │   └── FeedbackDAO.java
│       │               │
│       │               ├── model/                      # Entity / Domain classes
│       │               │   ├── User.java
│       │               │   └── Feedback.java
│       │               │
│       │               ├── dto/                        # Data Transfer Objects
│       │               │   └── FeedbackDTO.java
│       │               │
│       │               ├── exception/                  # Custom exceptions
│       │               │   └── ApplicationException.java
│       │               │
│       │               └── util/                       # Utility classes
│       │                   ├── DBConnection.java
│       │                   └── PasswordEncoder.java
│       │
│       ├── resources/
│       │   ├── db.properties                           # Database configuration
│       │   └── log4j2.xml                              # Logging configuration
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
│           │   └── web.xml                             # Servlet configuration
│           │
│           ├── views/                                  # JSP pages
│           │   ├── login.jsp
│           │   ├── feedback.jsp
│           │   └── admin.jsp
│           │
│           └── index.jsp                               # Application entry point
│
├── database/
│   └── database_setup.sql                              # Database schema
│
├── docs/
│   └── project-report.pdf                              # Documentation
│
├── pom.xml                                             # Maven build file
└── README.md                                           # Project documentation
