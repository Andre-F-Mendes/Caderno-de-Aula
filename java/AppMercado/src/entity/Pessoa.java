package model.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author Convidado
 */
public class Pessoa {
    
    private Endereco endereco;
    private String nome, sobrenome, cpf;
    private LocalDate dataNascimento;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pessoa(String nome, String sobrenome, String cpf, LocalDate dataNascimento, Endereco endereco) {
        setNome(nome);
        setSobrenome(sobrenome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
        setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Objects.requireNonNull(sobrenome);
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        Objects.requireNonNull(cpf);
        this.cpf = cpf;

    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getDataNascimentoString() {
        return dataNascimento.format(formatter);
    }

    public void setDataNascimento(LocalDate data) {
        Objects.requireNonNull(data, "A data não pode ser nula");
        this.dataNascimento = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.dataNascimento);
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
        return Objects.equals(this.cpf, other.cpf);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " " + getSobrenome() + "\nCPF: " + getCpf() + "\nData de Nascimento: " + getDataNascimentoString()+ "\n" + getEndereco() + "\n";
    }

    
    
}
