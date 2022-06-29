package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractObjectPage{

    @FindBy(tagName = "h2")
    private WebElement h2TextShown;

    @FindBy(xpath = "//*[contains(text(),'Logout')]")
    private WebElement buttonLogout;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isH2TextShown(){
        return h2TextShown.isDisplayed();
    }

    public void clickButtonLogout(){
        buttonLogout.click();
    }

}
