package MenuRPG;

public class Mage extends Pessoa {
    private int roupa = 0, pet = 0;

    public Mage(String nome, int idade, double tamanho, int nivel){
        super(nome, idade, tamanho, nivel);
    }
    public int adicionaPet(int num){
        if(num <= 0 || num >= 4){
            throw new IllegalArgumentException("Essa pet não é válido");
        }
        this.pet = num;
        return pet;
    }
    public int getRoupa(){
        return this.roupa;
    }
    public int getPet(){
        return this.pet;
    }
    public int addRoupa(int num){
        this.roupa = num;
        return roupa;
    }
    public int addPet(int num){
        this.pet = num;
        return pet;
    }
    @Override
    public String toString() {
        
        return super.toString();
    }
    @Override
    public String totalCarga() {
        
        return null;
    }
    
}
