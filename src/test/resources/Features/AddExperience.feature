Feature: Add experience positive tests

  @wip
  Scenario: Add experience positive test 1
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!" credentials
    Then The user should be able to login
    Then The welcome message contains "Teacher"
    When The user clicks "Add Experience"
    Then The user should land on Add An Experience page
    And The user fills "Job Title" field as "QA Test Engineer"
    And The user fills "Company" field as "Oracle"
    And The user fills "Location" field as "New York"