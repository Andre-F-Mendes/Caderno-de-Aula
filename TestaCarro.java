public class TestaCarro
 {
    public static void main(String[] args) {
        Carro CarroA = new Carro("Fusca");
        
        System.out.println(CarroA.isLigado());
        CarroA.upMarcha();

        CarroA.liga();

        CarroA.downMarcha();
        
        CarroA.liga();
        
        System.out.println(CarroA.isLigado());

        CarroA.upMarcha();
        CarroA.upMarcha();
        CarroA.upMarcha();
        CarroA.upMarcha();

        CarroA.acelera(120);
        CarroA.freia(33.45);;    
    }
}
