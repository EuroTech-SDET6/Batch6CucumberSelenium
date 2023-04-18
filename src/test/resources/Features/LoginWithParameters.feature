Feature: Login as different users


  Scenario: Login as student with parameters
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!" credentials
    Then The user should be able to login
    Then The welcome message contains "Teacher"





