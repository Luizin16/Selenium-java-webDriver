# language: pt
@checkout
Funcionalidade: Checkout
  Como cliente da loja
  Quero finalizar meu pedido
  Para receber os produtos que escolhi

  Contexto:
    Dado que estou logado com o usuario "standard_user"
    Quando adiciono os produtos ao carrinho:
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |
    E abro o carrinho
    E sigo para o checkout

  @smoke
  Cenário: Finalizar compra com sucesso
    Quando preencho nome "Luiz", sobrenome "Alves" e CEP "01001-000"
    E o subtotal deve ser "$39.98"
    E finalizo a compra
    Então devo ver a confirmação "Thank you for your order!"

  Cenário: Checkout sem informar o CEP
    Quando preencho nome "Luiz", sobrenome "Alves" e CEP ""
    Então devo ver o erro de checkout "Error: Postal Code is required"
