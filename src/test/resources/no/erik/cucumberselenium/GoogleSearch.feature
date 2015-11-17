Feature: Search on Google
  As an user
  I want to search on Google
  So that I can see results

  Scenario: results are shown
    Given i open "http://www.google.com"
    When i search for "cucumber is awesome"
    Then the browser title should contain "cucumber is awesome"