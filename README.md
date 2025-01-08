# Gerenciador de Pedidos
Segundo trabalho de implementação - Paradigmas de Programação.

## Exercício 8
O código abaixo apresenta um trecho da classe Pedido, a qual é utilizada num sistema que gerencia pedidos de clientes.

        class Pedido {
            int numero;
            Cliente cliente;
        }
        
Baseado neste código, faça:

* Defina uma classe Cliente. Neste sistema só é necessário armazenar nomes,
telefones e endereços dos clientes. Crie um construtor para facilitar a criação
destes.
* Altere a classe Pedido para conter também um campo data (objeto da classe
java. time.LocalDate), a qual representa a data de realização do pedido, e um
campo preço. Crie também um construtor para facilitar a criação de objetos
desta classe.
* Neste sistema, o cliente também pode solicitar que seu pedido seja entregue de
forma expressa. Altere este sistema, sabendo que este tipo terá um novo campo
data, a qual conterá a data de entrega do pedido. Pedidos expressos terão seu
preço original acrescido de 20%.
* Ainda com respeito a datas, pedidos entregues no prazo são pedidos entregues
no mesmo dia em que foram solicitados. Insira um método que verifique esta
situação, ou seja, retorne verdadeiro se solicitação e entrega dos pedidos foram
feitos no mesmo dia. Caso contrário, o método deve retornar falso.
* Num método main(), crie 2 clientes: Fulano, morador da rua A, com telefone
9999 e Ciclano, morador da rua B, com telefone 8888. O primeiro cliente realiza
um pedido simples, com valor de 500 dinheiros, na data e hora correntes
(construtor padrão – default – da classe java. time.LocalDate), enquanto que o
segundo realiza um pedido expresso com mesmo valor. A empresa consegue
entregar o pedido na mesma data. Em seguida, imprima, para cada cliente, seu
nome, o preço de seu pedido e se foi entregue no prazo, quando se aplicar.
Defina um método chamado toString() na classe Pedido para retornar a String a
ser impressa a partir deste método main().
* Implemente operações para salvar e recuperar em arquivos as informações de
clientes e pedidos.

#### Grupo
<ul>
    <li>Lara Fernandes</li>
    <li>Victoria Valicelle</li>
</ul>
