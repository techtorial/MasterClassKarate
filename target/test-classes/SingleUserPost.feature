Feature: Single User Post Request

  Scenario: Validation Of Post Request
    Given url "https://reqres.in/"
    And path "api/users"
    * request read('Data/Body.json')
    And header Accept = 'application/json'
    When method post
    Then status 201
    * match $ == read('Data/Response.json')
    * def userId = 2
    Given url "https://reqres.in/api/users/"
    And path userId
    * method get
    Then status 200

    
    
    