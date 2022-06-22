/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rioleao.controller;

import br.com.rioleao.model.ComunidadeRioLeao;
import br.com.rioleao.model.Estagiario;
import br.com.rioleao.model.Funcionario;
import br.com.rioleao.view.Principal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Computação
 */
public class Ler_arquivo {

    public static void lerFuncionario() throws FileNotFoundException, IOException, ClassNotFoundException {
        String nomeArquivo = JOptionPane.showInputDialog(null, "Digite o nome do Funcionario");

        File file = new File("Funcionario_" + nomeArquivo + ".dat");

        if (file.isFile()) {
            FileInputStream arqIn = new FileInputStream("Funcionario_" + nomeArquivo + ".dat");
            ObjectInputStream objIn = new ObjectInputStream(arqIn);

            Funcionario funcionarioIn = (Funcionario) objIn.readObject();
            JOptionPane.showMessageDialog(null, "Nome: " + funcionarioIn.getNome() + "\nEndereco: " + funcionarioIn.getEndereco() + "\nTelefone: " + funcionarioIn.getTelefone() + "\nIdade: " + funcionarioIn.getIdade() + "\nSexo: " + funcionarioIn.getSexo() + "\nAltura: " + funcionarioIn.getAltura() + "\nRegistro: " + funcionarioIn.getRegistro() + "\nSalario: " + funcionarioIn.getSalario());

            arqIn.close();
        } else {
            JOptionPane.showMessageDialog(null, "Esse arquivo não existe!");
        }

    }

    public static void lerEstagiario() throws FileNotFoundException, IOException, ClassNotFoundException {
        String nomeArquivo = JOptionPane.showInputDialog(null, "Digite o nome do Estagiario");

        File file = new File("Estagiario_" + nomeArquivo + ".dat");

        if (file.isFile()) {
            FileInputStream arqIn = new FileInputStream("Estagiario_" + nomeArquivo + ".dat");
            ObjectInputStream objIn = new ObjectInputStream(arqIn);

            Estagiario estagiarioIn = (Estagiario) objIn.readObject();
            JOptionPane.showMessageDialog(null, "Nome: " + estagiarioIn.getNome() + "\nEndereco: " + estagiarioIn.getEndereco() + "\nTelefone: " + estagiarioIn.getTelefone() + "\nIdade: " + estagiarioIn.getIdade() + "\nSexo: " + estagiarioIn.getSexo() + "\nAltura: " + estagiarioIn.getAltura() + "\nRegistro: " + estagiarioIn.getRegistro() + "\nSalario: " + estagiarioIn.getSalario() + "\nBolsa: " + estagiarioIn.getBolsa() + "\nHoras de serviço: " + estagiarioIn.getHoras_servico());
            arqIn.close();
        } else {
            JOptionPane.showMessageDialog(null, "Esse arquivo não existe!");
        }
    }

    public static void lerRioLeao() throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream arqIn = new FileInputStream("RioLeao.dat");
        ObjectInputStream objIn = new ObjectInputStream(arqIn);

        ComunidadeRioLeao RioLeaoIn = (ComunidadeRioLeao) objIn.readObject();

        Principal.jLabel3.setText("" + RioLeaoIn.getDinheiro());
        Principal.jLabel4.setText("" + RioLeaoIn.getNumSalg());
        Principal.jLabel6.setText("" + RioLeaoIn.getNumRefri());
        Principal.jLabel10.setText("" + RioLeaoIn.getNumFichaChurrasco());
        Principal.jLabel11.setText("" + RioLeaoIn.getNumCerveja());

        Principal.jLabel12.setText("R$ " + RioLeaoIn.getValCerveja());
        Principal.jLabel13.setText("R$ " + RioLeaoIn.getValRefri());
        Principal.jLabel14.setText("R$ " + RioLeaoIn.getValSalg());
        Principal.jLabel15.setText("R$ " + RioLeaoIn.getValChurrasco());

        arqIn.close();

    }

}
