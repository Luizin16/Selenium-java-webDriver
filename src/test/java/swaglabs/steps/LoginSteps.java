package swaglabs.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import swaglabs.pages.LoginPage;

public class LoginSteps {

    @Dado("que acesso o Swag Labs")
    public void queAcessoOSwagLabs() {
        new LoginPage().acessarSwagLabs();
    }

    @Quando("informo usuario {string} e senha {string}")
    public void informoUsuarioESenha(String usuario, String senha) {
        new LoginPage().realizarLogin(usuario, senha);
    }

    @Dado("que estou logado com o usuario {string}")
    public void queEstouLogado(String usuario) {
        new LoginPage().acessarSwagLabs().realizarLogin(usuario, "secret_sauce");
    }

    @Então("devo ver a mensagem de erro {string}")
    public void devoVerAMensagemDeErro(String mensagem) {
        new LoginPage().validarMensagemErro(mensagem);
    }
}
