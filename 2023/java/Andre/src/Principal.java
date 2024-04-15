/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk302
 */
public class Principal {

    public static void main(String[] args) {
        boolean teste = Menu.cadastrarItem(new MenuItem(100, "Corte de cabelo", 40.00));
        imprimeTeste(teste, "Cadastro");
        teste = Menu.cadastrarItem(new MenuItem(101, "Manicure", 30.00));
        imprimeTeste(teste, "Cadastro");
        teste = Menu.cadastrarItem(new MenuItem(102, "Pedicure", 40.00));
        imprimeTeste(teste, "Cadastro");
        teste = Menu.cadastrarItem(new MenuItem(103, "Limpeza de pele", 100.00));
        imprimeTeste(teste, "Cadastro");
        teste = Menu.cadastrarItem(new MenuItem(104, "Massagem", 80.00));
        imprimeTeste(teste, "Cadastro");
        teste = Menu.cadastrarItem(new MenuItem(105, "Tintura de cabelos", 200.00));
        imprimeTeste(teste, "Cadastro");
        System.out.println("**** Menu ****");
        Menu.listarMenu();

        System.out.println("**** Menu Ordenado por Preco****");
        Menu.listarMenuOrdenado();

        System.out.println("#### Testes de Sucesso ####");
        Cliente cliente = new Cliente("Karen");
        Comanda comanda = new Comanda(cliente);
        comanda.adicionarMenuItem(100, 2);
        comanda.adicionarMenuItem(101, 2);
        comanda.adicionarMenuItem(102, 1);

        comanda.listarComanda();

        System.out.println("--- Valor a ser pago por Karen ---");
        System.out.println(comanda.fecharComanda());

        Cliente cliente2 = new Cliente("Marcia");
        cliente2.setCategoria("vip");
        Comanda comanda2 = new Comanda(cliente2);
        comanda2.adicionarMenuItem(103, 1);
        comanda2.adicionarMenuItem(104, 1);
        comanda2.adicionarMenuItem(105, 1);

        comanda2.listarComanda();

        System.out.println("--- Valor a ser pago por Marcia ---");
        System.out.println(comanda2.fecharComanda());

        System.out.println("\n#### Testes de Consitência ####");
        try{
//           System.out.println("Erro 1");
//           teste = Menu.cadastrarItem(new MenuItem(0, "teste" , 10)); //Exception

//           System.out.println("Erro 2");
//           teste = Menu.cadastrarItem(new MenuItem(10, null , 10)); //Exception

//           System.out.println("Erro 3");
//           teste = Menu.cadastrarItem(new MenuItem(10, "teste" , -10)); //Exception]

//             System.out.println("Erro 4");
//           Comanda comanda3 = new Comanda (null);//Exception

//           System.out.println("Erro 5");
//           Comanda comanda4 = new Comanda (new Cliente("teste")); 
//           teste = comanda4.adicionarMenuItem(0, 0);
//           System.out.println("Conseguiu adicionar MenuItem ?"  + teste);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void imprimeTeste(boolean b, String operacao) {
        if (b) { // testa se b == true
            System.out.println(operacao + " realizado com sucesso !");
        } else {
            System.out.println("Falha na operação de " + operacao);
        }
    }

}
