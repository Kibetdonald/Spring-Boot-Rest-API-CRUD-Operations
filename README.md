# Spring-Boot-Rest-API-CRUD-Operations
 > Created a spring boot endpoints

## Step by step Process
1. Project set up in https://start.spring.io/ together with the following dependencies: i.e 
  - Spring web, Spring data JPA and Postgress Driver
2. Configuring spring datasource
  > Syntax
  
    ```
    spring.datasource.url=jdbc:postgresql://localhost:5432/amigoscode
    spring.datasource.username=
    spring.datasource.password=
    spring.jpa.hibernate.ddl-auto=create-drop
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
    spring.jpa.properties.hibernate.format_sql=true
    ```
 3. Created a todo model package in the root project package. In the package I created a class that will contain the fields, and a lombok that will generate the  Getters/Setters, Constructors
 4. In the todo model package i also created an enum with complete and pending fields.
 5. Created a repository package and within it created an interface that extends CrudRepository.
The repository interface takes in the model and the type of Id. For instance, in our case model is todo
and Id type is Long. 
 6. Created a service package and inside I created a service class and a service interface.
 7. Created controller package and inside i created the controller class.
I then annotated the class with @RestController which marks the class as a controller that can 
process incoming HTTP Requests. 
Also added the following annotations:
 
    1. @Request Mapping.
    2. @GetMapping
    3. @PostMapping
    4. @PutMapping
    5. @DeleteMapping


