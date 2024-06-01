# FanCodeCityTodoAssignment

This project automates the process of checking if users from the city `FanCode` have more than half of their todo tasks completed. The `FanCode` city is identified by latitudes between (-40 to 5) and longitudes between (5 to 100).


## Prerequisites

- Java 8 or 17
- Maven
- An IDE (IntelliJ IDEA, Eclipse, etc.)

## Setting Up the Project


### Step 1: Download or clone the project.

### Step 2:
1. Download and extract the downloaded ZIP file and clone the extract file.
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

### Step 3: Update `pom.xml` File

Make sure your `pom.xml` file includes the necessary dependencies:
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
 
  
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>

### Step 4: Access the Endpoint
Open your web browser or use a tool like Postman.
Access the endpoint: http://localhost:8080/check-fancode-users.
