# Practice Spring Boot APIs 8 – Database Integration using Spring Data JPA

## Project Overview

This project demonstrates the integration of a Spring Boot application with a MySQL database using Spring Data JPA and Hibernate.

The application provides RESTful CRUD APIs for managing Employees, Campaigns, and Vehicles while ensuring data persistence through MySQL.

The project also includes entity relationships, input validation, API testing using Postman, and database verification through MySQL Workbench.

---

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Jakarta Validation
* Postman
* IntelliJ IDEA

---

## Project Features

### Employee Management

* Add Employee
* Get All Employees
* Get Employee By ID
* Update Employee
* Delete Employee

### Campaign Management

* Add Campaign
* Get All Campaigns
* Get Campaign By ID
* Update Campaign
* Delete Campaign

### Vehicle Management

* Add Vehicle
* Get All Vehicles
* Get Vehicle By ID
* Update Vehicle
* Delete Vehicle

---

## Database Design

| Entity   | Main Fields                                |
| -------- | ------------------------------------------ |
| Employee | id, name, department                       |
| Campaign | campaignId, campaignName, platform, budget |
| Vehicle  | vehicleId, vehicleModel, rentalPricePerDay |

---

## Entity Relationship

### Employee → Campaign

The project implements a One-to-Many relationship between Employee and Campaign.

```java
@OneToMany(mappedBy = "employee")
private List<Campaign> campaigns;
```

```java
@ManyToOne
private Employee employee;
```

### Relationship Description

* One Employee can manage multiple Campaigns.
* Each Campaign belongs to one Employee.

---

## Validation

Input validation was implemented using Jakarta Validation annotations.

### Validation Annotations Used

```java
@NotBlank
@NotNull
@Positive
```

### Validation Examples

* Employee name cannot be empty.
* Campaign name cannot be empty.
* Budget must be greater than zero.
* Rental price must be greater than zero.

---

## REST API Endpoints

### Employee APIs

| Method | Endpoint              |
| ------ | --------------------- |
| POST   | /employee/add         |
| GET    | /employee/getAll      |
| GET    | /employee/{id}        |
| PUT    | /employee/update/{id} |
| DELETE | /employee/delete/{id} |

### Campaign APIs

| Method | Endpoint              |
| ------ | --------------------- |
| POST   | /campaign/add         |
| GET    | /campaign/getAll      |
| GET    | /campaign/{id}        |
| PUT    | /campaign/update/{id} |
| DELETE | /campaign/delete/{id} |

### Vehicle APIs

| Method | Endpoint             |
| ------ | -------------------- |
| POST   | /vehicle/add         |
| GET    | /vehicle/getAll      |
| GET    | /vehicle/{id}        |
| PUT    | /vehicle/update/{id} |
| DELETE | /vehicle/delete/{id} |

---

## API Testing

All endpoints were tested successfully using Postman.

The following operations were verified:

* Create
* Read
* Update
* Delete

Validation testing was also performed to ensure proper error handling for invalid requests.

---

## Database Verification

Data persistence was verified using MySQL Workbench.

The database stores:

* Employees
* Campaigns
* Vehicles
* Foreign Key Relationship between Employee and Campaign

---

## Project Structure

```text
src/main/java
│
├── controllers
├── entities
├── repositories
├── services
│
└── SpringbootApis8Application
```

---

## Documentation

The repository includes:

* Project Source Code
* Validation Testing Screenshots
* MySQL Database Screenshots
* Project Documentation PDF - API Testing Screenshots

