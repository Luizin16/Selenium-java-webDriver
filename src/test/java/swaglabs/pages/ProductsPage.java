package swaglabs.pages;

import org.openqa.selenium.By;
import swaglabs.attributes.ProductsAttributes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductsPage extends ProductsAttributes {

    public ProductsPage validarPaginaProdutos() {
        validateObject(titleProducts, "Validar título da página de produtos");
        assertEquals("Products", getText(titleProducts));
        return this;
    }

    public ProductsPage ordenarPor(String opcao) {
        selectByValue(dropdownOrdenacao, opcao, "Ordenar produtos por: " + opcao);
        return this;
    }

    /**
     * Confere se a lista exibida está realmente na ordem escolhida.
     * az / za = por nome, lohi / hilo = por preço.
     */
    public ProductsPage validarOrdenacao(String opcao) {
        switch (opcao) {
            case "az" -> validarOrdem(getTexts(nomesProdutos), Comparator.naturalOrder());
            case "za" -> validarOrdem(getTexts(nomesProdutos), Comparator.reverseOrder());
            case "lohi" -> validarOrdem(precos(), Comparator.naturalOrder());
            case "hilo" -> validarOrdem(precos(), Comparator.reverseOrder());
            default -> throw new IllegalArgumentException("Opção de ordenação inválida: " + opcao);
        }
        return this;
    }

    public ProductsPage adicionarProduto(String nomeProduto) {
        String id = "add-to-cart-" + nomeProduto.toLowerCase().replace(" ", "-");
        click(driver.findElement(By.cssSelector("[data-test='" + id + "']")), "Adicionar ao carrinho: " + nomeProduto);
        return this;
    }

    public ProductsPage validarQuantidadeNoCarrinho(int quantidade) {
        validateObject(badgeCarrinho, "Validar contador do carrinho");
        assertEquals(String.valueOf(quantidade), getText(badgeCarrinho));
        return this;
    }

    public CartPage abrirCarrinho() {
        click(btnCarrinho, "Abrir carrinho de compras");
        return new CartPage();
    }

    private List<Double> precos() {
        return getTexts(precosProdutos).stream()
                .map(preco -> Double.parseDouble(preco.replace("$", "")))
                .toList();
    }

    private <T extends Comparable<T>> void validarOrdem(List<T> exibido, Comparator<T> ordem) {
        List<T> esperado = new ArrayList<>(exibido);
        esperado.sort(ordem);
        assertEquals("A lista não está na ordem esperada", esperado, exibido);
    }
}
