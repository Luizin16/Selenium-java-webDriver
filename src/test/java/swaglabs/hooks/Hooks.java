package swaglabs.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import swaglabs.utils.DriverManager;
import swaglabs.utils.ScreenshotUtil;

/**
 * Executa ao final de cada cenário: anexa evidência ao relatório e fecha o navegador.
 * Assim nenhum step precisa encerrar o driver no meio do fluxo.
 */
public class Hooks {

    @After
    public void finalizarCenario(Scenario scenario) {
        String status = scenario.isFailed() ? "falha" : "evidencia";
        scenario.attach(ScreenshotUtil.capturar(), "image/png", status + " - " + scenario.getName());
        DriverManager.quitDriver();
    }
}
