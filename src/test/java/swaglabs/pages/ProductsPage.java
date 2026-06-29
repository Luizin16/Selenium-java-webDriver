package swaglabs.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import swaglabs.attributes.ProductsAttributes;

public class ProductsPage extends ProductsAttributes {

    public ProductsPage() {
        PageFactory.initElements(driver, this);
    }

    public ProductsPage validarPaginaProdutos() {
        validateObject(titleProducts, "Validar título da página de produtos");
        validateObject(productList, "Validar lista de produtos");

        Assert.assertEquals("Products", titleProducts.getText());

        return this;
    }

    public ProductsPage listarTodosProdutos() {
        validateObject(dropdownOrdenacao, "Validar o drop de abrir filtro");
        click(dropdownOrdenacao, "Clicar no Drop para abrir filtragem",true);
        fixedWait(2);
        return this;
    }

    public ProductsPage listagemRealizadaSequencialmente(){
        validateObject(opcaoNomeAZ,"Validar produto de A a Z");
        click(opcaoNomeAZ,"Clicar na opção de A a Z", true);
        fixedWait(2);

        validateObject(opcaoNomeZA,"Validar produto de Z a A");
        click(opcaoNomeZA, "Clicar na opção de Z a A", true);
        fixedWait(2);

        validateObject(opcaoPrecoBaixoAlto, "Validar listar por Preço Baixo até o mais Alto");
        click(opcaoPrecoBaixoAlto, "Clicar na opção Preço baixo até o mais Alto", true);
        fixedWait(2);

        validateObject(opcaoPrecoAltoBaixo, "Validar listar do Preço Alto até o mais Baixo");
        click(opcaoPrecoAltoBaixo, "Clicar na opção de Preço Alto até o mais Baixo", true);
        fixedWait(2);

        return this;
    }
}