package MenuRPG;

public class Teste {
    
    public static void main(String[] args) {
        
        Pessoa andre = new Mago("André", "UNTIL", "MEDIO", 23, 5);  
        
        System.out.println(andre.getNomeJogador());
        System.out.println(andre.getNomePersonagem());
        System.out.println(andre.getTamanho());
        System.out.println(andre.getIdade());
        System.out.println(andre.getNivel());
        System.out.println(andre.getItensLista());
        System.out.println(andre.getIEL(0));


        // andre.addItens(0);
        // andre.addItens(2);
        // andre.addItens(3);
        
        // System.out.println(andre.getItens());
        // System.out.println(andre.getItem(0));
        
        

        // System.out.println(andre.getTalentosLista());
        // // System.out.println(andre.getTalentosListaEspecifico(0));
        
        // andre.addTalento(0);
        // andre.addTalento(1);
        // andre.addTalento(2);
        // // andre.addTalento(3);
        


        // System.out.println(andre.getTalentos());
        // System.out.println(andre.getTalento(1));

    }
}
