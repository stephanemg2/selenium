
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionMouseOver {

    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\steph\\IdeaProjects\\demo\\Selenium_Tutorials\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        //click consent
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"gdpr-consent-notice\"]")));
        WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='save']")));
        until.click();
        //sort de l'iframe
        driver.switchTo().defaultContent();
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver
                .findElement(By
                        .xpath("//html/body/div"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr"));

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();

        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);
        mouseOverHome.perform();
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        driver.close();
    }
}
