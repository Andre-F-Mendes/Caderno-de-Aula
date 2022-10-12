package Animais;
public class TestaAnimais {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Dog");
        Animal gato = new Gato("Cat");
        Animal pato = new Pato("Duck");
        Animal humano = new Humano("André");
        Gato gato1 = new Gato("Gatonsio");
        Cachorro cachorro1 = new Cachorro("Caramelo");
        Pato pato1 = new Pato("Patonsio");
        Humano humano1 = new Humano("Kratus");

        //Objeto como animal instanciado como o tipo
        System.out.println(gato.getNome());
        System.out.println(cachorro.getNome());
        System.out.println(pato.getNome());
        System.out.println(humano.getNome());

        //Objeto como o tipo instanciado como o tipo
        System.out.println("---------");
        System.out.println(gato1.getNome());
        System.out.println(cachorro1.getNome());
        System.out.println(pato1.getNome());
        System.out.println(humano1.getNome());

    }
}
