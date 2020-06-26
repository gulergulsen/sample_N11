package register.scenario;

import org.junit.Test;
import register.base.RegisterBaseTest;
import register.page.RegisterPage;

public class Register extends RegisterBaseTest {

    @Test
    public void registerTest(){
        RegisterPage register = new RegisterPage(this.driver);
        register.uyeOl("Gulsen", "Deneme","gulsenglr@gmail.com","Qwe.1234","Qwe.1234", "Kadın","N11");

    }
}
