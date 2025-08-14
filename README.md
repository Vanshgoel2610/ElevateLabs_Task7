Student Database Management (Java JDBC)
📌 Overview

This is a simple Java JDBC project demonstrating how to perform basic CRUD operations (Create, Read, Update, Delete) on a MySQL database.
It connects Java to MySQL using the MySQL Connector/J driver and performs operations on a student table.

🛠 Requirements

Java 8+

MySQL Database

MySQL Connector/J (JAR file added to classpath)

IDE like IntelliJ IDEA or Eclipse

⚙️ Setup Instructions
1. Install MySQL

Download and install MySQL Server, then create a database:

CREATE DATABASE your_name;

2. Add MySQL Connector/J to Project

Download MySQL Connector/J.

Add the .jar file to your project classpath.

3. Create student Table

Run this SQL query inside MySQL:

CREATE TABLE student (
    sid INT(3),
    sname VARCHAR(200),
    semail VARCHAR(200)
);

📂 Project Structure
src/
 ├── Student.java    # Contains methods for database connection and CRUD operations
 ├── DB.java       # Runs the application and calls Student methods

✨ Features

Create Table: Creates the student table in the database.

Insert Data: Adds new student records.

Read Data: Fetches and displays all student records.

Update Data: Updates existing student details.

Delete Data: Deletes a student record by ID.

🚀 How to Run

Open the project in your IDE.

Update database credentials in Student.java:

String url = "jdbc:mysql://localhost:3306/your_name";
String userName = "root";
String password = "YOUR_PASSWORD";


Run DB.java to execute operations.
