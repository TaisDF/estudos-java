package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aguia;
import negocio.Animal;
import negocio.Ave;
import negocio.Cachorro;
import negocio.Leopardo;
import negocio.Mamifero;

public class VisaoZoo {
    public static void main(String[] args) {
        // Declaracao do BufferedReader para leitura de dados do console
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        
        Animal objAnimal = null;  // Referência polimórfica para Animal (pode ser Cachorro, Leopardo ou Aguia)
        String opcao = "";        // Armazena a escolha do usuário para tipo do animal
        
        try {
            // Solicita o tipo do animal ao usuário
            System.out.println("Digite <C> para cachorro, <L> para leopardo ou <A> para aguia: ");
            opcao = leitor.readLine();

            // Cria o objeto conforme a opção escolhida (uso de polimorfismo)
            if (opcao.equalsIgnoreCase("C")) {
                objAnimal = new Cachorro();
            }
            if (opcao.equalsIgnoreCase("L")) {
                objAnimal = new Leopardo();
            } else {
                objAnimal = new Aguia();
            }

            // Entrada dos dados comuns a todos os animais
            System.out.println("Digite o nome: ");
            objAnimal.setNome(leitor.readLine());

            System.out.println("Digite a altura: ");
            objAnimal.setAltura(Double.parseDouble(leitor.readLine()));

            System.out.println("Digite o peso: ");
            objAnimal.setPeso(Double.parseDouble(leitor.readLine()));

            // Entrada dos dados específicos por tipo de animal, usando downcasting para acessar métodos das subclasses
            if (opcao.equalsIgnoreCase("C")) {
                // Cachorro é mamífero, por isso seta quantidade de leite (atributo de Mamifero)
                System.out.println("Qual e a quantidade de litros de leite: ");
                ((Mamifero) objAnimal).setLitrosLeite(Integer.parseInt(leitor.readLine()));

                System.out.println("Qual e a forca da mordida: ");
                ((Cachorro) objAnimal).setForcaMordida(Double.parseDouble(leitor.readLine()));

            }
            if (opcao.equalsIgnoreCase("L")) {
                // Leopardo também é mamífero
                System.out.println("Qual e a quantidade de litros de leite: ");
                ((Mamifero) objAnimal).setLitrosLeite(Integer.parseInt(leitor.readLine()));

                System.out.println("Qual e a velocidade: ");
                ((Leopardo) objAnimal).setVelocidade(Double.parseDouble(leitor.readLine()));

            } else {
                // Caso não seja cachorro nem leopardo, é uma ave (águia)
                System.out.println("Qual a quantidade de ovos: ");
                ((Ave) objAnimal).setQuantidadeOvos(Integer.parseInt(leitor.readLine()));

                System.out.println("Qual e a autonomia: ");
                ((Aguia) objAnimal).setAutonomia(Double.parseDouble(leitor.readLine()));
            }

        } catch (Exception e) {
            // Caso ocorra erro durante a entrada dos dados, exibe a mensagem
            System.out.println(e);
        }

        // Saída dos dados coletados
        System.out.println("Nome: " + objAnimal.getNome());
        System.out.println("IMC: " + objAnimal.calcularIMC());

        // Ações específicas conforme o tipo do animal
        if (opcao.equalsIgnoreCase("C")) {
            ((Cachorro) objAnimal).morder();
        }
        if (opcao.equalsIgnoreCase("L")) {
            ((Leopardo) objAnimal).correr();
        } else {
            ((Aguia) objAnimal).voar();
        }
    }
}
