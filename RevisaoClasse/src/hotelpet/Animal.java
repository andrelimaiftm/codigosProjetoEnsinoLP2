package hotelpet;

public abstract class Animal {

    protected String nome;
    protected String raca;

    public Animal(){}

    public Animal(String nome){
        this.nome = nome;
    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String caminha(){
        return this.nome + " está caminhando.";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    
    
    
}
