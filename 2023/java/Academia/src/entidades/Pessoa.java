package entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Pessoa implements Comparable{
    private final String cpf;
    private String nome;
    private char sexo;
    private LocalDate dataNascimento;

    public Pessoa(String cpf, String nome, char sexo, LocalDate dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    /* public void setCpf(String cpf) {
        this.cpf = cpf;
    } */
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
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
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return ("Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + '}');
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.cpf);
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.sexo);
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
    public int compareTo(Object t) {
        Pessoa p = (Pessoa) t;
        return this.nome.compareToIgnoreCase(p.getNome());
    }
}