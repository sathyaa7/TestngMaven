package tests;

import SetUpAndTearDown.SetUpAndTearDown;
import org.testng.annotations.Test;
import pages.SpriteYoga;

@Test(groups = {"smoke"})
public class ShoppingScenario2Tests extends SetUpAndTearDown {

    private SpriteYoga spriteYoga;

    //@Test(dependsOnMethods = "shoppingScenario1",enabled=false)
    @Test(priority=1,groups={"smoke"},dataProvider = "getData",dependsOnMethods = "shoppingScenario1")
    public void shoppingScenario2(String nickname, String summary, String reviewField) {
        spriteYoga = new SpriteYoga(driver.get());
        spriteYoga.spriteYogaReview(nickname,summary,reviewField);
    }
}
