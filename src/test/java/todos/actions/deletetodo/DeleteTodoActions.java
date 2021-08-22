package todos.actions.deletetodo;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import todos.actions.todolist.TodoList;


public class DeleteTodoActions extends UIInteractionSteps {

    @Step("Delete todo item called {0}")
    public void itemCalled(String deleteTodo) {
            $(TodoList.deleteItemCheckboxFor(deleteTodo)).click();
    }


}
