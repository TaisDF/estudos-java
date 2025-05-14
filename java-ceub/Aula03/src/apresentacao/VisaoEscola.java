package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aluno;
import negocio.Cadeira;
import negocio.Professor;
import negocio.Turma;

public class VisaoEscola {
    public static void main(String[] args) {
        // Declaração de Variáveis
        // 'leitor' é um objeto do tipo BufferedReader, utilizado para ler a entrada do usuário.
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
    
        // Instancia objetos das classes Turma e Professor.
        Turma objTurma = new Turma();  // Objeto para representar a turma.
        Professor objProfessor = new Professor();  // Objeto para representar o professor.
    
        // Entrada de dados
        try {
            // Solicita ao usuário o nome da cadeira (disciplina) e cria um objeto Cadeira.
            System.out.println("Digite o nome da cadeira: ");
            objTurma.setObjCadeira(new Cadeira(leitor.readLine()));  // Cria um objeto 'Cadeira' e associa à turma.
    
            // Solicita o nome do professor e atribui ao objeto 'Professor'.
            System.out.println("Digite o nome do professor: ");
            objProfessor.setNome(leitor.readLine());  // Define o nome do professor.
    
            // Solicita o título do professor e atribui ao objeto 'Professor'.
            System.out.println("Digite o titulo do professor: ");
            objProfessor.setTitulo(leitor.readLine());  // Define o título do professor.
    
            // Solicita o salário do professor e atribui ao objeto 'Professor'.
            System.out.println("Digite o salario do professor: ");
            objProfessor.setSalario(Double.parseDouble(leitor.readLine()));  // Converte a entrada para double e define o salário.
    
            // Loop para cadastro dos alunos na turma.
            do {
                // Cria um novo objeto Aluno para cada aluno a ser cadastrado.
                Aluno objAluno = new Aluno();
    
                // Solicita a matrícula do aluno e atribui ao objeto 'Aluno'.
                System.out.println("Digite a matricula do aluno: ");
                objAluno.setMatricula(Integer.parseInt(leitor.readLine()));  // Lê a matrícula e converte para inteiro.
    
                // Solicita o nome do aluno e atribui ao objeto 'Aluno'.
                System.out.println("Digite o nome do aluno: ");
                objAluno.setNome(leitor.readLine());  // Lê o nome e define no objeto 'Aluno'.
    
                // Adiciona o aluno à turma.
                objTurma.adicionarAluno(objAluno);  // Método para adicionar o aluno à turma.
    
            } while(leitor.readLine().equals("sim"));  // Condição para continuar o cadastro de alunos.
    
            // Após o loop de cadastro de alunos, associa o professor à turma.
            objTurma.setObjProfessor(objProfessor);  // Associa o professor à turma.
    
        } catch(Exception erro) {  // Captura quaisquer exceções e exibe uma mensagem de erro.
            System.out.println("ERRO: " + erro);  // Exibe o erro, caso algo dê errado durante a execução.
        }

        //Saida de dados

        System.out.println("Cadeira: " + objTurma.getObjCadeira().getNome());
        System.out.println("Professor: " + objTurma.getObjProfessor().getNome() + objTurma.getObjProfessor().getTitulo());
        System.out.println("Alunos: ");
        objTurma.listarAlunos();
    }

}
