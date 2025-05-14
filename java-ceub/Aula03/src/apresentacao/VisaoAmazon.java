package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Compra;
import negocio.Produto;
import negocio.Tipo;

public class VisaoAmazon {
    public static void main(String[] args) {
        
    // Criação de um BufferedReader para ler a entrada do usuário no console.
    BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

    // Criação de objetos para as classes Compra e Produto.
    Compra objCompra = new Compra();  // Objeto da classe Compra, mas não utilizado diretamente.
    Produto objProduto = new Produto();  // Objeto da classe Produto que será preenchido com dados fornecidos pelo usuário.

    // Início da seção de entrada de dados (leitura de dados fornecidos pelo usuário).
    try{

        System.out.println("Informe o nome do produto: ");
        objProduto.setNome(leitor.readLine());  // Lê a linha de texto fornecida pelo usuário e atribui ao nome do produto.

        System.out.println("Informe o tipo do produto: ");
        objProduto.setObjTipo(new Tipo(leitor.readLine()));  // Lê a linha de texto fornecida, cria um novo objeto Tipo com essa descrição e atribui ao produto.

        System.out.println("Informe o preco do produto: ");
        objProduto.setPreco(Double.parseDouble(leitor.readLine()));  // Lê a entrada do usuário, converte para um valor Double e atribui ao preço do produto.

        objCompra.setObjProduto(objProduto);

        System.out.println("Informe a quantidade do produto: ");
        objCompra.setQuantidade(Integer.parseInt(leitor.readLine())); // Lê a entrada do usuário, converte para um valor Int e atribui a quantidade do produto.

    } catch(Exception erro){  // Se ocorrer algum erro durante a leitura ou conversão dos dados, entra no bloco de captura de exceções.
        // Exibe uma mensagem de erro caso ocorra alguma exceção (como uma falha na leitura ou conversão de tipos).
        System.out.println("ERRO" + erro);
    }

    //Saida de dados

    // Acessa o objeto 'objProduto' dentro de 'objCompra' e chama o método 'getNome()' para obter o nome do produto.
        System.out.println("Produto: " + objCompra.getObjProduto().getNome());

    // Acessa o objeto 'objTipo' dentro de 'objProduto' e chama o método 'getDescricao()' para obter a descrição do tipo do produto.
    System.out.println("Tipo: " + objCompra.getObjProduto().getObjTipo().getDescricao());

    // Acessa o método 'getData()' de 'objCompra' para obter a data da compra e imprimir.
    System.out.println("Data: " + objCompra.getData());

    // Calcula o valor total multiplicando a quantidade de produtos pela o preço unitário do produto.
    // A quantidade é acessada com 'getQuantidade()', e o preço do produto é acessado com 'getPreco()' de 'objProduto'.
    System.out.println("Valor Total: " + objCompra.getQuantidade() * objCompra.getObjProduto().getPreco());

    }
}
