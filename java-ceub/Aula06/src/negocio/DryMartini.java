package negocio;

public class DryMartini extends Drink implements Mixer{
    public void misturar(){
        super.adicionar(new Ingredientes("Gyn", 100, "ml"));
        super.adicionar(new Ingredientes("Vodka", 50, "ml"));
        super.adicionar(new Ingredientes("Vermute", 10, "ml"));
        super.adicionar(new Ingredientes("Gelo", 10, "pedras"));
        super.adicionar(new Ingredientes("Azeitona", 3, "unidade"));

    }
}
