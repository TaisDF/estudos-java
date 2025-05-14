package apresentacao; // Define o pacote da classe, geralmente usado para organização do projeto.

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Colaborador;
import negocio.Gerente;

/**
 * Classe VisaoRH representa a interface de entrada e saída do sistema de RH.
 * Utiliza entrada de dados pelo console e instancia objetos das classes Colaborador ou Gerente.
 */
public class VisaoRH {
    public static void main(String[] args) {
        // BufferedReader é usado para ler entrada do teclado de forma eficiente
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        // Declarando uma referência para Colaborador (superclasse de Gerente)
        Colaborador objColaborador = null;

        // String para armazenar a opção do usuário (C ou G)
        String opcao = "";

        // Bloco de entrada de dados
        try {
            System.out.println("Digite <C> para colaborador ou <G> para gerente: ");
            opcao = leitor.readLine(); // Lê a escolha do usuário

            // Se a opção for "C" (Colaborador), cria um novo Colaborador
            // Caso contrário, cria um novo Gerente (polimorfismo)
            if(opcao.equalsIgnoreCase("C")){ 
                objColaborador = new Colaborador();
            } else {
                objColaborador = new Gerente(); // Upcasting: Gerente é tratado como Colaborador
            }

            // Lê e define a matrícula
            System.out.println("Digite a matricula: ");
            objColaborador.setMatricula(Integer.parseInt(leitor.readLine()));

            // Lê e define o nome
            System.out.println("Digite o nome: ");
            objColaborador.setNome(leitor.readLine());

            // Lê e define o salário
            System.out.println("Digite o salario: ");
            objColaborador.setSalario(Integer.parseInt(leitor.readLine()));

            // Se for um gerente, também lê o bônus
            if(!opcao.equalsIgnoreCase("C")){
                System.out.println("Digite o bonus: ");
                ((Gerente) objColaborador).setBonus(Double.parseDouble(leitor.readLine())); 
                // Downcasting para acessar o método setBonus, que só existe em Gerente
            }

        } catch (Exception e) {
            // Captura qualquer exceção lançada durante a entrada de dados
            System.out.println("ERRO!" + e);
        }

        // Bloco de saída de dados
        System.out.println("Matricula: " + objColaborador.getMatricula());
        System.out.println("Nome: " + objColaborador.getNome());
        System.out.println("Salario: " + objColaborador.getSalario());
    }
}
