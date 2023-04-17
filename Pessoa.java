/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Academia;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author 08050520
 */
public class Pessoa implements Comparable{

    private String cpf;
    private String nome;
    private char sexo;
    private LocalDate dataDeNascimento;
    
    public Pessoa (String nome, LocalDate data, char sexo, String cpf){
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = data;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + ", dataDeNascimento=" + dataDeNascimento + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.cpf);
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + this.sexo;
        hash = 67 * hash + Objects.hashCode(this.dataDeNascimento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.dataDeNascimento, other.dataDeNascimento);
    }

    @Override
    public int compareTo(Object o) {
        Pessoa var = (Pessoa) o;
        return this.nome.compareTo(var.nome);
    }
    
    
    
}
