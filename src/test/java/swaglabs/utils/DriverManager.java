package swaglabs.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Cria e encerra o WebDriver.
 * O Selenium Manager (Selenium 4.6+) baixa o chromedriver certo sozinho.
 * Rode com -Dheadless=true (ou na CI) para executar sem abrir o navegador.
 */
public final class DriverManager {

    private static WebDriver driver;

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--window-size=1920,1080");

            if (isHeadless()) {
                options.addArguments("--headless=new", "--no-sandbox", "--disable-dev-shm-usage");
            }

            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private static boolean isHeadless() {
        return Boolean.parseBoolean(System.getProperty("headless", "false"))
                || System.getenv("CI") != null;
    }
}
