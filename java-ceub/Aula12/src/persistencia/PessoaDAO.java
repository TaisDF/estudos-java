package persistencia;

import java.sql.PreparedStatement;

import negocio.Pessoa;

public class PessoaDAO {
    //Propriedades da classe
    private BancoDeDados objBancoDeDados = new BancoDeDados();
    private PreparedStatement objExecucao = null;

    //Métodos da classe
    public void persistir (Pessoa objPessoa) throws Exception{
        objBancoDeDados.conectar();

        objExecucao = objBancoDeDados.getObjConexao().prepareStatement("INSERT INTO tb_pessoa " + "(nome, endereco, telefone) " + "VALUES " + "(?, ?, ?)");

        objExecucao.setString(1, objPessoa.getNome());
        objExecucao.setString(2, objPessoa.getEndereco());
        objExecucao.setString(3, objPessoa.getTelefone());
        
        objExecucao.executeUpdate();
        
        objBancoDeDados.desconectar();
    }
}
