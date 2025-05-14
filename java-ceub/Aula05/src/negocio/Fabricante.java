package negocio;

public class Fabricante {
    // Propriedades da classe
    private String nome = "";

    // Métodos construtores da classe
    public Fabricante() {
    }

    public Fabricante(String nome) {
        this.nome = nome;
    }
    
    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
