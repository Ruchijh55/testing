Feature: login functionality test

  Scenario: check login
    Given user on login page
    When user enter username and password
    And clicks on login button
    Then user navigated to homepage

    Scenario: check login
      Given user on login page
      When user enter username and password
      And clicks on login button
      Then error displayed