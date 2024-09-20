package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.Review;

public class SpriteYoga {
    private WebDriver driver;

    @FindBy(xpath = "//a[contains(@href,\"sprite-yoga-companion\")]")
    private WebElement spriteYogaCompanion;

    @FindBy(xpath = "//div[@id=\"tab-label-reviews\"]//a[@id=\"tab-label-reviews-title\"]")
    private WebElement reviews;

    @FindBy(xpath = "//label[@title=\"1 star\"]")
    private WebElement stars;

    @FindBy(css = "[id*=nickname]")
    private WebElement summary;

    @FindBy(css = "[id*=summary_field]")
    private WebElement nickname;

    @FindBy(css = "[id*=review_field]")
    private WebElement review_field;

    @FindBy(css = "[class*=submit]")
    private WebElement submit;

    public SpriteYoga(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void spriteYogaReview(String nick_name, String summary_field, String review_field_d) {
        ((JavascriptExecutor) driver).executeScript("scroll(0,100)");
        spriteYogaCompanion.click();
        ((JavascriptExecutor) driver).executeScript("scroll(0,600)");
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", reviews);
        reviews.click();
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        stars.click();
        nickname.sendKeys(nick_name);
        summary.sendKeys(summary_field);
        review_field.sendKeys(review_field_d);

//        for (String[] customerReview : customerReviews) {
//            nickname.sendKeys(customerReview[0]);
//            summary.sendKeys(customerReview[1]);
//            review_field.sendKeys(customerReview[2]);
//            nickname.clear();
//            summary.clear();
//            review_field.clear();
//        }
        submit.click();
    }
}
