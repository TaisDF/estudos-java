package negocio;

public class Carro extends Veiculo {
    // Properties
    private boolean tetoSolar = false;

    public Carro() {
        super();
    }

    public Carro(String modelo, Fabricante objFabricante, String cor, boolean tetoSolar) {
        super(modelo, objFabricante, cor);
        this.tetoSolar = tetoSolar;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }
}
