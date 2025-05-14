package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

// Classe ControladorCopiar que implementa ActionListener para responder a eventos de ação
public class ControladorCopiar implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        // Exibe uma caixa de diálogo com a mensagem "Ola"
        JOptionPane.showMessageDialog(null, "Ola");
    }
}
