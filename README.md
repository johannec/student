# Student
A spring boot application using postgreSQL and java 11. 
The project is used for learning purposes of how to build and structure an application.

## Tech stack:
- Java 11
- PostgreSQL
- Spring boot
   
## Setup:
In the terminal:
Start psql locally and enter the psql CLI
```Bash
psql -h localhost
```
Create the student database instance
```Bash
CREATE DATABASE student
```
Grant yourself all privileges to the database
```Bash
GRANT ALL PRIVILEGES ON DATABASE "student" TO [insert your local username]
```
Get an overview over the current roles and permissions in the different postgreSQL databases
```Bash
\l
```
Connecting to the student database
```Bash
\c student
```
Run the project
- The @Table annotations should come into effect, and tell the database how to map student

Get an overview over the current scheme in the student db
```Bash
7. select * from student;   
```
- This can also be viewed on this URL when the server is running: http://localhost:8080/api/v1/student


### Recommended tools for testing:
- ####PostgreSQL
  ```bash
      brew install postgresql
      brew services restart postgresql
  ```
- ####Postman
    - To use and test the different API calls:
        - GET: http://localhost:8080/api/v1/student
            - Getting all students
        - POST: http://localhost:8080/api/v1/student
            - Needs a student payload to be sent with the call
        - DELETE: http://localhost:8080/api/v1/student/1
            - 1 is the ID of the student to be deleted
        - PUT: http://localhost:8080/api/v1/student/1?name=Johan&email=johan-d@gmail.com
            - This call requires a name and email to be available update parameters
  #### PGAdmin - to see the database changes live instead of having to use the terminal and querying every time.
  - IntelliJ Ultimate has this functionality build in.