Feature: Add new todo items

  As a working adult with busy schedules
  I want to be able to track the tasks that I need to do
  So that I can manage them well

  Scenario Outline: Add more new items to the todo list

    Given my todo list is empty
    When I add "<todo-list>"
    Then the remaining item count is displayed as "<nr-of-todos>"


    Examples:
      | todo-list                                             |  nr-of-todos |
      | Buy some cookies, Walk the dog, Buy some cereal       |  1 item left  |
      | Smile more often, Drink more water, Eat a banana      |  2 items left |
      | Sprint retrospective starts 2pm, Tech talk starts 6pm |  3 items left |
