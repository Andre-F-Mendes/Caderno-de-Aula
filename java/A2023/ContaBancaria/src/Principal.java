
import java.time.*;
import java.util.Objects;
import javax.swing.*; // para construção de interface gráfica

/**
 * Write a description of class Principal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Principal {

    public static void main(String[] args) {
//        ContaBancaria conta1 = new ContaBancaria(100, 12345, 200.0);
//        Cliente cli = new Cliente ("Ana", "65789-00", "20/03/2023", "Rua das Flores 23", "3305448", conta1);
//        
//        ContaBancaria conta2 = new ContaBancaria(100, 12345);
//        cli.cadastrarConta(conta2);
//        
//        ContaBancaria conta3 = new ContaBancaria(200, 6789, 100);
//        Cliente cli2 = new Cliente ("Maria", "65789-00", LocalDate.of(1973, 4, 2), "Rua das Flores 23", "3305448", conta1);
//        System.out.println(cli2);
//        cli2.cadastrarConta(null);
        boolean passou = true;
        do {
            try {
                String s = lerDados("Informe o numero da conta");
                int n = Integer.parseInt(s);
                passou = true;
            } catch (CampoVazioException excecao) {
                JOptionPane.showMessageDialog(null, excecao.getMessage());
                passou = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                passou = false;
            }
        } while (passou == false);
        
        //complete com a entrada de dados para os outros dados

    }

    public static String lerDados(String mensagem) throws CampoVazioException {
        String s = Objects.requireNonNull(mensagem);
        s = JOptionPane.showInputDialog(null, mensagem);
        if (s.isBlank()) {
            throw new CampoVazioException("Você deixou o campo vazio ");
        }
        return s;
    }

}
