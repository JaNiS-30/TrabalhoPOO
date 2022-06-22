package br.com.rioleao.controller;

import br.com.rioleao.model.ComunidadeRioLeao;
import br.com.rioleao.model.Estagiario;
import br.com.rioleao.view.Principal;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class Vendas_Comunidade {

    public static void vendaCerveja() throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream arqIn = new FileInputStream("RioLeao.dat");
        ObjectInputStream objIn = new ObjectInputStream(arqIn);

        ComunidadeRioLeao RioLeaoIn = (ComunidadeRioLeao) objIn.readObject();

        String numS = JOptionPane.showInputDialog(null, "Digite o numero de cerveja vendida:");

        int num = parseInt(numS);

        while (num > RioLeaoIn.getNumCerveja()) {
            JOptionPane.showMessageDialog(null, "Você possui " + RioLeaoIn.getNumCerveja() + " em estoque.");
            numS = JOptionPane.showInputDialog(null, "Digite o numero de cerveja vendida:");
            num = parseInt(numS);
        }

        String valS = JOptionPane.showInputDialog(null, "Digite o valor recebido:");
        float valRecebido = parseFloat(valS);

        float valAReceber = num * RioLeaoIn.getValCerveja();

        while (valRecebido < valAReceber) {
            valS = JOptionPane.showInputDialog(null, "Valor insuficiente\n" + "Digite o valor recebido:");
            valRecebido = parseFloat(valS);
        }

        RioLeaoIn.setDinheiro(valAReceber + RioLeaoIn.getDinheiro());
        RioLeaoIn.setNumCerveja(RioLeaoIn.getNumCerveja() - num);

        FileOutputStream arq = new FileOutputStream("RioLeao.dat");
        ObjectOutputStream obj = new ObjectOutputStream(arq);

        obj.writeObject(RioLeaoIn);
        obj.flush();

        Principal.jLabel11.setText("" + RioLeaoIn.getNumCerveja());
        Principal.jLabel3.setText("" + RioLeaoIn.getDinheiro());

        JOptionPane.showMessageDialog(null, "Troco: " + Math.abs(valAReceber - valRecebido) + "\nVenda realizada com sucesso!");

        arq.close();

        arqIn.close();

    }

    public static void vendaRefri() throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream arqIn = new FileInputStream("RioLeao.dat");
        ObjectInputStream objIn = new ObjectInputStream(arqIn);

        ComunidadeRioLeao RioLeaoIn = (ComunidadeRioLeao) objIn.readObject();

        String numS = JOptionPane.showInputDialog(null, "Digite o numero de refrigerante vendido:");

        int num = parseInt(numS);

        while (num > RioLeaoIn.getNumRefri()) {
            JOptionPane.showMessageDialog(null, "Você possui " + RioLeaoIn.getNumRefri() + " em estoque.");
            numS = JOptionPane.showInputDialog(null, "Digite o numero de refrigerante vendido:");
            num = parseInt(numS);
        }

        String valS = JOptionPane.showInputDialog(null, "Digite o valor recebido:");
        float valRecebido = parseFloat(valS);

        float valAReceber = num * RioLeaoIn.getValRefri();

        while (valRecebido < valAReceber) {
            valS = JOptionPane.showInputDialog(null, "Valor insuficiente\n" + "Digite o valor recebido:");
            valRecebido = parseFloat(valS);
        }

        RioLeaoIn.setDinheiro(valAReceber + RioLeaoIn.getDinheiro());
        RioLeaoIn.setNumRefri(RioLeaoIn.getNumRefri() - num);

        FileOutputStream arq = new FileOutputStream("RioLeao.dat");
        ObjectOutputStream obj = new ObjectOutputStream(arq);

        obj.writeObject(RioLeaoIn);
        obj.flush();

        Principal.jLabel6.setText("" + RioLeaoIn.getNumRefri());
        Principal.jLabel3.setText("" + RioLeaoIn.getDinheiro());

        JOptionPane.showMessageDialog(null, "Troco: " + Math.abs(valAReceber - valRecebido) + "\nVenda realizada com sucesso!");

        arq.close();

        arqIn.close();

    }

    public static void vendaSalgadinho() throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream arqIn = new FileInputStream("RioLeao.dat");
        ObjectInputStream objIn = new ObjectInputStream(arqIn);

        ComunidadeRioLeao RioLeaoIn = (ComunidadeRioLeao) objIn.readObject();

        String numS = JOptionPane.showInputDialog(null, "Digite o numero de salgadinho vendido:");

        int num = parseInt(numS);

        while (num > RioLeaoIn.getNumSalg()) {
            JOptionPane.showMessageDialog(null, "Você possui " + RioLeaoIn.getNumSalg() + " em estoque.");
            numS = JOptionPane.showInputDialog(null, "Digite o numero de salgadinho vendido:");
            num = parseInt(numS);
        }

        String valS = JOptionPane.showInputDialog(null, "Digite o valor recebido:");
        float valRecebido = parseFloat(valS);

        float valAReceber = num * RioLeaoIn.getValSalg();

        while (valRecebido < valAReceber) {
            valS = JOptionPane.showInputDialog(null, "Valor insuficiente\n" + "Digite o valor recebido:");
            valRecebido = parseFloat(valS);
        }

        RioLeaoIn.setDinheiro(valAReceber + RioLeaoIn.getDinheiro());
        RioLeaoIn.setNumSalg(RioLeaoIn.getNumSalg() - num);

        FileOutputStream arq = new FileOutputStream("RioLeao.dat");
        ObjectOutputStream obj = new ObjectOutputStream(arq);

        obj.writeObject(RioLeaoIn);
        obj.flush();

        Principal.jLabel4.setText("" + RioLeaoIn.getNumSalg());
        Principal.jLabel3.setText("" + RioLeaoIn.getDinheiro());

        JOptionPane.showMessageDialog(null, "Troco: " + Math.abs(valAReceber - valRecebido) + "\nVenda realizada com sucesso!");

        arq.close();

        arqIn.close();

    }

    public static void vendaChurrasco() throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream arqIn = new FileInputStream("RioLeao.dat");
        ObjectInputStream objIn = new ObjectInputStream(arqIn);

        ComunidadeRioLeao RioLeaoIn = (ComunidadeRioLeao) objIn.readObject();

        String numS = JOptionPane.showInputDialog(null, "Digite o numero de churrasco vendido:");

        int num = parseInt(numS);

        while (num > RioLeaoIn.getNumFichaChurrasco()) {
            JOptionPane.showMessageDialog(null, "Você possui " + RioLeaoIn.getNumFichaChurrasco() + " em estoque.");
            numS = JOptionPane.showInputDialog(null, "Digite o numero de churrasco vendido:");
            num = parseInt(numS);
        }

        String valS = JOptionPane.showInputDialog(null, "Digite o valor recebido:");
        float valRecebido = parseFloat(valS);

        float valAReceber = num * RioLeaoIn.getValChurrasco();

        while (valRecebido < valAReceber) {
            valS = JOptionPane.showInputDialog(null, "Valor insuficiente\n" + "Digite o valor recebido:");
            valRecebido = parseFloat(valS);
        }

        RioLeaoIn.setDinheiro(valAReceber + RioLeaoIn.getDinheiro());
        RioLeaoIn.setNumFichaChurrasco(RioLeaoIn.getNumFichaChurrasco() - num);

        FileOutputStream arq = new FileOutputStream("RioLeao.dat");
        ObjectOutputStream obj = new ObjectOutputStream(arq);

        obj.writeObject(RioLeaoIn);
        obj.flush();

        Principal.jLabel10.setText("" + RioLeaoIn.getNumFichaChurrasco());
        Principal.jLabel3.setText("" + RioLeaoIn.getDinheiro());

        JOptionPane.showMessageDialog(null, "Troco: " + Math.abs(valAReceber - valRecebido) + "\nVenda realizada com sucesso!");

        arq.close();

        arqIn.close();

    }
}
