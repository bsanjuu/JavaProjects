
# Spring Projects

This repository contains a collection of Java Spring projects, each demonstrating different aspects of Spring Framework including cloud deployment, web applications, and basic Spring Boot apps. Below is a list of the projects included in this repository.

## Projects

### 1. AWS Elastic Beanstalk
A project demonstrating how to deploy a Spring Boot application on AWS Elastic Beanstalk.

- **Technologies Used**: Java, Spring Boot, AWS Elastic Beanstalk
- **How to Run**:
    - Package the Spring Boot application into a `.jar` file.
    - Deploy the `.jar` file to AWS Elastic Beanstalk.
    - Use the AWS Elastic Beanstalk dashboard to manage the deployment.

### 2. EmployeeManagement
A Spring Boot application to manage employee data, including features like adding, updating, and deleting employee records.

- **Technologies Used**: Java, Spring Boot, JPA, Hibernate, MySQL
- **How to Run**:
    - Configure `application.properties` with the MySQL database credentials.
    - Run the Spring Boot application.
    ```bash
    mvn spring-boot:run
    ```

### 3. WeatherApp
A weather application built using Spring Boot that fetches weather data from an API and displays it to the user.

- **Technologies Used**: Java, Spring Boot, REST API, JSON
- **How to Run**:
    - Run the Spring Boot application.
    ```bash
    mvn spring-boot:run
    ```

### 4. ecom1
An e-commerce platform built with Spring Boot, featuring basic functionalities like product listing, shopping cart, and checkout process.

- **Technologies Used**: Java, Spring Boot, Thymeleaf, MySQL
- **How to Run**:
    - Configure `application.properties` with the MySQL database credentials.
    - Run the application.
    ```bash
    mvn spring-boot:run
    ```

### 5. DemoSpring
A simple Spring Boot application demonstrating the basic concepts of Spring Framework.

- **Technologies Used**: Java, Spring Boot
- **How to Run**:
    - Run the Spring Boot application.
    ```bash
    mvn spring-boot:run
    ```

### 6. HelloApp
A basic Spring Boot "Hello World" application, designed to demonstrate how Spring Boot works with RESTful APIs.

- **Technologies Used**: Java, Spring Boot, REST API
- **How to Run**:
    - Run the Spring Boot application.
    ```bash
    mvn spring-boot:run
    ```

### 7. awsapplication
A Spring Boot application that integrates with AWS services such as S3, EC2, and Lambda.

- **Technologies Used**: Java, Spring Boot, AWS SDK
- **How to Run**:
    - Configure AWS credentials.
    - Run the Spring Boot application.
    ```bash
    mvn spring-boot:run
    ```

### 8. simplewebapp
A simple web application built using Spring Boot and Thymeleaf, featuring basic functionalities like routing and rendering HTML pages.

- **Technologies Used**: Java, Spring Boot, Thymeleaf
- **How to Run**:
    - Run the Spring Boot application.
    ```bash
    mvn spring-boot:run
    ```

---

## Setup and Installation

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   ```

2. **Build the projects**:
    - Use Maven to build the projects:
   ```bash
   mvn clean install
   ```

3. **Run the projects**:
    - For Spring Boot projects, use:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the applications**:
    - Once the Spring Boot applications are running, you can access them locally (usually at `http://localhost:8080` unless otherwise configured).

