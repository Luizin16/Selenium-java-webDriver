package swaglabs.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swaglabs.utils.DriverManager;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverManager.getDriver();
    }

    protected void navigateTo(String url, String descriptionToAction) {
        System.out.println("AÇÃO: " + descriptionToAction);
        driver.get(url);
    }

    protected void validateObject(WebElement element, String descriptionToAction, boolean b) {
        System.out.println("VALIDAÇÃO: " + descriptionToAction);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));

        Assert.assertTrue(element.isDisplayed());
    }

    protected void click(WebElement element, String descriptionToAction, boolean getSnapshot) {
        System.out.println("AÇÃO: " + descriptionToAction);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();

        if (getSnapshot) {
            System.out.println("EVIDÊNCIA: Screenshot habilitado para essa ação.");
        }
    }

    protected void setText(WebElement element, String text, String descriptionToAction, boolean getSnapshot) {
        System.out.println("AÇÃO: " + descriptionToAction);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));

        element.clear();
        element.sendKeys(text);

        if (getSnapshot) {
            System.out.println("EVIDÊNCIA: Screenshot habilitado para essa ação.");
        }
    }

    protected void fixedWait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Erro ao aguardar tempo fixo.", e);
        }
    }
}