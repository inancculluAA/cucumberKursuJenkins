Feature: Country Multi Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page


#  @Regression
  Scenario: Create a country

    When Create a country
    Then Success massage should be displayed

#  @SmokeTest
  Scenario: Create a country parameter data

    When Create a country Name as "inanc" Code as "code23445"
    Then Success massage should be displayed
