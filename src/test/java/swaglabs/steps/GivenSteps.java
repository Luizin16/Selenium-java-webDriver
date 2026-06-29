package swaglabs.steps;

import io.cucumber.java.en.Given;
import swaglabs.pages.LoginPage;

public class GivenSteps {

    @Given("que acesso o Swag Labs")
    public void queAacessoSwagLabs(){
        new LoginPage().acessarSwagLabs();
    }
}
