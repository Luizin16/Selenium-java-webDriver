package swaglabs.steps;

import io.cucumber.java.en.When;
import swaglabs.pages.LoginPage;
import swaglabs.pages.ProductsPage;

public class WhenSteps {

    @When("informo usuario {string} e senha {string}")
    public void informoUsuarioESenha(String usuario, String senha) {
        new LoginPage().realizarLogin(usuario, senha);
    }

    @When("faço listagem de todos produtos por categoria")
    public void listarProdutos() {
        new   ProductsPage().validarPaginaProdutos().listarTodosProdutos();
    }
}