package negocio;

public class Cilindro implements Solido{
    private double raio = 0;
    private double altura = 0;

    public Cilindro(double raio, double altura){
        super();
        this.raio = raio;
        this.altura = altura;
    }

    public Cilindro() {

    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        return (2 * Math.PI * Math.pow(getRaio(), 2) + 2 * Math.PI * getRaio() * getAltura());
    }
    public double calcularVolume(){
        return (Math.PI * Math.pow(getRaio(), 2) * getAltura());
    }
    
}
