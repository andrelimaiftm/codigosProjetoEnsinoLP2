package hotelpet;

public class Cachorro extends Animal{

    public Cachorro(){

    }

    public Cachorro(String nome) {
        super(nome);
    }

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public String latir(){
        return "Auuu Auuuu Auuuu";
    }

    

    
    
    
}
