package MenuRPG;


public class Teste {
    
    public static void main(String[] args) {
                                    //for, des, cos, int, sab, car
        double[] habilidadesAndre = {20.0, 20.0, 20.0, 20.0, 20.0, 20.0};

        Pessoa helena = new Guerreiro("Helena", "Cassiopeia", "media", 17, 20);
        helena.setHabilidades(habilidadesAndre);
        
        
        helena.maestria();
        System.out.println(helena.getTitulo());
        System.out.println(helena.getDinheiro());
        
        helena.addItem(0, 0);     
        helena.addItem(0, 0);     
        helena.addItem(0, 0);     
        helena.addItem(0, 0);
        
        helena.maestria();
        
        System.out.println(helena.getTitulo());
        System.out.println(helena.getDinheiro());
        System.out.println(helena.getHabilidades());     

    }
}
