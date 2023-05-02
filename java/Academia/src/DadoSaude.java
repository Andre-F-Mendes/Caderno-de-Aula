/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author 08050431
 */
public class DadosSaude implements Comparable{
    
    private double altura;
    private double peso;
    private double medidaCintura;
    private Pessoa pessoa;
    private int pressaiArteriaMax;
    private int pressaoArteriaMin;
    private LocalDate dataRegistro;

    public DadosSaude(double altura, double peso, double medidaCintura, Pessoa pessoa, int pressaiArteriaMax, int pressaoArteriaMin, LocalDate dataRegistro) {
        this.altura = altura;
        this.peso = peso;
        this.medidaCintura = medidaCintura;
        this.pessoa = pessoa;
        this.pressaiArteriaMax = pressaiArteriaMax;
        this.pressaoArteriaMin = pressaoArteriaMin;
        this.dataRegistro = dataRegistro;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getMedidaCintura() {
        return medidaCintura;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public int getPressaiArteriaMax() {
        return pressaiArteriaMax;
    }

    public int getPressaoArteriaMin() {
        return pressaoArteriaMin;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setMedidaCintura(double medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setPressaiArteriaMax(int pressaiArteriaMax) {
        this.pressaiArteriaMax = pressaiArteriaMax;
    }

    public void setPressaoArteriaMin(int pressaoArteriaMin) {
        this.pressaoArteriaMin = pressaoArteriaMin;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.altura) ^ (Double.doubleToLongBits(this.altura) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.medidaCintura) ^ (Double.doubleToLongBits(this.medidaCintura) >>> 32));
        hash = 61 * hash + Objects.hashCode(this.pessoa);
        hash = 61 * hash + this.pressaiArteriaMax;
        hash = 61 * hash + this.pressaoArteriaMin;
        hash = 61 * hash + Objects.hashCode(this.dataRegistro);
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
        if (Double.doubleToLongBits(this.altura) != Double.doubleToLongBits(other.altura)) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (Double.doubleToLongBits(this.medidaCintura) != Double.doubleToLongBits(other.medidaCintura)) {
            return false;
        }
        if (this.pressaiArteriaMax != other.pressaiArteriaMax) {
            return false;
        }
        if (this.pressaoArteriaMin != other.pressaoArteriaMin) {
            return false;
        }
        if (!Objects.equals(this.pessoa, other.pessoa)) {
            return false;
        }
        return Objects.equals(this.dataRegistro, other.dataRegistro);
    }

    
    @Override
    public String toString() {
        return "DadosSaude{" + "altura=" + altura + ", peso=" + peso + ", medidaCintura=" + medidaCintura + ", pessoa=" + pessoa + ", pressaiArteriaMax=" + pressaiArteriaMax + ", pressaoArteriaMin=" + pressaoArteriaMin + ", dataRegistro=" + dataRegistro + '}';
    } 

    @Override
    public int compareTo(Object o) {
        DadosSaude var = (DadosSaude) o;
        return this.dataRegistro.compareTo(var.dataRegistro);
    }
}
