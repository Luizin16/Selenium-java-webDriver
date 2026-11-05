# language: pt
@carrinho
Funcionalidade: Carrinho de compras
  Como cliente da loja
  Quero adicionar e remover produtos do carrinho
  Para montar meu pedido

  Contexto:
    Dado que estou logado com o usuario "standard_user"
    Quando adiciono os produtos ao carrinho:
      | Sauce Labs Backpack      |
      | Sauce Labs Bike Light    |
      | Sauce Labs Fleece Jacket |
      | Sauce Labs Onesie        |

  @smoke
  Cenário: Adicionar produtos ao carrinho
    Então o contador do carrinho deve mostrar 4
    E abro o carrinho
    E o carrinho deve conter:
      | Sauce Labs Backpack      |
      | Sauce Labs Bike Light    |
      | Sauce Labs Fleece Jacket |
      | Sauce Labs Onesie        |

  Cenário: Remover todos os produtos do carrinho
    E abro o carrinho
    Quando removo todos os produtos do carrinho
    Então o carrinho deve ficar vazio
