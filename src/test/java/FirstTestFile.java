import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;


public class FirstTestFile {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";


    public WebDriver driver ;

    @Test
    public void verifyHomepageTitle() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\steph\\IdeaProjects\\demo\\Selenium_Tutorials\\chromedriver.exe");

        System.out.println("launching chrome browser");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle);
        driver.close();
    }
}
