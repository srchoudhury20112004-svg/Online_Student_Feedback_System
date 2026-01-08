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
│       │   ├── controller/        # Servlets handling requests & responses
│       │   │   ├── LoginServlet.java
│       │   │   ├── FeedbackServlet.java
│       │   │   └── AdminServlet.java
│       │   │
│       │   ├── dao/               # Database access layer
│       │   │   ├── UserDAO.java
│       │   │   └── FeedbackDAO.java
│       │   │
│       │   ├── model/             # Entity / Model classes
│       │   │   ├── User.java
│       │   │   └── Feedback.java
│       │   │
│       │   └── util/              # Utility classes
│       │       └── DBConnection.java
│       │
│       ├── resources/
│       │   └── db.properties      # Database configuration
│       │
│       └── webapp/
│           ├── css/               # Stylesheets
│           │   └── style.css
│           │
│           ├── pages/             # JSP pages
│           │   ├── login.jsp
│           │   ├── feedback.jsp
│           │   └── admin.jsp
│           │
│           └── index.jsp          # Application entry page
│
├── database_setup.sql             # SQL script for DB tables
├── pom.xml                        # Maven configuration
└── README.md                      # Project documentation

