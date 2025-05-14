package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Autor;
import negocio.Livro;

public class VisaoLivraria {
	public static void main(String [] args) {
		// Declaração de variáveis 
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
									System.in));
		
		Livro objLivro = new Livro();
		
		// Entrada de dados 
		try {
			System.out.printf("Digite o título do livro ");
			objLivro.setTitulo(leitor.readLine());
			
			System.out.print("Digite o nome do Autor do livro: ");
			objLivro.setObjAutor(new Autor(leitor.readLine()));
			
			System.out.print("Digite o nome do Autor do livro: ");
			objLivro.setGenero(leitor.readLine());
			
		} catch (Exception erro ) {}
		 // Saida de dados 
		
		System.out.println("Título: " + objLivro.getTitulo());
		System.out.println("Autor: " + objLivro.getObjAutor().getNome());
		System.out.println("Gênero: " + objLivro.getGenero());
		}
	}
