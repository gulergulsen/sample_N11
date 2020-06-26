package register.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterBaseTest {

    public static WebDriver driver;

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://qa.n11.com/");
        //driver.findElement(By.xpath("//div[@class='btnHolder']//span")).click();
    }

    @After
    public void after(){
        driver.quit();
    }
}
