import java.util.Scanner;

public class ParidadeCombinada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas (N): ");
        int n = scanner.nextInt();
        System.out.println("Digite o número de colunas (M): ");
        int m = scanner.nextInt();
        
        int[][] tabela = new int[n][m];
        System.out.println("Digite os bits da tabela (0 ou 1): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tabela[i][j] = scanner.nextInt();
            }
        }
        
        calcularParidadeCombinada(n, m, tabela);
        System.out.println("Tabela com paridade: ");
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                System.out.print(tabela[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void calcularParidadeCombinada(int n, int m, int[][] tabela) {
        for (int i = 0; i < n; i++) {
            int numBits1 = 0;
            for (int j = 0; j < m; j++) {
                if (tabela[i][j] == 1) {
                    numBits1++;
                }
            }
            tabela[i][m] = numBits1 % 2 != 0 ? 1 : 0; 
        }
        
        for (int j = 0; j < m; j++) {
            int numBits1 = 0;
            for (int i = 0; i < n; i++) {
                if (tabela[i][j] == 1) {
                    numBits1++;
                }
            }
            tabela[n][j] = numBits1 % 2 != 0 ? 1 : 0;
        }
        
        int numBits1 = 0;
        for (int j = 0; j < m; j++) {
            if (tabela[n][j] == 1) {
                numBits1++;
            }
        }
        tabela[n][m] = numBits1 % 2 != 0 ? 1 : 0; 
    }
}