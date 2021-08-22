Feature: Add new todo items
  As a working adult with busy schedules
  I want to use todo app to add todo items

  Background:
    Given my todo list is empty

  Scenario: Add todo items
    Given my todo list is empty
    When I add "First todo item #1"
    Then my todo list should has followings:
      | First todo item #1|
    And the remaining item count is displayed as "1 item left"
    When I add "Next todo item #2"
    Then my todo list should has followings:
      | Next todo item #2 |
      | First todo item #1 |
    And the remaining item count is displayed as "2 items left"