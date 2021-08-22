Feature: complete todo item

  As a working adult with busy schedules
  I want to use todo app to mark todo item as completed after I finished the task
  I also want to filter the todo list by "Completed" status

  Scenario: Complete todo item and filter Active and All todo
    Given my todo list is empty
    When I add "First todo item #1"
    Then my todo list should has followings:
      | First todo item #1|
    When I complete "First todo item #1"
    Then the todo item called "First todo item #1" should be marked as completed
    And the remaining item count is displayed as "0 items left"
    And I filter the list to show Completed tasks
    Then my todo list should has followings:
      | First todo item #1 |
    And I filter the list to show Active tasks
    And the remaining item count is displayed as "0 items left"
    And I filter the list to show All tasks
    And the remaining item count is displayed as "0 items left"
