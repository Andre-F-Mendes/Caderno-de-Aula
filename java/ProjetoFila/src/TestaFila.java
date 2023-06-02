/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAREN
 */
public class TestaFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila f = new Fila();
        Cliente cli1 = new Cliente("Ana", "1234");
        f.enqueue(cli1);
        Cliente cli2 = new Cliente("Paula", "5678");
        f.enqueue(cli2);
        Cliente cli3 = new Cliente("Marta", "0987");
        f.enqueue(cli3);
        f.print();
        f.dequeue();
        f.print();
        Cliente cli4 = new Cliente("Maria", "8765");
        f.enqueue(cli4);
        System.out.println("Quem é o proximo ? " + f.front());
        System.out.println("Em que posição está Marta ? " + f.position(cli3));
        f.dequeue();
        f.dequeue();
        f.dequeue();
        System.out.println("Qual o tamanho da fila ?" + f.size());
        f.dequeue();
        }
}
