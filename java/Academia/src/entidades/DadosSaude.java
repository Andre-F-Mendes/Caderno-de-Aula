package entidades;


import java.time.LocalDate;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class DadosSaude implements Comparable{
    
    private Pessoa pessoa;
    private int altura; //em cm
    private int medidaCintura; //em cm
    private double peso; //em kg
    private int pressaoArterialMin;
    private int pressaoArterialMax;
    private LocalDate dataRegistro;

    public DadosSaude(Pessoa pessoa, int altura, int medidaCintura, double peso, int pressaoArterialMin, int pressaoArterialMax, LocalDate dataRegistro) {
        this.pessoa = pessoa;
        this.altura = altura;
        this.medidaCintura = medidaCintura;
        this.peso = peso;
        this.pressaoArterialMin = pressaoArterialMin;
        this.pressaoArterialMax = pressaoArterialMax;
        this.dataRegistro = dataRegistro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(int medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPressaoArterialMin() {
        return pressaoArterialMin;
    }

    public void setPressaoArterialMin(int pressaoArterialMin) {
        this.pressaoArterialMin = pressaoArterialMin;
    }

    public int getPressaoArterialMax() {
        return pressaoArterialMax;
    }

    public void setPressaoArterialMax(int pressaoArterialMax) {
        this.pressaoArterialMax = pressaoArterialMax;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.pessoa);
        hash = 89 * hash + Objects.hashCode(this.dataRegistro);
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
        final DadosSaude other = (DadosSaude) obj;
        if (!Objects.equals(this.pessoa, other.pessoa)) {
            return false;
        }
        return Objects.equals(this.dataRegistro, other.dataRegistro);
    }

    @Override
    public int compareTo(Object t) {
        DadosSaude ds = (DadosSaude)t;
        return this.dataRegistro.compareTo(ds.dataRegistro);
    }
    
    
    
}
