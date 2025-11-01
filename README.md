🎵 Music Playlist – Spring Boot Project

📌 Project Overview
This is a Spring Boot-based web application that allows users to manage a list of songs — add, update, delete, and view their favorite music tracks.
The project demonstrates Spring Boot CRUD operations, REST API integration, and MySQL database connectivity.

🚀 Features
✅ Add new songs to the playlist
✅ View all songs
✅ Update song details
✅ Delete a song
✅ MySQL database integration
✅ REST API endpoints for song management
✅ Basic login authentication (future enhancement ready)

🧰 Tech Stack
Layer	Technology Used
Backend	Java, Spring Boot
Frontend	HTML, CSS (Thymeleaf)
Database	MySQL
Build Tool	Maven
IDE	Eclipse

⚙️ Installation & Setup
1. Clone the repository
git clone https://github.com/Vivacity5X/Music-Playlist-Spring-Boot-App.git
cd Music-Playlist-Spring-Boot-App

2. Configure MySQL

Create a database:
CREATE DATABASE musicdb;

Update your application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/musicdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

3. Run the application
In Eclipse: Right-click → Run As → Spring Boot App
Or using terminal:
mvn spring-boot:run

4. Access the app
Open browser and go to:
👉 http://localhost:8080/songs-list

🧩 REST API Endpoints

GET    	/songs          List all songs
POST	  /songs	        Add a new song
GET	    /songs/{id}	    View a specific song
PUT    	/songs/{id}	    Update a song
DELETE	/songs/{id}	    Delete a song

💡 Future Enhancements:
🔒 Add login & user authentication
🎧 Play songs using an embedded music player
📱 Responsive design for mobile
📊 Add analytics for most played songs

👤 Author
Name: Chaitanya Khandare
Roll No: RBT23CB019
Institute: JSPM's Rajarshi Shahu College of Engineering Pune
Email: chaitanykhandare789@gmail.com


©2025 [Chaitanya Khandare]. This project is created for educational purposes.
