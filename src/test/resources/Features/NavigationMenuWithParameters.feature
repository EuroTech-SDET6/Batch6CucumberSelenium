Feature: Navigate Menu with parameters


  Scenario: Navigates Developer Menu
    Given The user is on the login page
    When  The user logs in using "eurotech@gmail.com" and "Test12345!" credentials
    Then  The welcome message contains "Teacher"
    And   The user navigates to "Developers" Menu
    Then  The user should be able to see header as "Filter Profiles by Skill or by Location"


    Scenario: Navigates Posts Menu
      Given The user is on the login page
      When  The user logs in using "eurotech@gmail.com" and "Test12345!" credentials
      Then  The welcome message contains "Teacher"
      And   The user navigates to "All Posts" Menu
      Then  The user should be able to see header as "Posts"

    @wip
  Scenario: Navigates My Account Menu
    Given The user is on the login page
    When  The user logs in using "eurotech@gmail.com" and "Test12345!" credentials
    Then  The welcome message contains "Teacher"
    And   The user navigates to "My Account" Menu
    Then  The user should be able to see header as "Dashboard"

