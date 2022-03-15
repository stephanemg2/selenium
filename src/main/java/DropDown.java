import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\steph\\IdeaProjects\\demo\\Selenium_Tutorials\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
        driver.navigate().refresh();
//Once you got the select object initialised then you can access all the methods of select class.
//Identify the select HTML element:
        Thread.sleep(10000);
        WebElement mySelectElement = driver.findElement(By.name("dropdown"));
        Select dropdown = new Select(mySelectElement);
//To select an option - selectByVisibleText, selectByIndex, selectByValue
//selectByVisibleText
        dropdown.selectByVisibleText("Automation Testing");
    }

}
