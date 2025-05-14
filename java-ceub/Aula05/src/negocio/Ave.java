package negocio;

public abstract class Ave extends Animal{
    private int quantidadeOvos = 0;

    public Ave() {
    }

    public Ave(double peso, double altura, String nome, int quantidadeOvos) {
        super(peso, altura, nome);
        this.quantidadeOvos = quantidadeOvos;
    }

    public int getQuantidadeOvos() {
        return quantidadeOvos;
    }

    public void setQuantidadeOvos(int quantidadeOvos) {
        this.quantidadeOvos = quantidadeOvos;
    }

    
    
}
