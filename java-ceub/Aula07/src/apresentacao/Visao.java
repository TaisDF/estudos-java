package apresentacao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.PlainView; // Import não utilizado, pode ser removido

// Classe Visao que estende JFrame para criar uma janela gráfica
public class Visao extends JFrame {
    // Número de versão para serialização da classe (usado pelo Java para controle interno)
    private static final long serialVersionUID = 1L;

    // Cria um objeto JPanel do tipo Painel (classe customizada para desenhar gráficos)
    private JPanel obJPainel = new Painel();

    // Método principal que inicia a aplicação
    public static void main(String[] args) {
        // Cria uma instância da janela Visao e a torna visível
        new Visao().setVisible(true);
    }

    // Construtor da classe Visao que configura a janela
    public Visao() {
        // Define o título da janela
        setTitle("Minha Primeira Janela JAVA!");
        // Define o tamanho da janela (largura x altura)
        setSize(1024, 768);
        // Define a ação padrão ao clicar no X da janela (encerra o programa)
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Centraliza a janela na tela (posição relativa a null = centro)
        setLocationRelativeTo(null);

        // Define o conteúdo da janela como o painel customizado obJPainel
        setContentPane(obJPainel);
    }
}

