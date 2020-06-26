package register.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import register.base.BasePage;

public class NewAdressPage extends BasePage {

    public NewAdressPage(WebDriver driver) {
        setDriver(driver);
    }

    public static WebDriver driver;

    public void addNewAdress(String adressname, String acikadres, String gsm, String tcno, String addressName) {
        clickBy(By.className("info"));
        setById("fullName", adressname);
        clickBy(By.id("cityId"));
        clickBy(By.xpath("//option[contains(text(),'Adana')]"));
        clickBy(By.id("districtId"));
        clickBy(By.xpath("//option[contains(text(),'Alada')]"));
        clickBy(By.id("neighbourhoodId"));
        clickBy(By.xpath("//option[contains(text(),'Akören')]"));
        setById("addressDetail", acikadres);
        setText("gsm", gsm);
        setById("tcNO", tcno);
        setById("addressName", addressName);
        clickBy(By.xpath("//span[contains(@class,'btn btnBlack js-saveAddressBtn')]"));
    }
}
