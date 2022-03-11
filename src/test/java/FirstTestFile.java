import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;


public class FirstTestFile {


    public WebDriver driver;

    @BeforeAll
    public static void set() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\steph\\IdeaProjects\\demo\\Selenium_Tutorials\\chromedriver.exe");
    }

    @BeforeEach
    public void launchBrowser() {
        System.out.println("launching chrome browser");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void verifyHomepageTitle() {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle);
    }
}
