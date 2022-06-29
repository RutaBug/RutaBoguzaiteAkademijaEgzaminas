package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractObjectPage{

    @FindBy(linkText = "Sukurti naują paskyrą")
    private WebElement linkCreateNewAccount;

    @FindBy(name = "username")
    private WebElement inputUsernameField;

    @FindBy(name = "password")
    private WebElement inputPasswordField;

    @FindBy(xpath = "//*[contains(text(),'Įvestas ')]")
    private WebElement errorMessageInvalidFieldInfo;

    @FindBy(xpath = "//*[contains(text(),'Sėkmingai')]" )
    private WebElement successfulLogoutMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLinkCreateNewAccount(){
        linkCreateNewAccount.click();
    }

    public void inputCreatedUsername(){
        inputUsernameField.sendKeys("Ruta");
    }

    public void inputCreatedPassword(){
        inputPasswordField.sendKeys("password");
    }

    public void submitLogin(){
        inputUsernameField.submit();
    }

    public void inputIncorrectUsername(){
        inputUsernameField.sendKeys("Rutaaaaaaaaaaa");
    }

    public String errorMessageText(){
       return errorMessageInvalidFieldInfo.getText();
    }

    public String successfulLogoutMessageText(){
        return successfulLogoutMessage.getText();
    }
}
