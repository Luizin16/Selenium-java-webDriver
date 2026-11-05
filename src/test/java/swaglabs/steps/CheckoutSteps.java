package swaglabs.steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import swaglabs.pages.CheckoutPage;

public class CheckoutSteps {

    @Quando("preencho nome {string}, sobrenome {string} e CEP {string}")
    public void preenchoDados(String nome, String sobrenome, String cep) {
        new CheckoutPage().preencherDados(nome, sobrenome, cep);
    }

    @E("o subtotal deve ser {string}")
    public void oSubtotalDeveSer(String subtotal) {
        new CheckoutPage().validarSubtotal(subtotal);
    }

    @E("finalizo a compra")
    public void finalizoACompra() {
        new CheckoutPage().finalizarCompra();
    }

    @Então("devo ver a confirmação {string}")
    public void devoVerAConfirmacao(String mensagem) {
        new CheckoutPage().validarConfirmacao(mensagem);
    }

    @Então("devo ver o erro de checkout {string}")
    public void devoVerOErroDeCheckout(String mensagem) {
        new CheckoutPage().validarMensagemErro(mensagem);
    }
}
