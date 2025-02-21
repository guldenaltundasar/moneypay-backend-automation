# API Test Automation Project
![backendAutomation](https://github.com/user-attachments/assets/46f13408-e3ce-4df5-90c0-f34a6642bc44)
## Overview
This project is a test automation suite developed for API testing. It utilizes Rest Assured for API testing, focusing on endpoint validation and response verification. The automation scripts are written in Java and use TestNG framework for test execution.

## Features
- API Status Verification
- Response Code Validation
- TestNG Reporting
- Modular Test Structure

## Prerequisites
- Java 11
- Maven
- Rest Assured
- TestNG

## Dependencies
The project uses Maven for dependency management. Key dependencies include:

- Rest Assured: For API testing
- TestNG: For test execution and reporting
- JSON Schema Validator: For response validation

## Installing and Running Tests
1. Clone the repository
2. Navigate to the project directory
3. Run tests using Maven: `mvn clean test`

## Project Structure

### Test Classes
- **MoneyPayBackendTests.java**: Contains API test scenarios
  - Base URI configuration
  - API status verification
  - Response code validation

## Test Scenarios
### API Status Verification
1. Send GET request to "/objects" endpoint
2. Verify response status code
3. Log test results based on status code:
   - 200: Test PASSED
   - 400: Test FAILED
   - Other: Unexpected Status Code


