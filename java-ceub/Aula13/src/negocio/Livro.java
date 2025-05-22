package negocio;

import persistencia.LivroDAO;

public class Livro {
    //Propriedades da Classe
    private int id = 0;
    private String titulo = "";
    private Autor objAutor = null;


    //Construtores da Classe
    public Livro(int id, String titulo, Autor objAutor) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.objAutor = objAutor;
    }  

    public Livro() {
        super();
    }


    //getters e setters da Classe
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getObjAutor() {
        return objAutor;
    }

    public void setObjAutor(Autor objAutor) {
        this.objAutor = objAutor;
    }

    //Metodos da Classe
    public void persistir() throws Exception {
        new LivroDAO().persistir(this);
    }  
}
