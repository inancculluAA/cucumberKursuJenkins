#  Employee menusu için Create-Exist-Delete bölümleri olan Senaryoyu yazınız
#  Daha sonra aynı senaryoru 5 farklı degerler için çalıştırınız.

Feature: Employee Functionality

  Background: Login Website
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create and Delete Employee
    And Click on the element in the left Nav
      | HumanResources |
      | Employees      |

    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | firstname       | <FeeName>  |
      | lastname        | <FeeCode>  |
      | integrationCode | <intCode>  |
      | priority        | <priority> |
    And Click on the element in the Dialog
      | Save |
    And Success massage should be displayed
    And User delete item from Dialog
      | <FeeName> |
    And Success massage should be displayed
    Examples:
      | FeeName     | FeeCode   | intCode | priority |
      | ahmetfee15  | 121231233 | 1234    | 101020   |
      | mehmetfee15 | 11515     | 1555444 | 111122   |