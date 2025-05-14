package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Estante;
import negocio.Produto;

public class VisaoControleEstoque {
	public static void main(String [] args) {
		// Declaração de variáveis 
		
		// BufferedReader permite leitura de dados do teclado de forma eficiente.
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
									System.in));

		// Cria um objeto da classe Produto.
		Produto objProduto = new Produto();
		
		// Entrada de Dados
		try { // Código que pode gerar um erro
			System.out.print("Digite o nome do produto: ");
			// Lê o nome digitado e atribui ao produto.
			objProduto.setNome(leitor.readLine());
			
			System.out.print("Digite o número da estante: ");
			// Lê o número da estante, converte para inteiro e cria um novo objeto Estante.
			objProduto.setObjEstante(new Estante(
						Integer.parseInt(leitor.readLine())));
			
			System.out.print("Digite a quantidade de produtos: ");
			// Lê a quantidade de produtos e converte para inteiro.
			objProduto.setQuantidade(
						Integer.parseInt(leitor.readLine()));
						
		} catch (Exception erro) { // O que fazer se o erro acontecer
			// Captura qualquer erro na entrada de dados e exibe.
			System.out.println(erro);
		}
		
		// Saída de dados: imprime as informações cadastradas.
			System.out.println("Produto: " + objProduto.getNome());
			System.out.println("Estante: " + objProduto.getObjEstante().getNumero());
			System.out.println("Quantidade: " + objProduto.getQuantidade());
	}
}
