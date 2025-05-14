package negocio;

public class Caipirinha extends Drink implements Mixer{
    public void misturar(){
        super.adicionar(new Ingredientes("Cachaca", 100, "ml"));
        super.adicionar(new Ingredientes("Limao", 3, "unidade"));
        super.adicionar(new Ingredientes("Acucar", 5, "g"));
        super.adicionar(new Ingredientes("Gelo", 8, "pedras"));

    }
}
