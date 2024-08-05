### Student Grades CRUD Application

### Technologies Used:
- Spring Boot
- JSP (JavaServer Pages)
- Spring Data JPA

### Project Description:
• This CRUD (Create, Read, Update, Delete) web application allows users to manage student grades. 
• It is built using Spring Boot for backend operations, JSP for the user interface, and Spring Data JPA for database connectivity and DAO (Data Access Object) operations.

### Setup Instructions:
1. **Prerequisites:**
   - Java Development Kit (JDK) version 17 or higher
   - Maven

2. **Installation:**
   - Clone the repository: `git clone https://github.com/mohamed-khaja/Spring-boot-Crud.git`

3. **Running the Application:**
   - Build the project: `mvn clean package` (if using Maven)
   - Run the application: `java -jar target/your-application.jar` (replace with your application's JAR file)

### Usage:
1. Access the application at `http://localhost:8090`.
2. Use the interface to perform CRUD operations on student grades.

### Folder Structure:
- **src/main/java:** Backend Java files
- **src/main/resources:** Configuration files and static resources
- **src/main/webapp/views:** JSP files for UI

---
### Significant changes:
1. Added spring-data-jpa dependency
2. Create interface that extends JpaRepository interface 
3. Configure the spring.jpa.hibernate.ddl-auto:update // to enable hibernate to do ddl operation
3. Tag the model class as @Entity // to mark the model class for mapping
4. Tag any one variable as @Id // It denotes the Primary key for table, each @Entity must have one 