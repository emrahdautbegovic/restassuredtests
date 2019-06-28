Feature: Symphony RESTful API test
  Scenario: Get countries
    When I send get countries request
    Then Afganistan is the first country in a row