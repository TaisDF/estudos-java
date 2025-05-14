package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Importa as classes do pacote negocio relacionadas aos sólidos geométricos
import negocio.Cilindro;
import negocio.Cubo;
import negocio.Solido;

public class VisaoGeometria {
    public static void main(String[] args) {
        // Cria um BufferedReader para ler dados do teclado
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        
        // Declara um objeto do tipo Solido, que será instanciado como Cubo ou Cilindro
        Solido objSolido = null;
        
        // Variável para armazenar a escolha do usuário
        int opcao = 0;

        try {
            // Solicita ao usuário que escolha o tipo de sólido
            System.out.println("Digite <1> para cubo ou <2> para cilindro: ");
            opcao = Integer.parseInt(leitor.readLine());

            // Se a opção for 1, cria um Cubo
            if(opcao == 1){
                objSolido = new Cubo();

                // Solicita a medida da aresta do cubo
                System.out.println("Digite aresta: ");
                // Lê o valor da aresta e atribui ao objeto cubo
                ((Cubo) objSolido).setAresta(Double.parseDouble(leitor.readLine()));

            } else {
                // Se não for 1, considera que é 2 e cria um Cilindro
                objSolido = new Cilindro();

                // Solicita o raio do cilindro
                System.out.println("Digite o raio: ");
                ((Cilindro) objSolido).setRaio(Double.parseDouble(leitor.readLine()));

                // Solicita a altura do cilindro
                System.out.println("Digite a altura: ");
                ((Cilindro) objSolido).setAltura(Double.parseDouble(leitor.readLine()));
            }
        } catch (Exception e) {
            // Caso ocorra erro na entrada ou conversão, imprime a mensagem de erro
            System.out.println(e);
        }

        // Exibe a área calculada do sólido (polimorfismo: método definido na classe Solido e implementado nas subclasses)
        System.out.println("Area: " + objSolido.calcularArea());

        // Exibe o volume calculado do sólido
        System.out.println("Volume: " + objSolido.calcularVolume());
    }
}
