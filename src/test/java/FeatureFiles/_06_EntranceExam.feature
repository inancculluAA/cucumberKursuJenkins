Feature: Datattable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and Delete Entrance Exam
    And Click on the element in the left Nav
      | EntranceExams      |
      | EntranceExamsSetup |
      | EntranceExams2     |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | Name | ahmetCountry8 |
    And Click on the element in the FormContent
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |
    And Click on the element in the Dialog
      | Save |
    And Success massage should be displayed
    And Click on the element in the left Nav
      | EntranceExams      |
      | EntranceExamsSetup |
      | EntranceExams2     |
    And User delete item from FormContent
      | ahmetCountry8 |
    And Success massage should be displayed
