A CLI-based School Management System developed using Core Java, following Object-Oriented Programming (OOP) principles and file handling (serialization).
This project demonstrates real-world application logic, role-based access, and persistent data storage without using any frameworks.

📌 Features
🔐 Role-Based Login

Admin Login (Username & Password)

Teacher Login (Teacher ID)

Student Login (Student ID)

👨‍💼 Admin

Add new students

Add new teachers

View all students

View all teachers

👨‍🏫 Teacher

Add marks for students (subject-wise)

Mark student attendance

👨‍🎓 Student

View personal profile

View marks

View attendance

💾 Data Persistence

Uses Java Serialization

Student and Teacher data are stored in files

Data remains safe even after program restarts

🛠️ Technologies Used

Core Java

Object-Oriented Programming (OOP)

Collections Framework (ArrayList, HashMap)

File Handling (Serialization)

CLI (Command Line Interface)

📁 Project Structure
school-management-system/
│
├── model/
│   ├── Person.java
│   ├── Student.java
│   ├── Teacher.java
│   ├── Subject.java
│   ├── Admin.java
│
├── service/
│   ├── SchoolService.java
│
├── util/
│   ├── FileUtil.java
│
└── Main.java

🔑 Admin Credentials
Username: admin
Password: admin123

▶️ How to Run the Project

Clone the repository

git clone <your-repo-url>


Open the project in any Java IDE (IntelliJ / Eclipse / VS Code)

Run Main.java

Use the CLI menu to interact with the system

🧠 OOP Concepts Used

Abstraction → Person abstract class

Inheritance → Student and Teacher extend Person

Encapsulation → Private fields with controlled access

Polymorphism → Method overriding (toString())

🎯 Learning Outcomes

Designed a real-world system using Core Java

Implemented service-layer architecture

Practiced file handling & data persistence

Understood role-based authentication

Improved problem-solving & design thinking

🚀 Future Enhancements

Password-based login for teachers & students

Auto ID generation

Subject management module

Database integration (MySQL)

Web version using Spring Boot

📌 Author

Rishabh Raj
Computer Science Engineering Student
Aspiring Software Developer
