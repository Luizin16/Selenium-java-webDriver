@CN_ADICIONARPRODUTOSAOCARRINHO
  @TS0002
Feature: Adicionar produtos ao carrinho

  Scenario: Adicionar alguns produtos

    Given que acesso o Swag Labs
    When informo usuario "standard_user" e senha "secret_sauce"
    And faço listagem de todos produtos por categoria
    And a listagem deve ser realizada sequencialmente
    And adiciono alguns produtos no carrinho
    Then removo os produtos do carrinho

