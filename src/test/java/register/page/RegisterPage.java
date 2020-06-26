package register.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import register.base.BasePage;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        setDriver(driver);
    }

    public RegisterPage uyeOl(String name, String lastname, String mail, String password, String passwordagain, String gender ,String captcha){

        try {
            clickBy(By.linkText("Tamam"));
        }
        catch (Exception e){

        }
        clickBy(By.className("btnSignUp"));
        setById("firstName", name);
        setById("lastName", lastname);
        setById("registrationEmail", mail);
        setById("registrationPassword", password);
        setById("passwordAgain", passwordagain);
        clickBy(By.xpath("//*[contains(text(), 'Kadın' )]"));
        setById("captchaText", captcha);
        clickBy(By.id("submitButton"));

        return this;
    }
}
