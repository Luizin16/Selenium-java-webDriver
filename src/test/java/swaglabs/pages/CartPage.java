package swaglabs.pages;

import swaglabs.attributes.CartAttributes;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CartPage extends CartAttributes {

    public CartPage validarPaginaCarrinho() {
        waitForPage("cart.html", "Your Cart", "Validar página do carrinho");
        return this;
    }

    public CartPage validarItens(List<String> produtosEsperados) {
        assertEquals("Itens do carrinho diferentes do esperado", produtosEsperados, getTexts(nomesItens));
        return this;
    }

    public CartPage removerTodosOsItens() {
        int total = botoesRemover.size();
        for (int i = 0; i < total; i++) {
            click(botoesRemover.get(0), "Remover item " + (i + 1) + " de " + total);
        }
        return this;
    }

    public CartPage validarCarrinhoVazio() {
        assertTrue("O carrinho deveria estar vazio", itensCarrinho.isEmpty());
        return this;
    }

    public CheckoutPage irParaCheckout() {
        click(btnCheckout, "Clicar em Checkout");
        return new CheckoutPage();
    }
}
