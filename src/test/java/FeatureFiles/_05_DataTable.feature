Feature: Datattable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Country
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | Countries  |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | Name | ahmetCountry2 |
      | Code | 123123        |
    And Click on the element in the Dialog
      | Save |
    And Success massage should be displayed
    And User delete item from Dialog
      | ahmetCountry2 |
    And Success massage should be displayed


  Scenario: Create a Nationality
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | nationalities |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | Name | ahmetCountry2 |
    And Click on the element in the Dialog
      | Save |
    And Success massage should be displayed
    And User delete item from Dialog
      | ahmetCountry2 |
    And Success massage should be displayed


  Scenario: Create a Fee, delete Fee
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | Fees       |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | Name            | ahmetFee1 |
      | Code            | 123123    |
      | integrationCode | 123123    |
      | priority        | 123112323 |
    And Click on the element in the Dialog
      | Save |
    And Success massage should be displayed

    And User delete item from Dialog
      | ahmetFee1 |

    And Success massage should be displayed











