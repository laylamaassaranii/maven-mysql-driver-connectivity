# maven-mysql-driver-connectivity
## JDBC connection to MySQL database

This Java project demonstrates how to use JDBC (Java Database Connectivity) to connect a standalone Java application to a MySQL database. It includes a simple JDBC code snippet that establishes a connection, and you can use it as a starting point for database interactions in your Java applications.

# Features
. JDBC connection to a MySQL database.
. Basic example illustrating connection setup, loading the driver, and handling exceptions.

# Steps
First, download the neccessary tools. In this case, download JDK - version 17.0.8, Apache Maven 3.9.6, MySQL connector driver (mysql-connector-j-8.1.0) necerssary to connect our application to our database.
Second, your Maven project using this command: mvn archetype:generate -DgroupId=com.example -DartifactId=jdbc-example -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
After creating the project, access the pom.xml file to change the dependencies into the ones corresponding our driver. 
<dependencies>
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.1.0</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
Then, after installing the necessary tools for MySQL (version 8.0.23), create a new database in the MySQL shell using the following commands:
// Switch to the SQL mode
\sql

// Create a database
CREATE DATABASE test;
Finally, compile the App.java file and execute the class using the following commands:
java -cp path/to/the/mysql/connector/file App.java
javac -cp path/to/the/mysql/connector/file; App
The message "Connected to the database!" should be shown, indicating a successful connection to the database.
