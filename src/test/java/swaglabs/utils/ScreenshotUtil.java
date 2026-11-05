package swaglabs.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * Captura evidências da tela atual.
 */
public final class ScreenshotUtil {

    private ScreenshotUtil() {
    }

    public static byte[] capturar() {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
