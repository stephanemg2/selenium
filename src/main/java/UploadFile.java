
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\steph\\IdeaProjects\\demo\\Selenium_Tutorials\\chromedriver.exe" );
        String baseUrl = "http://demo.guru99.com/test/upload/";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Mach3\\Screen4.xml");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
    }
}