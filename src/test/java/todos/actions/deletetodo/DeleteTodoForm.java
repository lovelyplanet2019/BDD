package todos.actions.deletetodo;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DeleteTodoForm {

//    static By NEW_TODO_FIELD = By.cssSelector(".new-todo");

    public static final Target ITEM_LABEL = Target.the("{0} item")
            .locatedBy("//li[contains(.,'{0}')]//label");

    public static final Target DELETE_BUTTON = Target.the("{0} delete button")
            .locatedBy("//li[contains(.,'{0}')]//button[@class='destroy']");


}
