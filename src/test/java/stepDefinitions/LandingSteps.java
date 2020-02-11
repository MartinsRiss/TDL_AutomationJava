package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.LandingScreen;
import screens.ShoppingListScreen;
import testUI.Configuration;

import static testUI.UIOpen.open;
import static testUI.Utils.AppiumHelps.sleep;

public class LandingSteps {
    private LandingScreen landingScreen = new LandingScreen();
    private ShoppingListScreen shoppingListScreen = new ShoppingListScreen();


    @Given("I check landing screen")
    public void iOpenTheApplication() {

    }

    @When("I click on add shopping list")
    public void iClickOnAddShoppingList() {
        landingScreen.clickAddShoppingList();
    }

    @And("I type {string}")
    public void iType(String arg0) {
        landingScreen.typeInShoppingName(arg0);
    }

    @And("I click on add list")
    public void iClickOnAddList() {
        landingScreen.clickOnAddList();
    }

    @Then("I see new list {string} on landing screen")
    public void iSeeOnLandingScreen(String arg0) {
        landingScreen.checkNewList(arg0);

    }
    @When("I open the shopping list")
    public void iOpenTheShoppingList() {
        landingScreen.clickOnList();
    }




    @When("I remove the list {string}")
    public void iRemoveTheList(String arg0) {
        shoppingListScreen.clickOnMoreOptions();
        shoppingListScreen.clickFirstDelete();
        shoppingListScreen.clickSecondDelete();

    }


    @Then("I check there is no {string}")
    public void iCheckThereIsNo(String arg0) {
        landingScreen.checkDeletedList(arg0);
        sleep(3000);
    }
}