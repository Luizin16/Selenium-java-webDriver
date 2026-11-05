package swaglabs.steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import swaglabs.pages.CartPage;

import java.util.List;

public class CarrinhoSteps {

    @Então("o carrinho deve conter:")
    public void oCarrinhoDeveConter(List<String> produtos) {
        new CartPage().validarItens(produtos);
    }

    @Quando("removo todos os produtos do carrinho")
    public void removoTodosOsProdutos() {
        new CartPage().removerTodosOsItens();
    }

    @Então("o carrinho deve ficar vazio")
    public void oCarrinhoDeveFicarVazio() {
        new CartPage().validarCarrinhoVazio();
    }

    @E("sigo para o checkout")
    public void sigoParaOCheckout() {
        new CartPage().irParaCheckout();
    }
}
