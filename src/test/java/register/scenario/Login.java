package register.scenario;

import org.junit.Test;
import register.base.BasePage;
import register.base.LoginBaseTest;
import register.page.*;

public class Login extends LoginBaseTest {
    @Test
    public void loginTest(){
        LoginPage login = new LoginPage(this.driver);
        login.loginOl("gulsen.guler@testinium.com","Qwe.1234");
    }
}