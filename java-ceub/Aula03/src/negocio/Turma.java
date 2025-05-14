package negocio;

public class Turma {
    //Propriedades da Classe

    // Declaração de uma variável do tipo Cadeira, que é inicializada como null. 
    // 'objCadeira' representa uma instância de um objeto Cadeira que, provavelmente, vai armazenar informações sobre a cadeira ou disciplina em questão.
    private Cadeira objCadeira = null; 

    // Declaração de uma variável do tipo Professor, também inicializada como null. 
    // 'objProfessor' será usada para armazenar uma referência a um objeto Professor, que provavelmente representa um professor da cadeira ou disciplina.
    private Professor objProfessor = null; 

    // Declaração de uma variável do tipo String, inicializada como uma string vazia. 
    // 'letra' provavelmente será usada para armazenar algum tipo de código ou identificação, como uma letra associada a uma turma ou categoria.
    private String letra = ""; 

    // Declaração de uma variável do tipo Aluno, inicializada como um array de tamanho 50.
    // 'colecao' vai armazenar até 50 objetos do tipo Aluno, representando uma coleção de alunos (provavelmente, os alunos matriculados na cadeira ou turma).
    private Aluno[] colecao = new Aluno[50];

    //Metodos Construtores 
    public Cadeira getObjCadeira() {
        return objCadeira;
    }

    public void setObjCadeira(Cadeira objCadeira) {
        this.objCadeira = objCadeira;
    }

    public Professor getObjProfessor() {
        return objProfessor;
    }

    public void setObjProfessor(Professor objProfessor) {
        this.objProfessor = objProfessor;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Aluno[] getColecao() {
        return colecao;
    }

    public void setColecao(Aluno[] colecao) {
        this.colecao = colecao;
    } 

    	//Metodos da classe
	int qtdAlunos = 0;
	public void adicionarAluno (Aluno objAluno) {

		colecao [qtdAlunos] = objAluno;

		qtdAlunos++;

	}

	//Listar os alunos

	public void listarAlunos() {

		System.out.println("Matrícula\tNome");

		for (int i = 0; i < qtdAlunos ; i++) {

			System.out.println(
					colecao[i].getMatricula() + "\t" + colecao[i].getNome());
		}
    }
}
