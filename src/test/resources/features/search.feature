Feature: Search in google

  Scenario: Look for twitter any search
    Given user is in google page
    When user inputs twitter in search field
    And user press enter key
    Then first result should contain "Twitter"

  Scenario: Look for facebook any search
    Given user is in google page
    When user inputs facebook in search field
    And user press enter key
    Then first result should contain "Facebook"