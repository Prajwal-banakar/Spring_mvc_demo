# Spring MVC Find Doctors Online

This is a Spring MVC application that allows users to search for doctors.

## Database Setup

Before running the application, you need to set up the MySQL database.

1.  **Create the database:**
    ```sql
    CREATE DATABASE spring;
    ```

2.  **Use the database:**
    ```sql
    USE spring;
    ```

3.  **Create the `doctors` table:**
    ```sql
    CREATE TABLE doctors (
        id INT NOT NULL AUTO_INCREMENT,
        name VARCHAR(255) NOT NULL,
        specialty VARCHAR(255) NOT NULL,
        PRIMARY KEY (id)
    );
    ```

4.  **Insert some sample data (optional):**
    ```sql
    INSERT INTO doctors (name, specialty) VALUES ('Dr. John Doe', 'Cardiologist');
    INSERT INTO doctors (name, specialty) VALUES ('Dr. Jane Smith', 'Dermatologist');
    ```

## Running the application

Once the database is set up, you can run the application using Maven.

1.  **Build the project:**
    ```bash
    mvn clean install
    ```

2.  **Run the application:**
    You can deploy the generated WAR file to a servlet container like Tomcat.
