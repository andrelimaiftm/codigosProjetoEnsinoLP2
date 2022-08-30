package hotelpet;

public class Gato extends Animal{

    public Gato(){}

    public Gato(String nome){
        super(nome);
    }

    public Gato(String nome, String raca){
        super(nome,raca);
    }

    public String miar(){
        return "miauuu miauuu miauuuu";
    }
    
}
