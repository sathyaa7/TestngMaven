package SetUpAndTearDown;

import com.google.gson.Gson;
import org.testng.annotations.*;
import resources.POJO;
import resources.Review;
import utility.ConfigurationUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileNotFoundException;
import java.io.FileReader;


//@Test(groups={"smoke"})
public class SetUpAndTearDown {
    //public static WebDriver driver;

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        //co.addArguments("--headless");
        co.addArguments("--disable-gpu");
        co.addArguments("--incognito");
       // driver = new ChromeDriver(co);
        driver.set(new ChromeDriver(co));
       // driver.manage().window().maximize();
        driver.get().manage().window().maximize();
        //driver.get(ConfigurationUtility.getProperty("base.url"));
        driver.get().get(ConfigurationUtility.getProperty("base.url"));

    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.get().quit();
        }
    }

    //@DataProvider(parallel = true)
    @DataProvider()
    public Object[][] getData() throws FileNotFoundException {
        Gson gson=new Gson();
        POJO pojo=gson.fromJson(new FileReader("src/test/java/resources/data.json"),POJO.class);
        int rowCount = pojo.getReviews().size();
        int columnCount = 3; // Number of fields: nickname, summary, review_field
        String[][] data = new String[rowCount][columnCount];

        int i=0;
        for(Review review:pojo.getReviews())
        {
            data[i][0]=review.getNickname();
            data[i][1]=review.getSummary();
            data[i][2]=review.getReview_field();
            i++;
        }
        return data;
    }
}
