package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Carro;        // Subclasse de Veiculo para carros
import negocio.Fabricante;   // Classe que representa o fabricante do veículo
import negocio.Moto;         // Subclasse de Veiculo para motos
import negocio.Veiculo;      // Superclasse abstrata Veiculo

public class VisaoConcessionaria {
    public static void main(String[] args) {
        // Leitor para entrada de dados via console
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        
        Veiculo objVeiculo = null;  // Variável polimórfica para armazenar carro ou moto
        String opcao = "";          // Armazena a escolha do usuário

        try {
            // Solicita ao usuário o tipo de veículo
            System.out.println("Digite <C> para carro ou <M> para moto: ");
            opcao = leitor.readLine();

            // Cria o objeto conforme a opção do usuário (polimorfismo)
            if(opcao.equalsIgnoreCase("C")) {
                objVeiculo = new Carro();
            } else {
                objVeiculo = new Moto();
            }

            // Entrada dos dados comuns a todos os veículos
            System.out.println("Digite o modelo: ");
            objVeiculo.setModelo(leitor.readLine());

            System.out.println("Digite o fabricante: ");
            // Cria um objeto Fabricante e associa ao veículo
            objVeiculo.setObjFabricante(new Fabricante(leitor.readLine()));

            System.out.println("Digite a cor: ");
            objVeiculo.setCor(leitor.readLine());

            // Entrada dos dados específicos conforme o tipo de veículo
            if(opcao.equalsIgnoreCase("C")) {
                System.out.println("Digite <S> se houver teto solar: ");
                // Downcasting para acessar método específico de Carro
                ((Carro) objVeiculo).setTetoSolar(leitor.readLine().equalsIgnoreCase("S"));
            } else {
                System.out.println("Digite a cilindrada: ");
                // Downcasting para acessar método específico de Moto
                ((Moto) objVeiculo).setCilindrada(Integer.parseInt(leitor.readLine()));
            }

        } catch (Exception erro) {
            // Caso ocorra algum erro na entrada de dados, exibe a mensagem
            System.out.println(erro);
        }

        // Exibe os dados do veículo cadastrados
        System.out.println("Modelo: " + objVeiculo.getModelo());
        System.out.println("Fabricante: " + objVeiculo.getObjFabricante().getNome());
        System.out.println("Cor: " + objVeiculo.getCor());

        // Exibe atributo específico de acordo com o tipo do veículo
        if(opcao.equalsIgnoreCase("C")) {
            System.out.println("Teto solar: " + (((Carro) objVeiculo).isTetoSolar() ? "SIM" : "NAO"));
        } else {
            System.out.println("Cilindrada: " + ((Moto)objVeiculo).getCilindrada());
        }
    }
}
