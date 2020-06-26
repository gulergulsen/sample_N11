package register.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import register.base.BasePage;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        setDriver(driver);
    }

    public static WebDriver driver;

    public void paymentInfo(String num1, String num2, String num3, String num4,String owner, String cvv) {
        clickBy(By.id("js-goToPaymentBtn"));
        setByXpath("//*[@tabindex='1']", num1);
        setByXpath("//*[@tabindex='2']", num2);
        setByXpath("//*[@tabindex='3']", num3);
        setByXpath("//*[@tabindex='4']", num4);
        setById("cardOwnerName", owner);
        clickBy(By.id("expireMonth"));
        clickBy(By.xpath("//option[@value='6']"));
        clickBy(By.id("expireYear"));
        clickBy(By.xpath("//option[@value='2022']"));
        setById("securityCode", cvv);
    }
}
