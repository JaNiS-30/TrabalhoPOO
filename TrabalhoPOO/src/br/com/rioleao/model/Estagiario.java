/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rioleao.model;

/**
 *
 * @author Computação
 */
public final class Estagiario extends Funcionario {
    private int bolsa;
    private int horas_servico;

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public int getHoras_servico() {
        return horas_servico;
    }

    public void setHoras_servico(int horas_servico) {
        this.horas_servico = horas_servico;
    }
    
    
}
