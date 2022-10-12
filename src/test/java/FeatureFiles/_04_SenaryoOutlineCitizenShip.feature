Feature: Citizenship with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship page

    Scenario Outline: Citizenship create
      When User a Citizenship name as "<CitizenshipName>" shortname as "<ShortName>"
      Then Success massage should be displayed

      When User a Citizenship name as "<CitizenshipName>" shortname as "<ShortName>"
      Then Already exist massage should be displayed
      And Click on close button

      When User delete the "<CitizenshipName>"
      Then Success massage should be displayed



      Examples:
        | CitizenshipName | ShortName |
        | vavaaa1 | vavavav123 |
        | vavaa2 | vavavav124 |


