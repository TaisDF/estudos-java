package negocio;

public class Veiculo {
    // Properties
    private String modelo = "";
    private Fabricante objFabricante = null;
    private String cor = "";

    // Constructors
    public Veiculo() {}

    public Veiculo(String modelo, Fabricante objFabricante, String cor) {
        this.modelo = modelo;
        this.objFabricante = objFabricante;
        this.cor = cor;
    }

    // Getters and setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Fabricante getObjFabricante() {
        return objFabricante;
    }

    public void setObjFabricante(Fabricante objFabricante) {
        this.objFabricante = objFabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
}
