package negocio;

public class MoscowMile extends Drink implements Mixer{
    public void misturar(){
        super.adicionar(new Ingredientes("Cachaca", 100, "ml"));
        super.adicionar(new Ingredientes("Limao", 3, "unidade"));
        super.adicionar(new Ingredientes("Acucar", 5, "g"));
        super.adicionar(new Ingredientes("Gengibre", 20, "g"));        super.adicionar(new Ingredientes("Cachaca", 100, "ml"));
        super.adicionar(new Ingredientes("Espuma de Gengibre", 50, "ml"));
    }
}
