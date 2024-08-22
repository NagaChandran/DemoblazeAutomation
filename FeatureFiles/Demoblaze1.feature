Feature: Login to Demoblaze and Logout
  Scenario: User logs in and logs out
    Given the user is on the Demoblaze login page
    When the user clicks on the login button
    When the user enters username and password
    Then the user should be logged in successfully
    And the user clicks on the logout button
    Then the user should be logged out successfully
