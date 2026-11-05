package swaglabs.attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import swaglabs.pages.BasePage;

import java.util.List;

public class CartAttributes extends BasePage {

    @FindBy(css = "[data-test='title']")
    protected WebElement titleCart;

    @FindBy(css = "[data-test='inventory-item']")
    protected List<WebElement> itensCarrinho;

    @FindBy(css = "[data-test='inventory-item-name']")
    protected List<WebElement> nomesItens;

    @FindBy(css = "button[data-test^='remove-']")
    protected List<WebElement> botoesRemover;

    @FindBy(css = "[data-test='checkout']")
    protected WebElement btnCheckout;
}
