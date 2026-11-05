package swaglabs.attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import swaglabs.pages.BasePage;

import java.util.List;

public class ProductsAttributes extends BasePage {

    @FindBy(css = "[data-test='product-sort-container']")
    protected WebElement dropdownOrdenacao;

    @FindBy(css = "[data-test='inventory-item-name']")
    protected List<WebElement> nomesProdutos;

    @FindBy(css = "[data-test='inventory-item-price']")
    protected List<WebElement> precosProdutos;

    @FindBy(css = "[data-test='shopping-cart-badge']")
    protected WebElement badgeCarrinho;

    @FindBy(css = "[data-test='shopping-cart-link']")
    protected WebElement btnCarrinho;
}
