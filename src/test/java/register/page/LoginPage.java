package register.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import register.base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        setDriver(driver);
    }

    public static WebDriver driver;

    public void loginOl(String email, String password) {

        clickBy(By.className("btnSignIn"));
        setById("email", email);
        setById("password", password);
        clickBy(By.id("loginButton"));
    }

}
