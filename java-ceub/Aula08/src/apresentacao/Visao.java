package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// Classe Visao que representa a janela principal da aplicação gráfica
public class Visao extends JFrame{
    private static final long serialVersionUID = 1L; // Identificador da versão da classe para serialização

    // Declaração dos componentes da interface gráfica

    // Barra de menu e seus itens
    private JMenuBar barraDeMenu = new JMenuBar();
    private JMenu mniArquivo = new JMenu("Arquivo");
    private JMenuItem mniAbrir = new JMenuItem("Abrir");
    private JMenuItem mniSair = new JMenuItem("Sair");
    private JMenuItem mniNovo = new JMenuItem("Novo");
    private JMenu mniEditar = new JMenu("Editar");
    private JMenuItem mniCopiar = new JMenuItem("Copiar");
    private JMenuItem mniColar = new JMenuItem("Colar");

    // Botão para gravar dados
    private JButton btnGravar = new JButton("Gravar");

    // Rótulo e campo de texto para usuário
    private JLabel lblUsuario = new JLabel("Usuário");
    private JTextField txtUsuario = new JTextField();

    // Rótulo e área de texto para descrição, com barra de rolagem
    private JLabel lnlDescricao = new JLabel("Descrição");
    private JTextArea txtDescricao = new JTextArea();
    private JScrollPane jspDescricao = new JScrollPane(txtDescricao);

    // Rótulo e combo box para seleção de opções
    private JLabel lblOpcao = new JLabel("Opção");
    private JComboBox <String> cboOpcao = new JComboBox<String>();

    // Caixa de seleção para salvar senha
    private JCheckBox chkSalvarSenha = new JCheckBox("Salvar Senha");

    // Rótulo e botões de opção para seleção de sexo
    private JLabel lblSexo = new JLabel("Sexo");
    private JRadioButton opcMasculino = new JRadioButton("Masculino");
    private JRadioButton opcFeminino = new JRadioButton("Feminino");
    private JRadioButton opcNaoBinario = new JRadioButton("Não Binário");
    private ButtonGroup btgSexo = new ButtonGroup(); // Agrupa os radio buttons para seleção única

    // Rótulo, lista e barra de rolagem para banco de dados
    private JLabel lblBancoDeDados = new JLabel("Banco de Dados");
    private JList<String> lstBancoDeDados = new JList<String>();
    private JScrollPane jspBancoDeDados = new JScrollPane(lstBancoDeDados);
    private DefaultListModel<String> dlmBancoDeDados = new DefaultListModel<String>();

    // Método principal para iniciar a aplicação
    public static void main(String[] args) {
        new Visao().setVisible(true); // Cria e exibe a janela
    }

    // Construtor da classe Visao
    public Visao(){
        setTitle("Janela de Exemplificação de Uso de Controles"); // Define título da janela
        setSize(1024,768); // Define tamanho da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setLayout(null); // Usa layout absoluto para posicionamento manual dos componentes

        // Configuração da barra de menu
        setJMenuBar(barraDeMenu);
        barraDeMenu.add(mniArquivo);
        barraDeMenu.add(mniEditar);
        mniArquivo.add(mniAbrir);
        mniArquivo.add(mniNovo);
        mniArquivo.addSeparator(); // Adiciona separador entre itens do menu
        mniArquivo.add(mniSair);
        mniEditar.add(mniCopiar);
        mniEditar.add(mniColar);

        // Configuração das ações dos itens do menu
        mniSair.addActionListener(new ControladorSair()); // Ação para sair da aplicação
        mniCopiar.addActionListener(new ControladorCopiar()); // Ação para copiar (exemplo)

        // Configuração do botão Gravar e sua posição
        btnGravar.setBounds(462,660, 100, 30);
        add(btnGravar);

        // Configuração do rótulo e campo de texto para Usuário
        lblUsuario.setBounds(20,20, 200, 20);
        add(lblUsuario);

        txtUsuario.setBounds(20, 40, 150, 20);
        add(txtUsuario);

        // Configuração do rótulo e área de texto para Descrição
        lnlDescricao.setBounds(20, 70, 200, 20);
        add(lnlDescricao);

        jspDescricao.setBounds(20,90,970,200); // Barra de rolagem para área de texto
        add(jspDescricao);
        txtDescricao.setLineWrap(true); // Quebra de linha automática

        // Configuração do rótulo e combo box para opções
        lblOpcao.setBounds(20, 300, 200, 20);
        add(lblOpcao);
        cboOpcao.setBounds(20, 320, 200, 20);
        add(cboOpcao);
        cboOpcao.addItem("--Selecione--");
        cboOpcao.addItem("Opcao 1");
        cboOpcao.addItem("Opcao 2");
        cboOpcao.addItem("Opcao 3");

        // Configuração da checkbox para salvar senha
        chkSalvarSenha.setBounds(20, 350, 200, 20);
        add(chkSalvarSenha);

        // Configuração do rótulo para Sexo
        lblSexo.setBounds(20, 380, 200, 20);
        add(lblSexo);

        // Configuração dos botões de opção para sexo
        opcMasculino.setBounds(20, 400, 150, 20);
        add(opcMasculino);
        opcFeminino.setBounds(170, 400, 150, 20);
        add(opcFeminino);
        opcNaoBinario.setBounds(320, 400, 150, 20);
        add(opcNaoBinario);

        // Adiciona os radio buttons ao grupo para garantir seleção única
        btgSexo.add(opcFeminino);
        btgSexo.add(opcMasculino);
        btgSexo.add(opcNaoBinario);

        opcMasculino.setSelected(true); // Seleciona masculino como padrão

        // Configuração do rótulo, lista e barra de rolagem para banco de dados
        lblBancoDeDados.setBounds(20, 430, 200, 20);
        add(lblBancoDeDados);

        jspBancoDeDados.setBounds(20, 450, 970, 200);
        add(jspBancoDeDados);

        lstBancoDeDados.setModel(dlmBancoDeDados); // Define modelo para lista
        dlmBancoDeDados.addElement("Registro 1"); // Adiciona itens à lista
        dlmBancoDeDados.addElement("Registro 2");
        dlmBancoDeDados.addElement("Registro 3");

    }

}
