package model.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Convidado
 */
public class Usuario {
    
    private boolean adm;
    private List<Endereco> enderecos;
    private String nome, cpf, email, senha;
    private LocalDate dataNascimento;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Usuario() {

    }

    public Usuario(String nome, String cpf, LocalDate dataNascimento, String email, String senha) {
        setNome(nome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
        setEmail(email);
        setSenha(senha);
        enderecos = new ArrayList<>();
        adm = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Objects.requireNonNull(email);
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        Objects.requireNonNull(senha);
        this.senha = senha;
    }

    public void addEndereco(Endereco endereco) {
        Objects.requireNonNull(endereco);
        enderecos.add(endereco);

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.dataNascimento);
        hash = 97 * hash + Objects.hashCode(this.email);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.dataNascimento, other.dataNascimento);
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome: " + nome + ", cpf: " + cpf + ", dataNascimento: " + dataNascimento + ", email: " + email + '}';
    }
}
