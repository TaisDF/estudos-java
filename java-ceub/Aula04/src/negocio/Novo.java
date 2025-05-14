package negocio;

public class Novo extends Imovel {
    private double adicional = 0;

    public Novo(){
        super();
    }

    public Novo(String endereco, double metragem, double valor, double adicional){
        super(endereco, metragem, valor);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double getValor(){
        return (super.getValor() + getAdicional());
    }
}
