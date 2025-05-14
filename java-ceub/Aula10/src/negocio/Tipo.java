package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Tipo {
    // Propriedade que armazena a descrição do tipo
    private String descricao = "";

    // Construtor que inicializa o objeto com uma descrição específica
    public Tipo(String descricao) {
        super();
        this.descricao = descricao;
    }

    // Construtor padrão sem parâmetros
    public Tipo() {
        super();
    }

    // Getter para acessar a descrição do tipo
    public String getDescricao() {
        return descricao;
    }

    // Setter para modificar a descrição do tipo
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método estático que retorna uma coleção com todos os tipos pré-definidos
    public static Collection<Tipo> getTodos() throws Exception{
        // Cria uma lista para armazenar os tipos
        ArrayList<Tipo> colecao = new ArrayList<Tipo>();

        // Adiciona os tipos na lista
        colecao.add(new Tipo("Livro"));
        colecao.add(new Tipo("Eletrônico"));
        colecao.add(new Tipo("Roupa"));
        colecao.add(new Tipo("Brinquedo"));
        colecao.add(new Tipo("Jogos"));

        // Retorna a lista com os tipos
        return colecao;
    }
       
}
