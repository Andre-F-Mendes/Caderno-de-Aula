//
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * Write a description of class Cliente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private LocalDate dataNascimento;
    private ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nome, String cpf, String dataNascimento, String endereco, String telefone, ContaBancaria conta) {
        this.setNome(nome);
        this.setCPF(cpf);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        this.setDataNascimento(dataNascimento);
        cadastrarConta(conta);
    }

    public Cliente(String nome, String cpf, LocalDate dataNascimento, String endereco, String telefone, ContaBancaria conta) {
        this.setNome(nome);
        this.setCPF(cpf);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        this.dataNascimento = dataNascimento;
        cadastrarConta(conta);
    }

    public boolean cadastrarConta(ContaBancaria conta) {
        Objects.requireNonNull(conta, "A conta não pode ser nula");
        if (this.getIdade() >= 18){
            contas.add(conta);
            return true;
        } else{
            return false;
        }
    }

    public int getIdade() {
        final LocalDate dataAtual = LocalDate.now();
        final Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    private void setNome(String nome) {
        this.nome = Objects.requireNonNull(nome, "Nome não deve ser nulo");
    }

    private void setCPF(String cpf) {
        this.cpf = Objects.requireNonNull(cpf, "CPF não deve ser nulo");
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = Objects.requireNonNull(endereco, "Endereco não deve ser nulo");
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = Objects.requireNonNull(telefone, "Telefone não deve ser nulo");
    }

    /**
     * Altera a data de nascimento da pessoa.
     *
     * @param dataNascimento no formato dd/mm/aaaa
     * @throws NullPointerException se o Objeto dataNascimento passado por
     * parametro for nulo
     */
    private void setDataNascimento(String data) throws DateTimeParseException {
        try {
            if (data != null) {
                dataNascimento = LocalDate.parse(data, formatter);
            }
        } catch (DateTimeParseException pe) {
            throw new DateTimeParseException("Data inválida", pe.getParsedString(), pe.getErrorIndex());
        }
    }

    /**
     * Obtem o conteudo do atributo dataNascimento.
     *
     * @return a data de nascimento da pessoa
     */
    public String getDataNascimento() {
        return formatter.format(dataNascimento);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.cpf);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.cpf, other.cpf);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + '}';
    }
    
    public void removerConta (ContaBancaria conta){
        contas.remove(conta);
    }

}

