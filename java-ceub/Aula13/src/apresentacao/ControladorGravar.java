package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Autor;
import negocio.Livro;

public class ControladorGravar implements ActionListener {
    // Propriedades da Classe
    private JTextField txtTitulo = null;  // Campo de texto para o título do livro
    private JComboBox<String> cboAutor = null;  // Combo box para selecionar o autor do livro

    // Construtor da Classe
    /*
      Construtor que inicializa os componentes da interface gráfica que serão manipulados.
      
      @param txtTitulo O campo de texto onde o título do livro é inserido.
      @param cboAutor O combo box onde os autores são selecionados.
     */
    public ControladorGravar(JTextField txtTitulo, JComboBox<String> cboAutor) {
        super();
        this.txtTitulo = txtTitulo;
        this.cboAutor = cboAutor;
    }

    // Implementação do método actionPerformed
    /*
      Método que será chamado quando o evento de ação ocorrer, por exemplo, ao clicar em um botão para gravar o livro.
      O método cria um objeto `Livro` com os dados inseridos na interface e tenta persistir esses dados.
      
      @param e O evento de ação que dispara o método.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Criação de um novo objeto Livro
        Livro objLivro = new Livro();

        // Definindo o título do livro com o texto inserido no campo txtTitulo
        objLivro.setTitulo(txtTitulo.getText());

        // Definindo o autor do livro com base na seleção do JComboBox. 
        // O índice selecionado no JComboBox é passado para o construtor do autor.
        objLivro.setObjAutor(new Autor(cboAutor.getSelectedIndex(), ""));

        try {
            // Persistindo o livro (gravando no banco de dados ou sistema)
            objLivro.persistir();
            
            // Exibindo uma mensagem de sucesso para o usuário
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");

        } catch (Exception erro) {
            // Exibindo uma mensagem de erro caso ocorra alguma exceção
            JOptionPane.showMessageDialog(null, erro);
        }
    }
}
