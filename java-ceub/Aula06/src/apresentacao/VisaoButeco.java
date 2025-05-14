package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Importa classes do pacote negocio, que representam os drinks e a interface Mixer
import negocio.Mixer;
import negocio.Caipirinha;
import negocio.Drink;
import negocio.DryMartini;
import negocio.MoscowMile;  // Atenção: normalmente o drink é "Moscow Mule", veja se o nome está correto no seu projeto
import negocio.OldFashion;

public class VisaoButeco {
    public static void main(String[] args) {
        // Cria um BufferedReader para leitura de dados do teclado
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        
        // Declara um objeto Drink que será instanciado dependendo da escolha do usuário
        Drink objDrink = null;
        
        // Variável para armazenar a opção digitada pelo usuário
        int opcao = 0;

        try {
            // Exibe o cardápio para o usuário
            System.out.println("==================");
            System.out.println("|    Cardapio     |");
            System.out.println("==================");
            System.out.println("| 1 - Caipirinha  |");
            System.out.println("| 2 - Dry Martini |");
            System.out.println("| 3 - Old Fashion |");
            System.out.println("| 4 - Moscow Mule |");
            System.out.println("===================");

            // Lê a opção escolhida pelo usuário e converte para inteiro
            opcao = Integer.parseInt(leitor.readLine());

            // Cria o objeto correspondente ao drink escolhido pelo usuário
            switch (opcao){
                case 1:
                    objDrink = new Caipirinha();  // Instancia Caipirinha
                    break;

                case 2:
                    objDrink = new DryMartini();  // Instancia Dry Martini
                    break;

                case 3: 
                    objDrink = new OldFashion();  // Instancia Old Fashion
                    break;

                case 4:
                    objDrink = new MoscowMile();  // Instancia Moscow Mule (verificar nome correto)
                    break;
            }

            // Chama o método misturar() da interface Mixer — assume-se que Drink implementa Mixer
            ((Mixer) objDrink).misturar();
            
            // Chama o método beber() do objeto Drink para simular o consumo do drink
            objDrink.beber();

        } catch (Exception e) {
            // Caso ocorra alguma exceção (como erro de entrada), imprime a mensagem de erro
            System.out.println(e);
        }
    }
}
