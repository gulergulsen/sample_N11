package register.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import register.base.BasePage;

public class BasketPage extends BasePage {

    public BasketPage(WebDriver driver) {
        setDriver(driver);
    }

    public static WebDriver driver;

    public void getBasket() {
        clickBy(By.className("myBasket"));
    }

    public void useCoupon() {
        clickBy(By.xpath("//span[@class='btn btnBlack js-getCouponsBtn mid']"));
        clickBy(By.xpath("//span[@class='btn btnBlack mid js-useCouponBtn']"));
        clickBy(By.xpath("//span[contains(@class,'btnGreen big js-updateBenefits')]"));
    }

}
