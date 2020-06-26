package register.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import register.base.BasePage;

public class CategoryPage extends BasePage {

    public CategoryPage(WebDriver driver) {
        setDriver(driver);
    }

    public static WebDriver driver;

    public void selectCategory() {

        clickBy(By.linkText("Spor & Outdoor"));
        clickBy(By.xpath("//li[@class='column'][1]//a"));
    }

}
