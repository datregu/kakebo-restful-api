# Simple RESTful API with Spring Boot, JPA, MySQL

This is a basic RESTful API developed in Java using Spring Boot, JPA for persistence, and MySQL as the database. The API provides endpoints for basic CRUD (Create, Read, Update, Delete) operations on a specific data model. It was done with the idea of using it in the future for a Kakebo Web App I'm developing.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Postman (for testing)

## Project Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/your-repository.git
   cd your-repository

2. **Configure the database:**
   - Create a MySQL databse name `your_databse_name`
   - Update the database configuration in `src/main/resources/application.properties` with your MySQL username and password.

3. **Run the app:**
    ```bash
   /mvnw spring-boot:run

5. **Test the API:**
   - You can use Postman or your software of choice to make requests to the API's endpoints.

## Things I Learned

Throughout the development of this simple RESTful API project, I gained valuable experience and insights. Here are some key takeaways:

1. **Spring Boot Basics:**
   - Learned how to use Spring Boot to quickly set up a Java-based web application.
   - Explored the fundamentals of dependency injection and configuration in a Spring Boot project.

2. **JPA and Database Integration:**
   - Implemented data persistence using Spring Data JPA, making it easier to interact with the underlying database.
   - Configured MySQL as the database backend and established a connection between the application and the database.

3. **RESTful API Design:**
   - Designed and implemented RESTful API endpoints for CRUD operations.
   - Explored best practices for structuring API routes and handling HTTP methods.

4. **Postman Testing:**
   - Utilized Postman for testing API endpoints, validating functionality, and ensuring proper request and response handling.

5. **Project Setup and Configuration:**
   - Set up a Git repository for version control and learned the basics of cloning and configuring a project.
   - Configured the application properties for the MySQL database connection.

6. **Future Application Use:**
   - Developed the API with the intention of integrating it into a Kakebo Web App in the future.
  
## Future Implementations
1. **Documentation:**
   - Introduce a comprehensive documentation feature within the application.

2. **Monthly Reports:**
   - Implement a feature to generate monthly reports summarizing financial activities and providing insights into spending habits.
     
3. **Group by Categories**
   - Enhance the categorization system by introducing a "Group by Categories" feature.

