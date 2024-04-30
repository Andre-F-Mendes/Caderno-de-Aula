import java.util.Scanner;

public class ParidadeSimples {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o número de bits: ");
        int n = scn.nextInt();
        
        int[] bits = new int[n];
        System.out.println("Digite os bytes (0 ou 1): ");
        for (int i = 0; i < n; i++) {
            bits[i] = scn.nextInt();
        }
        
        int paridade = calcularParidadeSimples(n, bits);
        System.out.println("Bytes com paridade: ");
        for (int bit : bits) {
            System.out.print(bit + " ");
        }
        System.out.println(paridade);
    }

    public static int calcularParidadeSimples(int n, int[] bits) {
        int numBits1 = 0;
        for (int bit : bits) {
            if (bit == 1) {
                numBits1++;
            }
        }
        
        return numBits1 % 2 != 0 ? 1 : 0;
    }
}
