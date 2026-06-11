# Practice Spring Boot APIs 8 - Database Integration

## Project Overview
This project demonstrates the integration of a Spring Boot application with MySQL using Spring Data JPA.

The application provides RESTful CRUD APIs for managing:

- Employees
- Campaigns
- Vehicles

All data is persisted in a MySQL database and managed through JPA repositories.

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Hibernate
- Maven
- Postman
- Validation API

---

## Features

### Employee APIs
- Add Employee
- Get All Employees
- Get Employee By ID
- Update Employee
- Delete Employee

### Campaign APIs
- Add Campaign
- Get All Campaigns
- Get Campaign By ID
- Update Campaign
- Delete Campaign

### Vehicle APIs
- Add Vehicle
- Get All Vehicles
- Get Vehicle By ID
- Update Vehicle
- Delete Vehicle

---

## Database Integration

The application is connected to MySQL using Spring Data JPA.

Entity relationships were implemented using:

- @OneToMany
- @ManyToOne

Example:
- One Employee can manage multiple Campaigns.

---

## Validation

Validation was implemented using Jakarta Validation:

- @NotBlank
- @NotNull
- @Positive

Examples:
- Campaign name cannot be empty.
- Budget must be greater than zero.
- Vehicle rental price must be greater than zero.

---

## Project Structure

src/main/java

- controllers
- entities
- repositories
- services

---

## Testing

All endpoints were tested using Postman.

The following operations were verified:

- Create
- Read
- Update
- Delete

All changes were successfully persisted in MySQL.
