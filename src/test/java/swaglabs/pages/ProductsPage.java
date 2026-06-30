package swaglabs.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import swaglabs.attributes.ProductsAttributes;

public class ProductsPage extends ProductsAttributes {

    public ProductsPage() {
        PageFactory.initElements(driver, this);
    }

    public ProductsPage validarPaginaProdutos() {
        validateObject(titleProducts, "Validar título da página de produtos", true);
        validateObject(productList, "Validar lista de produtos", true);

        Assert.assertEquals("Products", titleProducts.getText());

        return this;
    }

    public ProductsPage listarTodosProdutos() {
        validateObject(dropdownOrdenacao, "Validar o drop de abrir filtro", true);
        click(dropdownOrdenacao, "Clicar no Drop para abrir filtragem", true);
        fixedWait(3);
        return this;
    }

    public ProductsPage listagemRealizadaSequencialmente() {
        validateObject(opcaoNomeAZ, "Validar produto de A a Z", true);
        click(opcaoNomeAZ, "Clicar na opção de A a Z", true);
        fixedWait(4);

        validateObject(opcaoNomeZA, "Validar produto de Z a A", true);
        click(opcaoNomeZA, "Clicar na opção de Z a A", true);
        fixedWait(4);

        validateObject(opcaoPrecoBaixoAlto, "Validar listar por Preço Baixo até o mais Alto", true);
        click(opcaoPrecoBaixoAlto, "Clicar na opção Preço baixo até o mais Alto", true);
        fixedWait(4);

        validateObject(opcaoPrecoAltoBaixo, "Validar listar do Preço Alto até o mais Baixo", true);
        click(opcaoPrecoAltoBaixo, "Clicar na opção de Preço Alto até o mais Baixo", true);
        fixedWait(4);

        return this;
    }

    public ProductsPage adicionarItensAoCarrinho() {
        validateObject(txtNomeMochila, "Validar produto Mochila", true);
        click(btnAddBackpack, "Clicar adicionar Mochila", true);
        fixedWait(2);

        validateObject(txtNomeLuzDeBicicleta, "Validar produto Luz de Bicicleta", true);
        click(btnAddBikeLight, "Clicar adicionar Luz de Bicicleta", true);
        fixedWait(2);

        validateObject(txtNomeJaqueta, "Validar produto Jaqueta", true);
        click(btnAddJacket, "Clicar adicionar Jaqueta", true);
        fixedWait(2);

        validateObject(txtNomeMacacao, "Validar produto Macacão", true);
        click(btnAddOnesie, "Clicar adicionar Macacão", true);
        fixedWait(3);

        return this;
    }

    public ProductsPage abrirCarrinhoDeCompras() {
        validateObject(btnCarrinho, "Validar se o ícone do carrinho de compras está visível", true);
        click(btnCarrinho, "Clicar no ícone do carrinho para abrir as compras", true);
        fixedWait(3);
        return this;
    }

    public ProductsPage removerTodosOsItensDoCarrinho(int quantidadeDeItens) {
        for (int i = 0; i < quantidadeDeItens; i++) {
            validateObject(btnPrimeiroRemoverDaLista, "Validando o botão de remover do item " + (i + 1), true);
            click(btnPrimeiroRemoverDaLista, "Clicando em remover o primeiro item da lista", true);
            fixedWait(5);
        }
        return this;
    }
}