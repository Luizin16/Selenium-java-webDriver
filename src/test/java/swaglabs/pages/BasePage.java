package swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import swaglabs.utils.DriverManager;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Ações comuns a todas as páginas.
 * Todas as interações usam espera explícita, sem Thread.sleep.
 */
public class BasePage {

    protected static final String BASE_URL = "https://www.saucedemo.com/";

    protected final WebDriver driver;
    protected final WebDriverWait wait;

    public BasePage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    protected void navigateTo(String url, String descricao) {
        log("AÇÃO", descricao);
        driver.get(url);
    }

    protected void validateObject(WebElement element, String descricao) {
        log("VALIDAÇÃO", descricao);
        wait.until(ExpectedConditions.visibilityOf(element));
        assertTrue(descricao, element.isDisplayed());
    }

    protected void click(WebElement element, String descricao) {
        log("AÇÃO", descricao);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void setText(WebElement element, String texto, String descricao) {
        log("AÇÃO", descricao);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(texto);
    }

    protected void selectByValue(WebElement element, String value, String descricao) {
        log("AÇÃO", descricao);
        wait.until(ExpectedConditions.visibilityOf(element));
        new Select(element).selectByValue(value);
    }

    protected String getText(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

    protected List<String> getTexts(List<WebElement> elements) {
        return elements.stream().map(WebElement::getText).toList();
    }

    private void log(String tipo, String descricao) {
        System.out.println(tipo + ": " + descricao);
    }
}
