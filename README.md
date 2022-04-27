# Boulder Apartment Finder

## Team Members
- Divya Sivani Pragadaraju
- Mukund Kalantri
- Shreyas Kapoor

## Java version
Java 17

The project aims to let users view details of the apartments and book the appointment to visit and have a tour. The user is also able to submit a review about the apartment. One the review is submitted, the stanford NLP library parses the review and generates rating using the sentiment analysis. The rating is stored in database and the rating of the apartment is dynamically updated.  


## Examples of different OOPS Patterns used

### MVC Pattern

The entire code is based on MVC pattern
 

### Singleton
The connection to database is based on the singleton pattern. During the course of the war file running, only one instance of database connection is made

### Strategy
The controller classed are based on the strategy pattern 


### Observer

We generate logs using the logger pattern. 

##How to run the code

###Prerequsites
You should have Java 17 downloaded. Along with that, you should have MySQL, Tomcat and macen downloaded. To check the data inside the databse, MySQL Workbench is required

Step 0 - Make sure you Mysql is running
<br/>
Step 1 - Create war file by running mvn clean install
<br/>
Step 2 - Place the war file in webapps folder of tomcat
<br/>
Step 4 - Rename the file from apartmentfinder-0.0.2-SNAPSHOT to apartmentfinder
<br/>
Step 5 - Run http:localhost:8080/apartmentfinder on chrome

