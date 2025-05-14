package apresentacao;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Tipo;

public class VisaoProduto extends JFrame{
    //Propriedades da classe
    private static final long serialVersionUID = 1L;

    private JLabel lblNome = new JLabel("Nome");
    private JTextField txtNome = new JTextField();

    
    private JLabel lblPreco = new JLabel("Preço");
    private JTextField txtPreco = new JTextField();

    private JLabel lblTipo = new JLabel("Tipo");
    private JComboBox<String> cboTipo = new JComboBox<String>();

    private JCheckBox chkPerecivel = new JCheckBox("Perecivel");

    private JLabel lblDetahamento = new JLabel("Detalhamento");
    private JTextArea txtDetalhamento = new JTextArea();
    private JScrollPane jspDetalhamento = new JScrollPane(txtDetalhamento);

    private JButton bntGravar = new JButton("Gravar");
    private JButton bntLimpar = new JButton("Limpar");
    private JButton bntSair = new JButton("Sair");


    //Método principal da classe
    public static void main(String[] args) {
        new VisaoProduto().setVisible(true);
    }

    //Método construtor da classe
    public VisaoProduto(){
        //Configuração da janela
        setTitle("Cadastro de Produtos");
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Configuração da caixa do nome
        lblNome.setBounds(10,10,200,20);
        add(lblNome);
        txtNome.setBounds(10,30,365,20);
        add(txtNome);

        //Configuração da caixa de preço
        lblPreco.setBounds(10, 60, 100, 20);
        add(lblPreco);
        txtPreco.setBounds(10, 80, 100, 20);
        add(txtPreco);

        // Configuração da combo do tipo

        lblTipo.setBounds(10,110,200,20);
        add(lblTipo);
        cboTipo.setBounds(10,130,365,20);
        add(cboTipo);
        cboTipo.addItem("--- Selecione o Tipo ---");

        try {
            for (Tipo objTipo : Tipo.getTodos()){
                cboTipo.addItem(objTipo.getDescricao());

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        //Configuração caixa perecível
        chkPerecivel.setBounds(7,160,200,20);
        add(chkPerecivel);

        // Configuração da caixa do detalhamento
        lblDetahamento.setBounds(10,190,200,20);
        add(lblDetahamento);
        jspDetalhamento.setBounds(10, 210, 365, 150);
        add(jspDetalhamento);
        txtDetalhamento.setLineWrap(true);

        // Configuração dos botões 
        bntGravar.setBounds(30,370,100,30);
        add(bntGravar);
        bntGravar.addActionListener(new ControladorGravar(txtNome,txtPreco,txtDetalhamento,cboTipo,chkPerecivel));

        bntLimpar.setBounds(140,370,100,30);
        add(bntLimpar); 
        bntLimpar.addActionListener(new ControladorLimpar(txtNome,txtPreco,txtDetalhamento,cboTipo,chkPerecivel));
        
        bntSair.setBounds(250,370,100,30);
        add(bntSair);
        bntSair.addActionListener(new ControladorSair());


    }
}
