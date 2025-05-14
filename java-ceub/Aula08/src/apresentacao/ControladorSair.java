package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Classe ControladorSair que implementa ActionListener para tratar eventos de ação
public class ControladorSair implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        // Encerra o programa com status 0 (saída normal)
        System.exit(0);
    }
}
