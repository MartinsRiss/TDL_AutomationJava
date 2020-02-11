package screens;

import testUI.elements.UIElement;

import static testUI.Utils.By.*;
import static testUI.elements.TestUI.E;

public class ShoppingListScreen {
    private final UIElement clickMoreOptions = E(byAccesibilityId("More options"));
    private final UIElement clickFirstDeleteList = E(byAndroidUIAutomator("textContains(\"Delete list\")"));
    private final UIElement clickSecondDeleteList = E(byId("android:id/button1"));



    //Methods


    public void clickOnMoreOptions() {
        clickMoreOptions.click();

    }
    public void clickFirstDelete(){
        clickFirstDeleteList.click();

    }
    public void clickSecondDelete(){
        clickSecondDeleteList.click();

    }

}
