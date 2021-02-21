Feature: Single User Api Testing

  Scenario: Validation of single user
    Given url "https://reqres.in/api/users/2"
    When method get
    Then status 200
    * match $ == read('Data/User.json')
    * assert response.data.email == 'janet.weaver@reqres.in'
    * assert responseStatus == 200 || responseStatus == 201
    * assert responseTime < 400
    * match response.data.first_name == "#string"