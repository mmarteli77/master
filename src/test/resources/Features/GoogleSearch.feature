Feature: feature to test google search funcionality

  Scenario: Validate that google search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navegated to search results