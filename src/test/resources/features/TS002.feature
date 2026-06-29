@CN_VALIDARLISTAGEMPRODUTOS
Feature: Listar produtos

  Scenario: Listar todos produtos

    Given que acesso o Swag Labs
    Given que acesso o Swag Labs
    When informo usuario "standard_user" e senha "secret_sauce"
    And faço listagem de todos produtos por categoria
    Then a listagem deve ser realizada sequencialmente

