import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

public class SeleniumClass {

    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.in");
        Thread.sleep(3000);



    }
}
