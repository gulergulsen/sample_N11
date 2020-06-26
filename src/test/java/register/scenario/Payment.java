package register.scenario;

import org.junit.Test;
import register.base.LoginBaseTest;
import register.page.*;

public class Payment extends LoginBaseTest {

    @Test
    public void paymentTest(){

        LoginPage login = new LoginPage(this.driver);
        login.loginOl("gulsen.guler@testinium.com","Qwe.1234");



        CategoryPage category = new CategoryPage(this.driver);
        category.selectCategory();

        BasketPage basket = new BasketPage(this.driver);
        basket.getBasket();
        basket.useCoupon();

        NewAdressPage addAdress = new NewAdressPage(this.driver);
        addAdress.addNewAdress("Gülşen Güler",
                "Adres: Kuruköprü Mah., Kurtuluş Caddesi No:3, 01060 Seyhan/Adana",
                "5555555555","13775068052", "Adanada ki güzel evim");

        CheckoutPage checkout = new CheckoutPage(this.driver);
        checkout.paymentInfo("4355", "0843" , "5508",  "4355" , "test card","123");
    }
}
