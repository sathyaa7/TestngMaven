package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;

public class ShoppingCommonPages {
    private WebDriver driver;

    @FindBy(xpath="//a[@href=\"https://magento.softwaretestingboard.com/women.html\"]//following::span")
    private WebElement women;

    @FindBy(xpath="//a[@href=\"https://magento.softwaretestingboard.com/women/tops-women.html\"]")
    private WebElement tops;

    @FindBy(xpath = "//a[@href=\"https://magento.softwaretestingboard.com/women/tops-women.html\"]//following::span[text()=\"Hoodies & Sweatshirts\"]")
    private WebElement hoodies;

    @FindBy(xpath = "//a[@href=\"https://magento.softwaretestingboard.com/gear.html\"]//following::span")
    private WebElement gear;

    @FindBy(xpath = "//a[@href=\"https://magento.softwaretestingboard.com/gear/fitness-equipment.html\"]")
    private WebElement fitnessEquipment;

    @FindBy(css = "#sorter")
    private WebElement sortBy;

    public ShoppingCommonPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateThroughInitialPages()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(women).perform();
        actions.moveToElement(tops).perform();
        actions.click(hoodies).perform();
        actions.moveToElement(gear).perform();
        actions.click(fitnessEquipment).perform();
        Select select = new Select(sortBy);
        System.out.println("Options available in sorter are   " + Arrays.toString(select.getOptions().stream().map(option -> option.getText()).toArray()));
        select.selectByValue("price");
    }




}
