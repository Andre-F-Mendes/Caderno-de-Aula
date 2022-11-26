package MenuRPG;

public class Teste {
    
    public static void main(String[] args) {
        double[] habilidadesAndre = {1.0, 12.0, 11.0, 1.0, 20.0, 17.0};

        Pessoa andre = new Mago("André", "Zapson", "MEDIO", 23, 5);  
        
        System.out.println("Jogador: " + andre.getNomeJogador());
        System.out.println("Personagem: " + andre.getNomePersonagem());
        System.out.println("Tamanho: " + andre.getTamanho());
        System.out.println("Idade: " + andre.getIdade());
        System.out.println("Nível: " + andre.getNivel());
        
        System.out.println("Atuais Habilidades:" + andre.getHabilidades() + "\nAtuais Modificadores: ");
        System.out.println(andre.getModificadores());
        
        andre.setHabilidades(habilidadesAndre);

        System.out.print("Novas Habilidades: " + andre.getHabilidades() + "\nNovos Modificadores: " + andre.getModificadores());
        
        andre.fazAniversario();
        andre.upNivel();
        
        System.out.print("\nNovas Habilidades: " + andre.getHabilidades() + "\nNovos Modificadores: " + andre.getModificadores());

        // System.out.print("Nova Idade: "  + andre.getIdade() + "\nNovo Nível: ");
        // System.out.println(andre.getNivel());
        
        // System.out.print("Lista de Talentos de Mago" + andre.getItensLista() + "\nTalento Especifico da Lista: ");
        // System.out.println(andre.getIEL(0));

        // System.out.println("Itens Atuais: " + andre.getItens());
        
        andre.addItem(0);
        andre.addItem(0);
        andre.addItem(0);
        andre.addItem(0);
        

        // System.out.println("Novos Itens: " + andre.getItens() + "\nItem Especifico: ");
        // System.out.println(andre.getItem(0));

        // andre.addTalento(0);
        // andre.addTalento(1);
        // andre.addTalento(2);
        
        // System.out.println("Talentos: " + andre.getTalentos());
        // System.out.println("Talento: " + andre.getTalento(0));
    }
}
