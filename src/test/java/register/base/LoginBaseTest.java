package register.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginBaseTest {

    public static WebDriver driver;

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://n11.com/");
        driver.findElement(By.className("closeBtn")).click();
    }


    @After
    public void after(){
        driver.quit();
    }
}
