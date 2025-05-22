package apresentacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Autor;

public class VisaoLivro extends JFrame {
    private static final long serialVersionUID = 1L;

    // Componentes da interface gráfica
    private JLabel lblTitulo = new JLabel("Título");  // Rótulo para o campo de título
    private JTextField txtTitulo = new JTextField();  // Campo de texto para inserir o título do livro

    private JLabel lblAutor = new JLabel("Autor");  // Rótulo para o campo de autor
    private JComboBox<String> cboAutor = new JComboBox<String>();  // ComboBox para selecionar o autor do livro

    private JButton btnGravar = new JButton("Gravar");  // Botão para gravar o livro
    private JButton btnLimpar = new JButton("Limpar");  // Botão para limpar os campos
    private JButton btnSair = new JButton("Sair");  // Botão para sair da aplicação

    public static void main(String[] args) {
        // Criação da janela principal da aplicação
        new VisaoLivro().setVisible(true);
    }

    public VisaoLivro() {
        // Configurações iniciais da janela
        setTitle("Cadastro de Livros");  // Define o título da janela
        setSize(300, 200);  // Define o tamanho da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // Define o comportamento quando a janela for fechada
        setLocationRelativeTo(null);  // Centraliza a janela na tela
        setLayout(null);  // Utiliza layout nulo para controle manual das posições dos componentes

        // Definindo a posição e o tamanho dos componentes na janela
        lblTitulo.setBounds(10, 10, 200, 20);  // Define a posição e tamanho do rótulo do título
        add(lblTitulo);  // Adiciona o rótulo à janela
        txtTitulo.setBounds(10, 30, 265, 20);  // Define a posição e tamanho do campo de texto para o título
        add(txtTitulo);  // Adiciona o campo de texto à janela

        lblAutor.setBounds(10, 60, 200, 20);  // Define a posição e tamanho do rótulo de autor
        add(lblAutor);  // Adiciona o rótulo à janela
        cboAutor.setBounds(10, 80, 265, 20);  // Define a posição e tamanho do combo box para os autores
        add(cboAutor);  // Adiciona o combo box à janela

        // Adicionando o item padrão ao JComboBox
        cboAutor.addItem("---Escolha o Autor---");

        // Tentando adicionar todos os autores ao JComboBox
        try {
            for (Autor objAutor : Autor.getTodos()) {
                cboAutor.addItem(objAutor.getNome());  // Adiciona o nome de cada autor no combo box
            }
        } catch (Exception e) {
            // Se ocorrer algum erro ao carregar os autores, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, e);
        }

        // Definindo o comportamento e a posição do botão "Gravar"
        btnGravar.setBounds(20, 115, 80, 30);  // Define a posição e tamanho do botão
        add(btnGravar);  // Adiciona o botão à janela
        btnGravar.addActionListener(new ControladorGravar(txtTitulo, cboAutor));  // Adiciona o ActionListener que irá tratar a ação de gravar

        // Definindo o comportamento e a posição do botão "Limpar"
        btnLimpar.setBounds(108, 115, 80, 30);  // Define a posição e tamanho do botão
        add(btnLimpar);  // Adiciona o botão à janela
        btnLimpar.addActionListener(new ControladorLimpar(txtTitulo, cboAutor));  // Adiciona o ActionListener que irá tratar a ação de limpar os campos

        // Definindo o comportamento e a posição do botão "Sair"
        btnSair.setBounds(196, 115, 80, 30);  // Define a posição e tamanho do botão
        add(btnSair);  // Adiciona o botão à janela
        btnSair.addActionListener(new ControladorSair());  // Adiciona o ActionListener que irá tratar a ação de sair da aplicação
    }
}
