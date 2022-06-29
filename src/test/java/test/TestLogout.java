package test;

import basetest.BaseTest;
import org.testng.annotations.Test;
import page.LoginPage;
import page.MainPage;

import static org.testng.Assert.assertEquals;

public class TestLogout extends BaseTest {

    private String expectedSuccessfulLogoutMessage = "Sėkmingai atsijungėte";

    @Test
    public void userLogoutPositiveScenario(){
        LoginPage login = new LoginPage(driver);
        login.inputCreatedUsername();
        login.inputCreatedPassword();
        login.submitLogin();
        MainPage main = new MainPage(driver);
        main.clickButtonLogout();
        assertEquals(login.successfulLogoutMessageText(),expectedSuccessfulLogoutMessage);

    }
}
