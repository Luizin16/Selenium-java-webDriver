package swaglabs.attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import swaglabs.pages.BasePage;

public class ProductsAttributes extends BasePage {

    @FindBy(css = "[data-test='title']")
    protected WebElement titleProducts;

    @FindBy(className = "inventory_list")
    protected WebElement productList;

    @FindBy(xpath = "//select[@data-test='product-sort-container']")
    protected WebElement dropdownOrdenacao; // <-- Mudar para protected

    @FindBy(xpath = "//select[@data-test='product-sort-container']/option[@value='az']")
    protected WebElement opcaoNomeAZ; // <-- Mudar para protected

    @FindBy(xpath = "//select[@data-test='product-sort-container']/option[@value='za']")
    protected WebElement opcaoNomeZA; // <-- Mudar para protected

    @FindBy(xpath = "//select[@data-test='product-sort-container']/option[@value='lohi']")
    protected WebElement opcaoPrecoBaixoAlto; // <-- Mudar para protected

    @FindBy(xpath = "//select[@data-test='product-sort-container']/option[@value='hilo']")
    protected WebElement opcaoPrecoAltoBaixo; // <-- Mudar para protected
}