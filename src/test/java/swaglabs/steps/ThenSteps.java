package swaglabs.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import swaglabs.pages.ProductsPage;
import swaglabs.utils.DriverManager;

public class ThenSteps {

    @Then("devo visualizar a lista de produtos")
    public void devoVisualizarAListaDeProdutos() {
        new ProductsPage().validarPaginaProdutos();
        DriverManager.quitDriver();
    }

    @Then("a listagem deve ser realizada sequencialmente")
    public  void aListagemDeveSerRealizadaSequencialmente() {
        new  ProductsPage().listagemRealizadaSequencialmente();
    }

    @And("adiciono alguns produtos no carrinho")
    public void adicionarItens() {
        new ProductsPage().adicionarItensAoCarrinho()
        .abrirCarrinhoDeCompras();
        DriverManager.quitDriver();
    }

    @Then("removo os produtos do carrinho")
    public void removoOsProdutosDoCarrinho() {
        new ProductsPage().removerTodosOsItensDoCarrinho(4);
    }
}