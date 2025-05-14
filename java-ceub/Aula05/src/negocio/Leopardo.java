package negocio;

public class Leopardo extends Mamifero {
    private double velocidade = 0;

    
    public Leopardo() {
    }


    public Leopardo(double peso, double altura, String nome, int litrosLeite, double velocidade) {
        super(peso, altura, nome, litrosLeite);
        this.velocidade = velocidade;
    }


    public double getVelocidade() {
        return velocidade;
    }


    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    } 

    public void correr(){
        System.out.println("Run Forest! Run!");
    }
}
