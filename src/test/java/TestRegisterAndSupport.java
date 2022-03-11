import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestRegisterAndSupport {


    public static WebDriver driver;
    public String expected = null;
    public String actual = null;
    public static String baseUrl = "http://demo.guru99.com/test/newtours/";

    @BeforeAll
    public static void set() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\steph\\IdeaProjects\\demo\\Selenium_Tutorials\\chromedriver.exe");

        System.out.println("launching chrome browser");
        driver = new ChromeDriver();

        driver.get(baseUrl);
        //click consent
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"gdpr-consent-notice\"]")));
        WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='save']")));
        until.click();
        //sort de l'iframe
        driver.switchTo().defaultContent();
    }

    @AfterAll
    public static void terminateBrowser(){
        driver.close();
    }

    @BeforeEach
    public void verifyHomepageTitle() {

        //test title
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle);
    }

    @AfterEach
    public void goBack ( ) {
        driver.navigate().back();
    }

    @Test
    public void register() {
        driver.findElement(By.linkText("REGISTER")).click() ;
        expected = "Register: Mercury Tours";
        actual = driver.getTitle();
        assertEquals(actual, expected);
    }

    @Test
    public void support() {
        driver.findElement(By.linkText("SUPPORT")).click() ;
        expected = "Under Construction: Mercury Tours";
        actual = driver.getTitle();
        assertEquals(actual, expected);
    }
}
