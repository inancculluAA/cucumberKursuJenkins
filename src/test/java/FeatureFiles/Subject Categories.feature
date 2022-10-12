Feature: Subject Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Add Subject Categories,Edit Subject Categories and Delete Subject Categories
    And Click on the element in the left Nav1
      | Education         |
      | EducationSetup    |
      | SubjectCategories |
    And Click on the element in the Dialog1
      | addButton |
    And User sending the keys in Dialog content1
      | nameInput | group11 |
      | codeInput | group11 |
    And Click on the element in the Dialog1
      | saveButton |
    And Success massage should be displayed1
    And User edit item from Dialog
      | group11 |
    And User sending the keys in Dialog content1
      | codeInput | group |
    And Click on the element in the Dialog1
      | saveButton |
    And Success massage should be displayed1
    And User delete item from Dialog1
      | group11 |
    And Success massage should be displayed1

