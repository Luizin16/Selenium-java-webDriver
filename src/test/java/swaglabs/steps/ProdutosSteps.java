package swaglabs.steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import swaglabs.pages.ProductsPage;

import java.util.List;

public class ProdutosSteps {

    @Então("devo visualizar a lista de produtos")
    public void devoVisualizarAListaDeProdutos() {
        new ProductsPage().validarPaginaProdutos();
    }

    @Quando("ordeno os produtos por {string}")
    public void ordenoOsProdutosPor(String opcao) {
        new ProductsPage().ordenarPor(opcao);
    }

    @Então("os produtos devem estar ordenados por {string}")
    public void osProdutosDevemEstarOrdenadosPor(String opcao) {
        new ProductsPage().validarOrdenacao(opcao);
    }

    @Quando("adiciono os produtos ao carrinho:")
    public void adicionoOsProdutosAoCarrinho(List<String> produtos) {
        ProductsPage page = new ProductsPage();
        produtos.forEach(page::adicionarProduto);
    }

    @E("o contador do carrinho deve mostrar {int}")
    public void oContadorDoCarrinhoDeveMostrar(int quantidade) {
        new ProductsPage().validarQuantidadeNoCarrinho(quantidade);
    }

    @E("abro o carrinho")
    public void abroOCarrinho() {
        new ProductsPage().abrirCarrinho().validarPaginaCarrinho();
    }
}
