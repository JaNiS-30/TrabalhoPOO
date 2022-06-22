/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rioleao.controller;

import br.com.rioleao.model.Funcionario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Computação
 */
public class Excluir_arquivo {

    public static void excluirFuncionario() throws FileNotFoundException, IOException, ClassNotFoundException {
        String nomeArquivo = JOptionPane.showInputDialog(null, "Digite o nome do Funcionario");

        File file = new File("Funcionario_" + nomeArquivo + ".dat");
        
        if (file.isFile()) {
            file.delete();

            JOptionPane.showMessageDialog(null, "Arquivo deletado!");
        } else {
            JOptionPane.showMessageDialog(null, "Esse arquivo não existe!");
        }
    }

    public static void excluirEstagiario() throws FileNotFoundException, IOException, ClassNotFoundException {
        String nomeArquivo = JOptionPane.showInputDialog(null, "Digite o nome do Estagiario");

        File file = new File("Estagiario_" + nomeArquivo + ".dat");

        if (file.isFile()) {
            file.delete();

            JOptionPane.showMessageDialog(null, "Arquivo deletado!");
        } else {
            JOptionPane.showMessageDialog(null, "Esse arquivo não existe!");
        }
    }
}
