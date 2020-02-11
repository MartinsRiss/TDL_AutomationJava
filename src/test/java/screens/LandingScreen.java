package screens;

import testUI.elements.UIElement;

import static testUI.Utils.By.byAndroidUIAutomator;
import static testUI.Utils.By.byId;
import static testUI.elements.TestUI.E;

public class LandingScreen {
    // Elements
    private final UIElement shoppingListInput =
            E(byAndroidUIAutomator("textContains(\"Add a shopping list\")"));
    private final UIElement inputShoppingList = E(byId("editText"));
    private final UIElement addListButton = E(byId("android:id/button1"));
    private final UIElement ourGroceriesText = E(byAndroidUIAutomator("textContains(\"OurGroceries\")"));
    private final UIElement shoppingListText = E(byAndroidUIAutomator("textContains(\"Shopping Lists\")"));
    private final UIElement recipesText = E(byAndroidUIAutomator("textContains(\"Recipes\")"));
    private final UIElement addRecipesText = E(byAndroidUIAutomator("textContains(\"Add a recipe\")"));
    private final UIElement moreOptions = E(byId("More options"));
    private final UIElement clickShoppingList = E(byAndroidUIAutomator("textContains(\"First List\")"));
    UIElement element;







    // Methods

    public void checkLandingScreen() {
        ourGroceriesText.waitFor(5).untilIsVisible();
        shoppingListText.waitFor(5).untilIsVisible();
        recipesText.waitFor(5).untilIsVisible();
        addRecipesText.waitFor(5).untilIsVisible();
        moreOptions.waitFor(5).untilIsVisible();


    }

    public void clickAddShoppingList() {
        shoppingListInput.click();
    }

    public void typeInShoppingName(String var) {
        inputShoppingList.sendKeys(var);
    }

    public void clickOnAddList() {
        addListButton.shouldHave().attribute("text").equalTo("ADD LIST");
        addListButton.click();
    }

    public void checkNewList(String arg) {
        element = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        element.waitFor(5).untilIsVisible();
    }

    public void clickOnList(){
        clickShoppingList.click();

    }

    public void checkDeletedList(String arg) {
        element = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        element.waitFor(5).untilNotVisible();
    }
}
