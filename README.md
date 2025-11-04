# Spring Boot JPA CRUD Demo

This project is a simple "spoke" project, built to demonstrate a deep understanding of Spring Data JPA and REST controllers. It's a "drill-down" project for my main `spring-boot-blog-app`.

## Features

* A complete set of RESTful endpoints (CRUD) for a `Product` entity.
* Connected to a persistent H2 file-based database.
* Uses Spring Data JPA for all database operations.

## Technologies Used

* Java 17
* Spring Boot 3
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