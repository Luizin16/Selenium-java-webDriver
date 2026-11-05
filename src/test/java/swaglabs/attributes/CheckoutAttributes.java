package swaglabs.attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import swaglabs.pages.BasePage;

public class CheckoutAttributes extends BasePage {

    @FindBy(css = "[data-test='firstName']")
    protected WebElement inputNome;

    @FindBy(css = "[data-test='lastName']")
    protected WebElement inputSobrenome;

    @FindBy(css = "[data-test='postalCode']")
    protected WebElement inputCep;

    @FindBy(css = "[data-test='continue']")
    protected WebElement btnContinuar;

    @FindBy(css = "[data-test='subtotal-label']")
    protected WebElement labelSubtotal;

    @FindBy(css = "[data-test='finish']")
    protected WebElement btnFinalizar;

    @FindBy(css = "[data-test='complete-header']")
    protected WebElement mensagemConfirmacao;

    @FindBy(css = "[data-test='error']")
    protected WebElement mensagemErro;
}
