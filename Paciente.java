//Nome: André Mendes Pinto
public class Paciente {    
    /* nome (string), sexo(char), peso(double), idade(int) e altura (double) */
    private String nome;
    private char sexo;
    private double peso;
    private int idade;    
    private double altura;
    
    public void setnome(String nome){
        this.nome = nome;
    }
    public String getnome(){
        return this.nome;
    }
    public void setsexo(char sexo){
        if(sexo != 'M' && sexo != 'F') System.out.println("Esse sexo não é valido");
        else this.sexo = sexo;
    }
    public char getsexo(){
        return this.sexo;
    }
    public double getpeso(){
        return this.peso;
    }
    public void setidade(int idade){
        if(idade <= -1){
            System.out.println("Essa não é uma idade valida, informe outra");
        }else this.idade = idade;
        
    }
    public int getidade(){
        return this.idade;
    }
    public void setaltura(double altura){
        if(altura <= -1) System.out.println("Essa não é uma altura valida, informe outra");
        else this.altura = altura; 
        
    }
    public double getaltura(){
        return this.altura;
    }
    //um construtor com os parâmetros nome e sexo
    //-um construtor que receba os cinco parâmetros (nome, sexo, altura, peso e idade)
    public Paciente(String nome, char sexo){
        this.nome = nome;
        if(sexo != 'M' && sexo != 'F');
        else this.sexo = sexo;
    }
    public Paciente(String nome, char sexo, double altura, double peso, int idade){
        this.nome = nome;
        if(sexo != 'M' && sexo != 'F') System.out.println("Esse sexo não é valido");
        else this.sexo = sexo;
        if(altura < 0) System.out.println("Essa não é uma altura valida, informe outra");
        else this.altura = altura; 
        if(peso < 0) System.out.println("Esse nao é um peso valido, informe outro");
        else this.peso = peso;
        if(idade <= -1) System.out.println("Essa não é uma idade valida, informe outra");
        else this.idade = idade;  
    }
    //engorda(valor) → incrementa o peso da pessoa caso o parâmetro seja positivo
    public void engorda(double valor){
        if(valor >= 0) this.peso += valor;      
    }
    /* emagrece(valor) –> decrementa o peso da pessoa caso o parâmetro seja positivo até o
    limite de peso 0 (uma pessoa não pode ter peso negativo). */
    public void emagrece(double valor){
        if(valor >= 0){
           if((this.peso - valor) <= 0){
               this.peso = 0;
           }else{
               this.peso -= valor;
           }
        }
    }
    /* getImc() –> retorna o valor do IMC do paciente, considerando a fórmula:
    IMC = Peso/ Altura² */
    public double getImc(){
        double imc = this.peso / ((this.altura/100)*(this.altura/100));
        return imc;
    }
    /* getPercentualGordura() –> considere a seguinte fórmula (onde sexo deve ser
    substituido por 1 para ‘F’ e 0 para ‘M’):
    PerctGordura = (1,20 x IMC) + (0,23 x idade) – (10,8 x sexo) – 5.4 */
    public double getPercentualGordura(){
        double PerctGordura;
        if(this.sexo == 'F'){
            PerctGordura = (1.20*getImc()) + (0.23*idade) - (10.8*1) - 5.4;
            return PerctGordura;
        }else PerctGordura = (1.20*getImc()) + (0.23*idade) - (10.8*0) - 5.4;
        return PerctGordura; 
    }
    /* paraString() –> retorna uma String com as seguintes informações concatenadas (de
    maneira legível) nome, sexo, altura, peso, idade, imc e percentual de gordura */
    public String paraString(){
        String informaçoes = ("\nNome " + this.getnome() +
        "\nSexo: " + this.getsexo() +
        "\nAltura: " + this.getaltura() + "cm" +
        "\nPeso: " + this.getpeso() + "kg" +
        "\nIdade: " + this.getidade() + " anos" +
        "\nImc: " + this.getImc() + " kg/m²" +
        "\nPercentual de Gordura: " + this.getPercentualGordura() + "\n");
        return informaçoes;
    }
    //getImcStatus() –> retorna uma String com o status do paciente baseado no seu IMC,
    //conforme a tabela abaixo:
    /* Valor IMC Status IMC
    IMC < 18,5 kg/m² “Magreza”
    18,5 kg/m² <= IMC < 24,9 kg/m² “Regular”
    24,9 kg/m² <= IMC < 30 kg/m² “Sobrepeso”
    IMC >= 30 kg/m² “Obesidade” */
    public String getImcStatus(){
        String status = "Obesidade";
        if(this.getImc() < 18.5){
            status = "Magreza";
        }else if(this.getImc() < 24.9){
            status = "Regular";
        }else if(this.getImc() < 30){
            status = "Sobrepeso";
        }
        return status;
    }
}
