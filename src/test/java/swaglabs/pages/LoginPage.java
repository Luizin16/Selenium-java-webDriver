package swaglabs.pages;

import org.openqa.selenium.support.PageFactory;
import swaglabs.attributes.LoginAttributes;

public class LoginPage extends LoginAttributes {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public LoginPage acessarSwagLabs() {
        navigateTo("https://www.saucedemo.com/", "Acessar sistema Swag Labs");
        fixedWait(2);
        validateObject(inputUsername, "Validar campo usuário na tela de login");

        return this;
    }

    public LoginPage preencherUsuario(String usuario) {
        setText(inputUsername, usuario, "Preencher campo usuário", true);
        fixedWait(1);

        return this;
    }

    public LoginPage preencherSenha(String senha) {
        setText(inputPassword, senha, "Preencher campo senha", true);
        fixedWait(1);

        return this;
    }

    public ProductsPage clicarLogin() {
        click(buttonLogin, "Clicar no botão Login", true);
        fixedWait(2);

        return new ProductsPage();
    }

    public ProductsPage realizarLogin(String usuario, String senha) {
        preencherUsuario(usuario);
        preencherSenha(senha);
        return clicarLogin();
    }

    public LoginPage validarMensagemErro() {
        validateObject(messageError, "Validar mensagem de erro no login");

        return this;
    }
}