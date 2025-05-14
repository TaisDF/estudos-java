package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener{
    private JTextField txtNome = null;
    private JTextField txtPreco = null;
    private JTextArea txtDetalhamento = null;
    private JComboBox<String> cboTipo = null;
    private JCheckBox chkPerecivel = null;

    //Construtor
    

    public void actionPerformed(ActionEvent e){
        txtNome.setText("");
        txtPreco.setText("");
        txtDetalhamento.setText("");
        cboTipo.setSelectedIndex(0);
        chkPerecivel.setSelected(false);
    }

    public ControladorLimpar(JTextField txtNome, JTextField txtPreco, JTextArea txtDetalhamento,
            JComboBox<String> cboTipo, JCheckBox chkPerecivel) {
        this.txtNome = txtNome;
        this.txtPreco = txtPreco;
        this.txtDetalhamento = txtDetalhamento;
        this.cboTipo = cboTipo;
        this.chkPerecivel = chkPerecivel;
    }
}


