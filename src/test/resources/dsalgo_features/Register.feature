@Register
Feature: Testing Register Page functionality in dsportalapp.herokuapp.

    Scenario: The user launches home page of DSAlgo Project
    Given The User navigates DSAlgo portal with url 
     When User clicks on "Register" button
    Then User should be navigated to Register page


  @TS_Register_Invalid

Feature: Testing Register Page functionality in dsportalapp.herokuapp.

    Scenario Outline: The user Registers with invalid Details
    Given The user opens Register Page
    When The user enters  "<UserName>" and "<Password>" and "<Passwordconfirmation>"
    Then The user should be able to see the error msg "<Errormsg>"

    Examples: 
      | username     | password       | passwordconfirmation | Errormsg                                                    
      |              |                |                      | UserName cannot be blank     |
      |              | veena@12       |  veena@12            | UserName cannot be blank     |
      | vidya        |                |                      | Passwords cannot be blank    |
      | vidya        | veena@12       |                      | password confirmation cannot be blank |
      | veena*2$     | veena@12       | veena@12             | characters other than Letters, digits and "@/./+/-/_" are not allowed   