package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractObjectPage {

    @FindBy(id="username")
    private WebElement inputUsernameField;

    @FindBy(id="password")
    private WebElement inputPasswordField;

    @FindBy(id="passwordConfirm")
    private WebElement inputPasswordConfirmField;

    @FindBy(id = "passwordConfirm.errors")
    private WebElement errorMessageIncorrectPassword;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void inputUsername(){
        inputUsernameField.sendKeys("Ruta");
    }

    public void inputPassword(){
        inputPasswordField.sendKeys("password");
    }

    public void confirmPassword(){
        inputPasswordConfirmField.sendKeys("password");
    }

    public void submitRegistration(){
        inputPasswordConfirmField.submit();
    }

    public void confirmInvalidPassword(){
        inputPasswordConfirmField.sendKeys("psword");
    }

    public String errorMessageIncorrectPassword(){
        return errorMessageIncorrectPassword.getText();
    }
}
