package tests;

import SetUpAndTearDown.SetUpAndTearDown;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.ShoppingCommonPages;

import java.util.Arrays;

//@Test(groups={"smoke"})
public class ShoppingScenario1Tests {

    private ShoppingCommonPages shoppingCommonPages;

    @Test(priority=2,groups={"smoke"})
   // @Test(invocationCount = 3,threadPoolSize = 2)
    public void shoppingScenario1()
    {
      //  System.out.println(Thread.currentThread().getId());
        System.out.println("Commit to trigger SCM run jenkins");
        shoppingCommonPages = new ShoppingCommonPages(SetUpAndTearDown.driver.get());
        shoppingCommonPages.navigateThroughInitialPages();

    }
}
