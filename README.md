# Uber-like Application - Backend

## Overview
This project is a backend implementation of an Uber-like application that allows users to request transportation services similar to Uber. The goal is to simplify the transportation process, reduce interaction with the driver, and ensure faster, more consistent, and safer transportation for users.

The application caters to four types of users:
- **Unregistered Users**
- **Registered Users**
- **Drivers**
- **Administrators**

## Tech Stack
- **Java**
- **Spring Boot**
- **H2 Database**

## Features

### Unregistered Users
- View basic information about the application.
- Enter pickup and drop-off locations to get estimated time and cost for transportation.

### Registered Users
- Request rides.
- Receive real-time notifications about ride status.
- Track vehicles on the map.
- Rate drivers and vehicles after the ride.
- Access ride history.
- Schedule future rides to prioritize during peak hours.
- Define favorite routes for quick selection.
- Use the **PANIC** button during a ride to alert the dispatcher of any issues.
- Update profile information.
- Contact support for assistance.

### Drivers
- Automatically assigned rides by the system with pickup and drop-off locations.
- Edit their profile.
- View ride history and generate ride reports.
- Access the **PANIC** button.
- Manually switch availability status.
- Drivers are automatically marked unavailable after exceeding 8 working hours in a day.

### Administrators
- Create and manage driver accounts.
- View ride status and details of any driver.
- Access driver history and generate reports.
- Block users and drivers.
- Respond to **PANIC** notifications.
- Provide 24/7 live chat support.

## Setup Instructions

### Prerequisites
- Java 11 or later
- Maven
- IDE (e.g., IntelliJ IDEA)

### Steps to Run the Application

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/uber-like-app.git
    ```
2. Navigate to the project directory:
    ```bash
    cd uber-like-app
    ```
3. Build the project using Maven:
    ```bash
    mvn clean install
    ```
4. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```
5. Access the application:
    - The application will run locally at `http://localhost:8080`.
    - Use **H2 Database** at `http://localhost:8080/h2-console` for viewing the database. The default credentials can be found in the `application.properties` file.

## Database
- **H2** in-memory database is used for simplicity and quick prototyping.
- To switch to another database (e.g., MySQL, PostgreSQL), update the database configurations in the `application.properties` file.

## Future Enhancements
- Integration with a real-time map service for vehicle tracking.
- Payment gateway integration for handling transactions.
- Support for multi-language and localization.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.



<img width="1033" alt="image" src="https://github.com/user-attachments/assets/e281a051-375a-4f3e-8fd2-2e604236cb62">
