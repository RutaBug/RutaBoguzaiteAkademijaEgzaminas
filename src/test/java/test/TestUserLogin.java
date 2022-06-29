package test;

import basetest.BaseTest;
import org.testng.annotations.Test;
import page.LoginPage;
import page.MainPage;

import static org.testng.Assert.*;

public class TestUserLogin extends BaseTest {

    private String errorMessageExpected ="Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";

    @Test
    public void userLoginPositiveScenario(){
        LoginPage login = new LoginPage(driver);
        login.inputCreatedUsername();
        login.inputCreatedPassword();
        login.submitLogin();
        MainPage main = new MainPage(driver);
        assertTrue(main.isH2TextShown());
    }

    @Test
    public void userLoginNegativeScenario(){
        LoginPage login = new LoginPage(driver);
        login.inputIncorrectUsername();
        login.inputCreatedPassword();
        login.submitLogin();
        assertEquals(login.errorMessageText(), errorMessageExpected);
    }
}
