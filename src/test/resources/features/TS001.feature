@CN_ACESSARLOGIN
  @TS0001
Feature: Login Swag Labs

  Scenario: Login com sucesso

    Given que acesso o Swag Labs
    When informo usuario "standard_user" e senha "secret_sauce"
    Then devo visualizar a lista de produtos


