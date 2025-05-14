package negocio;

public class Produto {

	// Atributo público que armazena o nome do produto
	public String nome = "";
	// Referência para o objeto Estante onde o produto está armazenado.
	private Estante objEstante = null;
	// Quantidade disponível do produto.
	private int quantidade = 0;
	

	// Construtor vazio (sem parâmetros)
	public Produto() {
		super();
	}

	// Construtor com parâmetros para inicializar todos os atributos.
	public Produto(String nome, int quantidade, Estante objEstante) {
		super(); // Chamada do construtor da superclasse
		this.nome = nome;
		this.quantidade = quantidade;
		this.objEstante = objEstante;

	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Estante getObjEstante() {
		return objEstante;
	}

	public void setObjEstante(Estante objEstante) {
		this.objEstante = objEstante;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	
}
