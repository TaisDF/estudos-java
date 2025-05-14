package negocio;

public class Velho extends Imovel {
    private double depreciacao;

    
    public Velho() {
        super();
    }

    public Velho(String endereco, double metragem, double valor, double depreciacao) {
        super(endereco, metragem, valor);
        this.depreciacao = depreciacao;
    }


    public double getDepreciacao() {
        return depreciacao;
    }
    public void setDepreciacao(double depreciacao) {
        this.depreciacao = depreciacao;
    }

    public double getValor(){
        return (super.getValor() - getDepreciacao());
    }

}
