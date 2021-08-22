# BDD Cucumber Todomvc Test Cases

This is the repo for BDD Cucumber test cases to test the todomvc website.

## Get the code
git clone this repo

## The project directory structure
The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                          Test runners and supporting code
    + resources
      + features                    Feature files
      + webdriver                   Bundled webdriver binaries
        + windows
          chromedriver.exe          OS-specific Webdriver binaries

```

## The TodoMVC application

We will be testing web based todo app. You can find it on the [TodoMVC website](https://todomvc.com/examples/vue/). 

# Run the test cases

You can run the tests by right click on feature file at IntelliJ editor.

Take note the glue in configuration should be "todos.stepdefinitions net.serenitybdd.cucumber.actors"
```
## Author
Jean Gan