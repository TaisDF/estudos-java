package negocio;

public class Cadeira {
    //Propriedades da classe
    private String nome = "";

    //Metodos contrutores
    public Cadeira(){
        super();
    }

    public Cadeira(String nome){
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
