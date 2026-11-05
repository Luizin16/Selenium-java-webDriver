# language: pt
@ordenacao
Funcionalidade: Ordenação de produtos
  Como cliente da loja
  Quero ordenar os produtos
  Para encontrar mais rápido o que procuro

  Contexto:
    Dado que estou logado com o usuario "standard_user"

  Esquema do Cenário: Ordenar produtos por <descricao>
    Quando ordeno os produtos por "<opcao>"
    Então os produtos devem estar ordenados por "<opcao>"

    Exemplos:
      | opcao | descricao              |
      | az    | nome de A a Z          |
      | za    | nome de Z a A          |
      | lohi  | menor para maior preço |
      | hilo  | maior para menor preço |
