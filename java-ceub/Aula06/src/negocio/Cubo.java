package negocio;

public class Cubo implements Solido {
    private double aresta = 0;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public Cubo() {

    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    public double calcularArea(){
        return (6 * Math.pow(getAresta(), 2));
    }
    
    public double calcularVolume(){
        return (Math.pow(getAresta(), 3));
    }
}

