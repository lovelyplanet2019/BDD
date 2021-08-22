package todos.actions.todolist;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class TodoList {
    static By TODO_ITEMS = By.cssSelector(".todo-list label");
    static By NUMBER_OF_ITEMS_LEFT = By.cssSelector(".todo-count strong");
    static By NUMBER_OF_ITEMS_LEFT_MESSAGE = By.cssSelector(".todo-count");

    public static By completedItemCheckboxFor(String item) {
        return By.xpath(format("//ul[@class='todo-list']//li[contains(.,'%s')]//input[@type='checkbox']", item));
    }

    public static By listedTodoItemFor(String item) {
        return By.xpath(format("//ul[@class='todo-list']//li[contains(.,'%s')]", item));
    }

    public static By filterButtonWithLabel(String filters) {
        return By.linkText(filters);
    }

    public static By clearCompleteButton(String item) {
        return By.xpath(format("//ul[@button class='clear-completed']", item));
    }

    public static By deleteItemCheckboxFor(String item) {
        return By.xpath(format("//li[contains(.,'{0}')]//button[@class='destroy']", item));
    }

}
