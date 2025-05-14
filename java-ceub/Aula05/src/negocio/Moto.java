package negocio;

public class Moto extends Veiculo {
    // Properties
    private int cilindrada = 0;

    // Constructors
    public Moto() {
        super();
    }

    public Moto(String modelo, Fabricante objFabricante, String cor, int cilindrada) {
        super(modelo, objFabricante, cor);
        this.cilindrada = cilindrada;
    }

    // Getters and Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    
}
