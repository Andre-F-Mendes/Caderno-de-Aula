
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 08050431
 */
public class Comanda {

    private Cliente cliente;
    
    
    //TODO: Declarar uma coleção de objetos chamada pedidos que irá conter MenuItem
    ArrayList<MenuItem> list = new ArrayList();
    
    
    public Comanda(Cliente cliente) {
        setCliente(cliente);
    }

    public void setCliente(Cliente cliente) {
        // TODO: Fazer o teste de consistência dos dados de entrada
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean adicionarMenuItem(Integer cod, int quantidade) {
        //TODO: Adicionar nos pedidos a quantidade de MenuItem com o código correspondente a cod
        return false;
    }

    public boolean cancelarMenuItem(Integer cod, int quantidade) {
        //TODO: Remover dos pedidos a quantidade de MenuItem com o código correspondente a cod
        return false;
    }


    public void listarComanda() {
        System.out.println("---- Esses são os serviços prestados para " + cliente.getNome() + " ----");
        //TODO: Listar todos os itens de pedidos
    }

    public double fecharComanda() {
        //TODO: Fazer o cálculo do valor a ser pago pelo cliente considerando que vips tem 10% desconto
        return 0;
    }
}