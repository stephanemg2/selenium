import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTable1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\steph\\IdeaProjects\\demo\\Selenium_Tutorials\\chromedriver.exe" );
        String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
//        String innerText = driver.findElement(
//                By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        //xpatch with chrome debug all before /table is deleted
        String innerText = driver.findElement(
                By.xpath("//table/tbody/tr[2]/td[2]")).getText();


        System.out.println(innerText);
        driver.quit();
    }
}
