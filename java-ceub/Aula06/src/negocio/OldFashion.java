package negocio;

public class OldFashion extends Drink implements Mixer {
    public void misturar(){
        super.adicionar(new Ingredientes("Whiskey", 200, "ml"));
        super.adicionar(new Ingredientes("Laranja", 1, "casca"));
        super.adicionar(new Ingredientes("Acucar", 5, "g"));
        super.adicionar(new Ingredientes("Gelo", 1, "esfera"));
        super.adicionar(new Ingredientes("Bitter", 2, "gotas"));
    }
}
