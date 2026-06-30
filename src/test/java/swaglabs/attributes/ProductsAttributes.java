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
    protected WebElement dropdownOrdenacao;

    @FindBy(xpath = "//select[@data-test='product-sort-container']/option[@value='az']")
    protected WebElement opcaoNomeAZ;

    @FindBy(xpath = "//select[@data-test='product-sort-container']/option[@value='za']")
    protected WebElement opcaoNomeZA;

    @FindBy(xpath = "//select[@data-test='product-sort-container']/option[@value='lohi']")
    protected WebElement opcaoPrecoBaixoAlto;

    @FindBy(xpath = "//select[@data-test='product-sort-container']/option[@value='hilo']")
    protected WebElement opcaoPrecoAltoBaixo;

    @FindBy(xpath = "//div[@data-test='inventory-item-name' and contains(., 'Backpack')]")
    protected WebElement txtNomeMochila;

    @FindBy(css = "[data-test='add-to-cart-sauce-labs-backpack']")
    protected WebElement btnAddBackpack;

    @FindBy(xpath = "//div[@data-test='inventory-item-name' and contains(., 'Bike Light')]")
    protected WebElement txtNomeLuzDeBicicleta;

    @FindBy(css = "[data-test='add-to-cart-sauce-labs-bike-light']")
    protected WebElement btnAddBikeLight;

    @FindBy(xpath = "//div[@data-test='inventory-item-name' and contains(., 'Fleece Jacket')]")
    protected WebElement txtNomeJaqueta;

    @FindBy(css = "[data-test='add-to-cart-sauce-labs-fleece-jacket']")
    protected WebElement btnAddJacket;

    @FindBy(xpath = "//div[@data-test='inventory-item-name' and contains(., 'Onesie')]")
    protected WebElement txtNomeMacacao;

    @FindBy(css = "[data-test='add-to-cart-sauce-labs-onesie']")
    protected WebElement btnAddOnesie;

    @FindBy(xpath = "//a[@data-test='shopping-cart-link']")
    protected WebElement btnCarrinho;

    @FindBy(xpath = "(//button[contains(@data-test, 'remove-')])[1]")
    protected WebElement btnPrimeiroRemoverDaLista;
}