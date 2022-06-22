
package br.com.rioleao.model;

public class Funcionario extends Pessoa {
    private int registro;
    private float salario;

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
