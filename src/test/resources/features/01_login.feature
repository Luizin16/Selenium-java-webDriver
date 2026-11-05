# language: pt
@login
Funcionalidade: Login no Swag Labs
  Como cliente da loja
  Quero acessar minha conta
  Para conseguir comprar os produtos

  Contexto:
    Dado que acesso o Swag Labs

  @smoke
  Cenário: Login com sucesso
    Quando informo usuario "standard_user" e senha "secret_sauce"
    Então devo visualizar a lista de produtos

  Cenário: Login com usuário bloqueado
    Quando informo usuario "locked_out_user" e senha "secret_sauce"
    Então devo ver a mensagem de erro "Epic sadface: Sorry, this user has been locked out."

  Cenário: Login com senha inválida
    Quando informo usuario "standard_user" e senha "senha_errada"
    Então devo ver a mensagem de erro "Epic sadface: Username and password do not match any user in this service"

  Cenário: Login sem preencher o usuário
    Quando informo usuario "" e senha "secret_sauce"
    Então devo ver a mensagem de erro "Epic sadface: Username is required"
