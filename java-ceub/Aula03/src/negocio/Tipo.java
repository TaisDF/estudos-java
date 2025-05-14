package negocio;

public class Tipo {
        //Propiedades de classe
        private String descricao = "";

        public Tipo(){ 
            super();
        }
        public Tipo(String descricao){
            super(); // super() invoca o construtor da superclasse
            this.descricao = descricao;
        
        //Getters e Setters
        }
        public String getDescricao() {
            return descricao;
        }
    
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
}
