public class Carro {
    private final String nome;
    private int marcha;
    private double velocidade;
    private boolean ligado;

    
    public Carro(String nome){
        this.nome = nome;
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }
    public String getnome(){
        return this.nome;
    }
    public double getvelocidade(){
        return this.velocidade;
    }
    public int getmarcha(){
        return this.marcha;
    }

    public void upMarcha(){
        switch (this.marcha) {
            case 0:
                this.marcha = 1;
            break;

            case 1:
                this.marcha = 2;
            break;

            case 2:
                this.marcha = 3;
            break;

            case 3:
                this.marcha = 4;
            break;

            case 4:
                this.marcha = 5;
            break;       
        }       
    }
    public void downMarcha(){
        switch (this.marcha) {
            case 5:
                this.marcha = 4;
            break;

            case 4:
                this.marcha = 3;
            break;
            case 3:
                this.marcha = 2;
            break;

            case 2:
                this.marcha = 1;
            break;

            case 1:
                this.marcha = 0;
            break;
        } 
    }
    public boolean isLigado(){
        return this.ligado;
    }
    public void liga(){
        if(this.marcha == 0){
            if(this.ligado == false){
                this.ligado = true;
                System.out.println("Carro ligado!");
            }
        }else{
            System.out.println("Carro engatado, para ligar coloque no Neutro");
        }
    }
    public void desliga(){
        this.ligado = false;
    }
    public void freia(double valor){
        double teste = this.velocidade - valor;
        if(teste <= 0){
            this.velocidade = 0;
            System.out.println("Carro parado!");
        }else {
            this.velocidade -= valor;
            System.out.println("O carro está a: " + this.velocidade + "K/h");
           
        }
        

    }
    public void acelera(double valor){
        if (this.ligado == false || this.marcha == 0){
            System.out.println("Para carro andar deve estar ligado e" 
            + "com marcha engatada!\n Status atual: ligado: " 
            + this.ligado + ", " + "marcha: " + this.marcha);
        }else if(this.ligado == true  && this.marcha >= 1){
            this.velocidade += valor;
            if(this.marcha == 2 && this.velocidade > 40){
                this.velocidade = 40;
            }else if(this.marcha == 3 && this.velocidade > 60){
                this.velocidade = 60;
            }else if(this.marcha == 4 && this.velocidade > 80){
                this.velocidade = 80;
            }else if(this.marcha == 5 && this.velocidade > 100){
                this.velocidade = 100;
            }else if(this.marcha == 1 && this.velocidade > 20){
                this.velocidade = 20;
            }
            System.out.println("Carro na velocidade: " 
            + this.velocidade + "K/h");      
        }
    }
}


