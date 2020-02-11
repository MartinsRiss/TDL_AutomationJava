Feature: Shopping list

  Background: open application
    Given I check landing screen

  Scenario: Add shopping list
    When I click on add shopping list
    And I type "First List"
    And I click on add list
    Then I see new list "First List" on landing screen


  Scenario: Delete shopping list
    When I click on add shopping list
    And I type "First List"
    And I click on add list
    Then I see new list "First List" on landing screen
    When I open the shopping list
    When I remove the list "First List"
    Then I check there is no "First List"


