# Spring boot profile example

This is a sample spring-boot project to demonstrate using different profiles with spring boot.

Blog post: https://www.rajith.me/2021/05/spring-boot-profiles-separate-your-prod.html

## Requirements
* Java 8
* Apache Maven 3.5.0 or higher

## How to Run

- Clone the project
- Build the project
```
mvn clean install
```
- Run the application as prod 
```
java -jar target/profiles-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
```
- Run the application as dev
```
java -jar target/profiles-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
```