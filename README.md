# Randova
### Random data made easy
<p align="left">
  <img src="https://img.shields.io/badge/Java-21-ED8B00?style=flat&logo=openjdk&logoColor=white" alt="Java 21"/>
  <img src="https://img.shields.io/badge/Spring_Boot-3.5-6DB33F?style=flat&logo=spring-boot&logoColor=white" alt="Spring Boot 3.5"/>
  <img src="https://img.shields.io/badge/Thymeleaf-template-green?style=flat&logo=thymeleaf&logoColor=white" alt="Thymeleaf"/>
  <img src="https://img.shields.io/badge/Maven-Build-CA4245?style=flat&logo=apache-maven&logoColor=white" alt="Maven"/>
  <img src="https://img.shields.io/badge/Deployed_on-Render-0077CC?style=flat&logo=render&logoColor=white" alt="Render"/>

</p>
Randova allows you to quickly get and generate random data such as names, email addresses, phone numbers, passwords, and countries. It's perfect for testing, demos or any situation where you need sample data quickly.

## Features
- Generates multiple types of random data
- Simple web interface that allows to copy data by clicking
- Passwords are cryptographically secure

## Access
You can access the deployed app here:
https://randova-zmia.onrender.com/generated-random-data

## Getting Started
To run the development server locally:
```
mvn clean install  
mvn spring-boot:run  
```
Open http://localhost:8080/generated-random-data with your browser to see the results

## Deployment
The app is deployed on Render using their free tier
> Note: The app “sleeps” after inactivity, so the first request after sleep may be slow to respond.
