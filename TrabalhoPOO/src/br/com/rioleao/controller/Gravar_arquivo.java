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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author Computação
 */
public class Gravar_arquivo {

    public static void gravarFuncionario() throws FileNotFoundException, IOException {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome");
        String idade = JOptionPane.showInputDialog(null, "Digite a idade");
        String endereco = JOptionPane.showInputDialog(null, "Digite o endereco");
        String telefone = JOptionPane.showInputDialog(null, "Digite o telefone (apenas números)");
        String sexo = JOptionPane.showInputDialog(null, "Digite o seu sexo");
        String altura = JOptionPane.showInputDialog(null, "Digite a sua altura");
        String registro = JOptionPane.showInputDialog(null, "Digite o seu número de registro");
        String salario = JOptionPane.showInputDialog(null, "Digite o seu salário");

        Funcionario f = new Funcionario();
        f.setNome(nome);
        f.setEndereco(endereco);
        f.setIdade(parseInt(idade));
        f.setTelefone(parseInt(telefone));
        f.setSexo(sexo);
        f.setAltura(parseFloat(altura));
        f.setRegistro(parseInt(registro));
        f.setSalario(parseFloat(salario));

        FileOutputStream arq = new FileOutputStream("Funcionario_" + f.getNome() + ".dat");
        ObjectOutputStream obj = new ObjectOutputStream(arq);

        obj.writeObject(f);
        obj.flush();

        JOptionPane.showMessageDialog(null, "Nome: " + f.getNome() + "\nEndereco: " + f.getEndereco() + "\nTelefone: " + f.getTelefone() + "\nIdade: " + f.getIdade() + "\nSexo: " + f.getSexo() + "\nAltura: " + f.getAltura() + "\nRegistro: " + f.getRegistro() + "\nSalario: " + f.getSalario());
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        arq.close();
    }

    public static void gravarEstagiario() throws FileNotFoundException, IOException {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome");
        String idade = JOptionPane.showInputDialog(null, "Digite a idade");
        String endereco = JOptionPane.showInputDialog(null, "Digite o endereco");
        String telefone = JOptionPane.showInputDialog(null, "Digite o telefone (apenas números)");
        String sexo = JOptionPane.showInputDialog(null, "Digite o seu sexo");
        String altura = JOptionPane.showInputDialog(null, "Digite a sua altura");
        String registro = JOptionPane.showInputDialog(null, "Digite o seu número de registro");
        String salario = JOptionPane.showInputDialog(null, "Digite o seu salário");
        String bolsa = JOptionPane.showInputDialog(null, "Digite a porcentagem de sua bolsa (apenas números)");
        String horas_servico = JOptionPane.showInputDialog(null, "Digite o número de horas de serviço");

        Estagiario e = new Estagiario();
        e.setNome(nome);
        e.setEndereco(endereco);
        e.setIdade(parseInt(idade));
        e.setTelefone(parseInt(telefone));
        e.setSexo(sexo);
        e.setAltura(parseFloat(altura));
        e.setRegistro(parseInt(registro));
        e.setSalario(parseFloat(salario));
        e.setBolsa(parseInt(bolsa));
        e.setHoras_servico(parseInt(horas_servico));

        FileOutputStream arq = new FileOutputStream("Estagiario_" + e.getNome() + ".dat");
        ObjectOutputStream obj = new ObjectOutputStream(arq);

        obj.writeObject(e);
        obj.flush();

        JOptionPane.showMessageDialog(null, "Nome: " + e.getNome() + "\nEndereco: " + e.getEndereco() + "\nTelefone: " + e.getTelefone() + "\nIdade: " + e.getIdade() + "\nSexo: " + e.getSexo() + "\nAltura: " + e.getAltura() + "\nRegistro: " + e.getRegistro() + "\nSalario: " + e.getSalario() + "\nBolsa: " + e.getBolsa() + "\nHoras de serviço: " + e.getHoras_servico());
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        arq.close();
    }

    public static void atualizarRioLeao() throws FileNotFoundException, IOException, ClassNotFoundException {
        String dinheiro = JOptionPane.showInputDialog(null, "Digite o valor no caixa:");
        String numCerveja = JOptionPane.showInputDialog(null, "Digite o numero de cerveja:");
        String numRefri = JOptionPane.showInputDialog(null, "Digite o numero de refrigerante:");
        String numSalg = JOptionPane.showInputDialog(null, "Digite o numero de salgadinho:");
        String numFichaChurrasco = JOptionPane.showInputDialog(null, "Digite o numero de ficha de churrasco:");
        String valCerveja = JOptionPane.showInputDialog(null, "Digite o valor da cerveja:");
        String valRefri = JOptionPane.showInputDialog(null, "Digite o valor do refrigerante:");
        String valSalg = JOptionPane.showInputDialog(null, "Digite o valor do salgadinho:");
        String valChurrasco = JOptionPane.showInputDialog(null, "Digite o valor do churrasco:");

        ComunidadeRioLeao r = new ComunidadeRioLeao();
        r.setDinheiro(parseInt(dinheiro));
        r.setNumCerveja(parseInt(numCerveja));
        r.setNumRefri(parseInt(numRefri));
        r.setNumSalg(parseInt(numSalg));
        r.setNumFichaChurrasco(parseInt(numFichaChurrasco));
        r.setValCerveja(parseFloat(valCerveja));
        r.setValRefri(parseFloat(valRefri));
        r.setValSalg(parseFloat(valSalg));
        r.setValChurrasco(parseFloat(valChurrasco));

        FileOutputStream arq = new FileOutputStream("RioLeao.dat");
        ObjectOutputStream obj = new ObjectOutputStream(arq);

        obj.writeObject(r);
        obj.flush();

        Ler_arquivo.lerRioLeao();

        JOptionPane.showMessageDialog(null, "Dinheiro: " + r.getDinheiro() + "\nNumero de cerveja: " + r.getNumCerveja() + "\nNumero de refrigerante: " + r.getNumRefri() + "\nNumero de salgadinho: " + r.getNumSalg() + "\nNumero de ficha de churrasco: " + r.getNumFichaChurrasco() + "\nValor da cerveja: " + r.getValCerveja() + "\nValor do refrigerante: " + r.getValRefri() + "\nValor do salgadinho: " + r.getValSalg() + "\nValor do churrasco: " + r.getValChurrasco());
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        arq.close();

    }
}
