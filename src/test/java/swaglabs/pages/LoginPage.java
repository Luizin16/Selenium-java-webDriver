package swaglabs.pages;

import swaglabs.attributes.LoginAttributes;

import static org.junit.Assert.assertEquals;

public class LoginPage extends LoginAttributes {

    public LoginPage acessarSwagLabs() {
        navigateTo(BASE_URL, "Acessar sistema Swag Labs");
        validateObject(inputUsername, "Validar campo usuário na tela de login");
        return this;
    }

    public LoginPage preencherUsuario(String usuario) {
        setText(inputUsername, usuario, "Preencher campo usuário");
        return this;
    }

    public LoginPage preencherSenha(String senha) {
        setText(inputPassword, senha, "Preencher campo senha");
        return this;
    }

    public void clicarLogin() {
        click(buttonLogin, "Clicar no botão Login");
    }

    public void realizarLogin(String usuario, String senha) {
        preencherUsuario(usuario).preencherSenha(senha).clicarLogin();
    }

    public LoginPage validarMensagemErro(String mensagemEsperada) {
        validateObject(messageError, "Validar mensagem de erro no login");
        assertEquals(mensagemEsperada, getText(messageError));
        return this;
    }
}
