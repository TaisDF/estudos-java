package persistencia;

import java.sql.PreparedStatement;

import negocio.Livro;

public class LivroDAO {
    //Propriedades da Classe
    private BancoDeDados objBancoDeDados = new BancoDeDados();
    private PreparedStatement objExecucao = null;

    //
    public void persistir(Livro objLivro) throws Exception{
        // Estabelecendo a conexão com o banco de dados
        objBancoDeDados.conectar();

        // Preparando a instrução SQL para inserir um novo livro na tabela "livro"
        objExecucao = objBancoDeDados.getObjConexao().prepareStatement("INSERT INTO livro" + 
                                        "(titulo, id_autor)" + "VALUES " + "(?,?)");
        // Definindo os valores para os parâmetros na instrução SQL - (?,?)
        // O primeiro parâmetro (1) é o título do livro
        objExecucao.setString(1, objLivro.getTitulo());
        // O segundo parâmetro (2) é o ID do autor, obtido do objeto Autor associado ao livro
        objExecucao.setInt(2, objLivro.getObjAutor().getId());

        // Executando a atualização (inserção) no banco de dados
        objExecucao.executeUpdate();
        // Desconectando do banco de dados após a operação
        objBancoDeDados.desconectar();
        
    }
}
