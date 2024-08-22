Feature: Login to Demoblaze and Go to Cart
  Scenario: User logs in and navigates to the cart
    Given the user is on the Demoblaze login page
    When the user clicks on the login button
    When the user enters username and password
    Then the user should be logged in successfully
    And the user clicks on the cart link
    Then the user should be redirected to the cart page
