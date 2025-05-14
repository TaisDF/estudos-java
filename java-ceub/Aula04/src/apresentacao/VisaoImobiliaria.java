package apresentacao; // Define o pacote da classe

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Imovel; // Superclasse abstrata
import negocio.Novo;   // Subclasse que representa imóvel novo
import negocio.Velho;  // Subclasse que representa imóvel velho

public class VisaoImobiliaria {
    public static void main(String[] args) {
        // BufferedReader para leitura de dados do teclado de forma eficiente
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        
        // Declaração de variável do tipo Imovel (superclasse)
        Imovel objImovel = null;
        
        // Variável para armazenar a opção do usuário
        String opcao = "";

        try {
            // Solicita ao usuário o tipo de imóvel
            System.out.println("Digite <N> para novo e <V> para velho: ");
            opcao = leitor.readLine();

            // Cria o objeto apropriado com base na opção escolhida (polimorfismo)
            if(opcao.equalsIgnoreCase("N")){ 
                objImovel = new Novo();
            } else {
                objImovel = new Velho();
            }

            // Entrada dos atributos comuns a todos os imóveis
            System.out.println("Digite o endereco: ");
            objImovel.setEndereco(leitor.readLine());

            System.out.println("Digite a metragem: ");
            objImovel.setMetragem(Double.parseDouble(leitor.readLine()));

            System.out.println("Digite o valor: ");
            objImovel.setValor(Double.parseDouble(leitor.readLine()));

            // Entrada dos atributos específicos dependendo do tipo do imóvel
            if(opcao.equalsIgnoreCase("N")){
                System.out.println("Digite a adicional: ");
                // Downcasting para acessar método específico da subclasse Novo
                ((Novo) objImovel).setAdicional(Double.parseDouble(leitor.readLine()));
            } else {
                System.out.println("Digite a adicional: ");
                // Downcasting para acessar método específico da subclasse Velho
                ((Velho) objImovel).setDepreciacao(Double.parseDouble(leitor.readLine()));
            }
        } catch (Exception e) {
            // Tratamento simples de erros durante a entrada de dados
            System.out.println("ERRO! " + e);
        }

        // Exibe os dados do imóvel cadastrados
        System.out.println("Endereco: "+ objImovel.getEndereco());
        System.out.println("Metragem: "+ objImovel.getMetragem());
        System.out.println("Valor: "+ objImovel.getValor());
    }
}
