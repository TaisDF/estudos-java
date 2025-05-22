package apresentacao;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLimpar implements ActionListener {
    // Propriedades da Classe
    // O JTextField que contém o título do livro a ser manipulado
    private JTextField txtTitulo = null;

    // O JComboBox que contém os autores disponíveis
    private JComboBox<String> cboAutor = null;

    // Construtor da Classe
    /*
      Construtor que inicializa os componentes da interface gráfica que serão manipulados.
      
      @param txtTitulo O campo de texto onde o título do livro é inserido.
      @param cboAutor O combo box onde os autores são selecionados.
     */
    public ControladorLimpar(JTextField txtTitulo, JComboBox<String> cboAutor) {
        this.txtTitulo = txtTitulo;
        this.cboAutor = cboAutor;
    }

    // Implementação do método actionPerformed
    /*
       Método responsável por limpar o campo de título e resetar a seleção do combo box de autores.
       Este método será chamado quando o evento de ação ocorrer (ex. clique em um botão de limpar).
       @param e O evento que dispara a ação, mas não é utilizado neste caso.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Limpa o campo de texto do título
        txtTitulo.setText("");

        // Reseta o JComboBox para o primeiro item (índice 0), geralmente um valor padrão
        cboAutor.setSelectedIndex(0);
    }
}
