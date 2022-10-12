#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption      | GradeLevelOption |
#| Math exam is1   | academicPeriod2              | gradeLevel4  |
#| IT exam is1     | academicPeriod2              | gradeLevel2  |
#| Oracle exam is1 | academicPeriod2              | gradeLevel3  |
#| Math exam  is1  | academicPeriod2              | gradeLevel1  |


Feature: Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create and Delete Entrance Exam
    And Click on the element in the left Nav
      | EntranceExams      |
      | EntranceExamsSetup |
      | EntranceExams2     |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | Name | <ExamName> |
    And Click on the element in the FormContent
      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |
    And Click on the element in the Dialog
      | Save |
    And Success massage should be displayed
    And Click on the element in the left Nav
      | EntranceExams      |
      | EntranceExamsSetup |
      | EntranceExams2     |
    And User delete item from FormContent
      | <ExamName> |
    And Success massage should be displayed
    Examples:
      | ExamName              | AcademicPeriodOption | GradeLevelOption |
      | History exam murtaza  | academicPeriod1      | gradeLevel2      |
      | Math exam murtaza     | academicPeriod1      | gradeLevel2      |
      | Java exam murtaza     | academicPeriod1      | gradeLevel2      |
      | Science exam  murtaza | academicPeriod1      | gradeLevel2      |