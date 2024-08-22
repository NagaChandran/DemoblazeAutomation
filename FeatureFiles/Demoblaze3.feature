Feature: Navigate to Categories and Select Samsung Phone
  Scenario: User logs in, navigates to categories, and selects Samsung phone
    Given the user is on the Demoblaze login page
    When the user enters "username" and "password"
    And the user clicks on the login button
    Then the user should be logged in successfully
    When the user clicks on the categories link
    And the user selects "Phones"
    And the user clicks on "Samsung galaxy s6"
    Then the user should be redirected to the Samsung phone details page
