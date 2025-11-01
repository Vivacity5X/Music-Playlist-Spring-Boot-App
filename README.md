# 🎵 Music Playlist — Spring Boot CRUD Application

A Spring Boot CRUD + JPA Music Playlist project that lets users add, view, update and delete songs. Built for learning and demonstration of Spring Boot, Spring Data JPA, Thymeleaf and MySQL.

## Table of contents
- Project overview
- Features
- Tech stack
- Prerequisites
- Installation
- Configuration
- Running the app
- REST API
- UI usage
- Build & packaging
- Docker (optional)
- Tests
- Contributing
- Author & license

## Project overview
This project is a simple music playlist manager. Users can maintain a list of songs with metadata (title, artist, duration). The app demonstrates:

- Spring Boot web application structure
- Spring Data JPA with MySQL
- Thymeleaf-based UI
- RESTful controllers for CRUD operations

## Features
- Create, read, update and delete songs (CRUD)
- List songs in a simple UI
- REST API endpoints for programmatic access
- MySQL integration via Spring Data JPA/Hibernate
- Basic front-end using Thymeleaf, HTML, and CSS

## Tech stack
- Java (11+ recommended)
- Spring Boot
- Spring Data JPA (Hibernate)
- Thymeleaf (HTML/CSS)
- MySQL
- Maven (build tool)

## Prerequisites
- Java 11 or newer
- Maven 3.6+
- MySQL server (or use Docker)

## Installation

1. Clone the repository
```
 git clone https://github.com/Vivacity5X/Music-Playlist-Spring-Boot-App.git
 cd Music-Playlist-Spring-Boot-App
```

2. Create the MySQL database
```
 CREATE DATABASE musicdb;
```

3. Configure application properties
Open src/main/resources/application.properties (or application.yml) and set your DB credentials:
```
 spring.datasource.url=jdbc:mysql://localhost:3306/musicdb
 spring.datasource.username=root
 spring.datasource.password=yourpassword
 spring.jpa.hibernate.ddl-auto=update
 spring.jpa.show-sql=true
```
Optional: change server.port, logging levels, or other Spring properties as needed.

## Running the application

- From your IDE (Eclipse/IntelliJ): run the main application class (Spring Boot App).
- From the command line:
```
 mvn clean spring-boot:run
```
Or build and run the jar:
```
 mvn clean package
 java -jar target/*.jar
```

Open your browser:
http://localhost:8080/songs-list

## REST API

Base URL: http://localhost:8080

Common endpoints:
- GET /songs — List all songs
- POST /songs — Add a new song
- GET /songs/{id} — View a specific song
- PUT /songs/{id} — Update a song
- DELETE /songs/{id} — Delete a song

Example: list songs
```bash
 curl http://localhost:8080/songs
```


## UI usage
- Visit /songs-list to see the playlist.
- Use "Add Song" (or similar) to create a new record.
- Use "Edit" and "Delete" actions available on each row to modify or remove songs.

## Build & packaging
Generate an executable jar:
```
 mvn clean package
```
Run the jar:
```
 java -jar target/music-playlist-*.jar
```


## Author
Chaitanya Khandare
Roll No: RBT23CB019
JSPM's Rajarshi Shahu College of Engineering, Pune
Email: chaitanykhandare789@gmail.com

## License
This project is provided for educational purposes.
