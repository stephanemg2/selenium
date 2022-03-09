import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkClick {

    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/link.html";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\steph\\IdeaProjects\\demo\\Selenium_Tutorials\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.findElement(By.linkText("click here")).click();
        System.out.println("title of page is: " + driver.getTitle());
        driver.close();

        //partial link text
        driver = new ChromeDriver();
        baseUrl = "http://demo.guru99.com/test/block.html";
        driver.get(baseUrl);
        driver.findElement(By.partialLinkText("Inside")).click();
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Outside")).click();
        System.out.println(driver.getTitle());
        driver.close();
    }

}
