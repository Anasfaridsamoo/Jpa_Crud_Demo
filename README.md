# Spring Boot JPA CRUD Demo

This project is a simple "spoke" project, built to demonstrate a deep understanding of Spring Data JPA and REST controllers. It's a "drill-down" project for my main `spring-boot-blog-app`.

## Features

* A complete set of RESTful endpoints (CRUD) for a `Product` entity.
* Connected to a persistent H2 file-based database.
* Uses Spring Data JPA for all database operations.

## Technologies Used

* Java 25
* Spring Boot 6
* Spring Data JPA
* H2 (File-based) Database
* Maven

## API Endpoints

Here are the endpoints you can test using Postman:

**Create a Product**
* `POST /products`

**Get All Products**
* `GET /products`

**Get One Product by ID**
* `GET /products/{id}`

**Update a Product**
* `PUT /products/{id}`

**Delete a Product**
* `DELETE /products/{id}`

## How to Check H2 Database
You can access the H2 database console at: `http://localhost:8080/h2-console`
<img width="715" height="685" alt="Screenshot 2025-11-03 180742" src="https://github.com/user-attachments/assets/2f4495b0-7a70-426e-8771-09bf5176a646" />
<img width="1307" height="542" alt="Screenshot 2025-11-03 181011" src="https://github.com/user-attachments/assets/3b03c8bf-223c-4091-9aa1-39fec36133bc" />
