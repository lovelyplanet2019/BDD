package todos.stepdefinitions;

import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import todos.actions.addtodo.AddNewTodoActions;
import todos.actions.filter.FilterItemsActions;
import todos.actions.completetodos.CompleteTodoActions;
import todos.actions.layout.LayoutQuestions;
import todos.actions.navigate.NavigateActions;
import todos.actions.todolist.TodoListActions;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {

    @Steps
    AddNewTodoActions addTodo;


    @Steps
    TodoListActions todoItems;

    @Steps
    NavigateActions navigate;

    @Steps
    LayoutQuestions pageLayout;

    @Given("(.*) opens the Todo Application")
    public void launch_app(String actor) {
        navigate.toTheTodoMVCApplication();
    }

    @Then("I should see the credits in the footer")
    public void footer() {
        assertThat(pageLayout.footer()).contains("TodoMVC");
    }


    @Given("(?:.*) todo list is empty")
    public void fresh_todo() {
        navigate.toTheTodoMVCApplication();
    }

    @When("I add {string}")
    public void i_add(String todoItem) {
        addTodo.itemCalled(todoItem);
    }


    @Then("(?:.*) todo list should has followings:")
    public void todo_list_should_has_followings(List<String> expectedItems) {
        assertThat(todoItems.currentItems()).containsAll(expectedItems);
    }

    @And("the remaining item count is displayed as {string}")
    public void remaining_item_count_displayed(String remainingItemCountText) {
        assertThat(todoItems.numberOfItemsLeftMessage()).isEqualTo(remainingItemCountText);
    }


    @Given("I have a todo list containing")
    public void has_a_list_containing(List<String> expectedItems) {
        navigate.toTheTodoMVCApplication();
        addTodo.itemsCalled(expectedItems);
    }

    @Steps
    FilterItemsActions filterItems;

    @When("I filter the list to show {word} tasks")
    public void filtersBy(String filters) {
        filterItems.by(filters);
    }

    @Steps
    CompleteTodoActions completeTodo;

    @When("I complete {string}")
    public void complete(String completedTodo) {
        completeTodo.itemCalled(completedTodo);
    }

    @Then("the todo item called {string} should be marked as completed")
    public void theTodoItemCalledShouldBeMarkedAsCompleted(String todoItem) {
        assertThat(completeTodo.isCompleted(todoItem)).isTrue();
    }

//    @Steps
//    ClearCompleteActions clearComplete;
//
//    @When("I clear completed todo {string}")
//    public void clearComplete(String clearComplete) {
//        clearComplete.itemCalled(clearComplete);
//    }

//    @Steps
//    DeleteTodoActions deleteTodo;
//
//    @When("I delete {string}")
//    public void delete(String deleteTodo) {
//        deleteTodo.itemCalled(deleteTodo);
//    }
}
