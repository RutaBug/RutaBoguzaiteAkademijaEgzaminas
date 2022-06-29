package test;


import basetest.BaseTest;
import org.testng.annotations.Test;
import page.LoginPage;
import page.RegistrationPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestUserRegistration extends BaseTest {

    public String errorMessage = "Įvesti slaptažodžiai nesutampa";


    @Test
    public void userRegistrationPositiveScenario(){
        LoginPage login = new LoginPage(driver);
        login.clickLinkCreateNewAccount();
        RegistrationPage registration = new RegistrationPage(driver);
        registration.inputUsername();
        registration.inputPassword();
        registration.confirmPassword();
        registration.submitRegistration();
    }
    @Test
    public void userRegistrationNegativeScenario(){
        LoginPage login = new LoginPage(driver);
        login.clickLinkCreateNewAccount();
        RegistrationPage registration = new RegistrationPage(driver);
        registration.inputUsername();
        registration.inputPassword();
        registration.confirmInvalidPassword();
        registration.submitRegistration();
        assertEquals(errorMessage,registration.errorMessageIncorrectPassword());

    }

}
