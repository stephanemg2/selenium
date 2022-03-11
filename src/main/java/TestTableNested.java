import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTableNested {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\steph\\IdeaProjects\\demo\\Selenium_Tutorials\\chromedriver.exe" );
        String baseUrl = "https://demo.guru99.com/test/newtours/";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);

        //xpatch with chrome debug
//        String innerText = driver.findElement(
//                By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[4]/td[1]/font")).getText();
        String innerText = driver.findElement(
                By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText();


        System.out.println(innerText);
        driver.quit();
    }
}
