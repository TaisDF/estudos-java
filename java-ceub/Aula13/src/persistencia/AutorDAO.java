package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Autor;

public class AutorDAO {
    //Propriedades da Classe
    // A instância de BancoDeDados que será utilizada para conectar ao banco de dados
    private BancoDeDados objBancoDeDados = new BancoDeDados();
    // O PreparedStatement usado para executar a consulta no banco de dados
    private PreparedStatement objExecucao = null;
    // O ResultSet que irá armazenar os resultados da consulta SQL
    private ResultSet objCursor = null;

    //Metodos da Classe

    public Collection<Autor> getTodos() throws Exception {
        // Criação de uma lista que armazenará os objetos Autor
        ArrayList<Autor> colecao = new ArrayList<Autor>();
        // Estabelecendo a conexão com o banco de dados
        objBancoDeDados.conectar();
        // Preparando a consulta SQL para selecionar todos os registros da tabela "autor"
        objExecucao = objBancoDeDados.getObjConexao().prepareStatement("SELECT * FROM autor");
        // Executando a consulta e armazenando o resultado no ResultSet
        objCursor = objExecucao.executeQuery();

        // Iterando sobre os resultados da consulta
        while (objCursor.next()){
            // Adicionando um novo objeto Autor à coleção, preenchendo com os dados da consulta
            colecao.add(new Autor(objCursor.getInt("idautor"), // Obtendo o ID do autor
            objCursor.getString("autor_nome"))); // Obtendo o nome do autor
        }
        // Desconectando do banco de dados após a execução da consulta
        objBancoDeDados.desconectar();
        // Retornando a coleção de autores recuperados
        return colecao;
    }
}
