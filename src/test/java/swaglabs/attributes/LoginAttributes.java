package swaglabs.attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import swaglabs.pages.BasePage;

public class LoginAttributes extends BasePage {

    @FindBy(id = "user-name")
    protected WebElement inputUsername;

    @FindBy(id = "password")
    protected WebElement inputPassword;

    @FindBy(id = "login-button")
    protected WebElement buttonLogin;

    @FindBy(css = "[data-test='error']")
    protected WebElement messageError;
}