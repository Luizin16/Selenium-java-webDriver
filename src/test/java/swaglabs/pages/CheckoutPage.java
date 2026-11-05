package swaglabs.pages;

import swaglabs.attributes.CheckoutAttributes;

import static org.junit.Assert.assertEquals;

public class CheckoutPage extends CheckoutAttributes {

    public CheckoutPage preencherDados(String nome, String sobrenome, String cep) {
        setText(inputNome, nome, "Preencher nome");
        setText(inputSobrenome, sobrenome, "Preencher sobrenome");
        setText(inputCep, cep, "Preencher CEP");
        click(btnContinuar, "Clicar em Continuar");
        return this;
    }

    public CheckoutPage validarSubtotal(String subtotalEsperado) {
        validateObject(labelSubtotal, "Validar subtotal do pedido");
        assertEquals("Item total: " + subtotalEsperado, getText(labelSubtotal));
        return this;
    }

    public CheckoutPage finalizarCompra() {
        click(btnFinalizar, "Clicar em Finalizar");
        return this;
    }

    public CheckoutPage validarConfirmacao(String mensagemEsperada) {
        validateObject(mensagemConfirmacao, "Validar mensagem de confirmação do pedido");
        assertEquals(mensagemEsperada, getText(mensagemConfirmacao));
        return this;
    }

    public CheckoutPage validarMensagemErro(String mensagemEsperada) {
        validateObject(mensagemErro, "Validar mensagem de erro no checkout");
        assertEquals(mensagemEsperada, getText(mensagemErro));
        return this;
    }
}
