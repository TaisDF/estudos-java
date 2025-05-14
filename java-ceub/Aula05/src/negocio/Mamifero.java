package negocio;

public abstract class Mamifero extends Animal {
    //Propriedade da Classe
    private int litrosLeite = 0;

    
    public Mamifero() {
    }

    public Mamifero(double peso, double altura, String nome, int litrosLeite) {
        super(peso, altura, nome);
        this.litrosLeite = litrosLeite;
    }

    public int getLitrosLeite() {
        return litrosLeite;
    }

    public void setLitrosLeite(int litrosLeite) {
        this.litrosLeite = litrosLeite;
    }


    
}
