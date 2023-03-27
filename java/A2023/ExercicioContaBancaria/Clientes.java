package java.A2023.ExercicioContaBancaria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Clientes {
    private final String nome;
    private final String cpf;
    private final LocalDate dataNascimeento;
    private String endereco;
    private String telefone;

    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public Clientes(String nome, String cpf, LocalDate dataNascimeento, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimeento = dataNascimeento;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    

}
