package todos.actions.clearcompleted;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import todos.actions.todolist.TodoList;

public class ClearCompleteActions extends UIInteractionSteps {
    @Step("clear completed todo list {0}")
    public void itemCalled(String clearComplete) {
        $(TodoList.clearCompleteButton(clearComplete)).click();

    }
}
