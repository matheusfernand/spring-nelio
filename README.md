O projeto consiste em uma API Crud em Spring que tem o deploy no Heroku juntamente com o PostgreSQL como DB e pode ser testada a qualquer momento (recomendo a utilização do Postman).

/users
Podem ser usadas as operações de Get(trás todos os usuários, você pode filtrar pelo id com /users/1 por exemplo), Post(insere um usuário no sistema), Put(Atualiza dados de um usuário, deve conter o id na Url), Delete(deleta um usuário, basta você colocar o id na Url e dar Send que apaga).

/products
Pode ser usado o método Get para trazer os produtos instanciados na classe TestConfig

/orders
Também pode ser usado o método Get para trazer os pedidos de clientes também instanciados na classe TestConfig

/categories
A operação get trás todas as categorias dos produtos também instanciados na TestConfig

Url: https://javaspring-nelio.herokuapp.com/

Feito por Matheus Fernando no curso de Java do professor doutor Nelio Alves, pela plataforma Udemy.
