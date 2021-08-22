Feature: filter todo item

  As a working adult with busy schedules
  I want to use todo app to filter todo item
  so that I can check todo item by status

  Scenario Outline: Filter todo item
    Given my todo list is empty
    When I add "<Item Displayed>"
    And I complete "First todo item #1"
    Then I filter the list to show <Filter> tasks
    And my todo list should has followings:
      | <Item Displayed> |


    Examples:
      | Filter    | Item Displayed     |
      | Completed | First todo item #1 |
      | Active    | next todo item #2  |

