package negocio;

public class Drink {
    private Ingredientes[] colecao = new Ingredientes[10];
    private int qtdIngredientes = 0;

    public void adicionar(Ingredientes objIngredientes){
        colecao[qtdIngredientes] = objIngredientes;
        qtdIngredientes++;
    }
    public void beber(){
        for(int i = 0; i< qtdIngredientes; i++){
            System.out.println(colecao[i].getQuantidade() + " " + colecao[i].getUnidade() + " de " + colecao[i].getNome());
        } 
    }
}
