/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    public static void main(String[] args) {
        int notacao;
        String a, b, op, s_notacao;
        double resultado;
        
        Calculo c = new Calculo();
        
        s_notacao = JOptionPane.showInputDialog("Notação: 1-infixa); 2-Pre-fixa; 3-pos-fixa; 4-Fim");
        notacao = Integer.parseInt(s_notacao);
        
        while(notacao != 4){
            switch(notacao) {
                case 1:
                    a = JOptionPane.showInputDialog("Digite um valor inteiro para A");
                    c.push(0, a);

                    op = JOptionPane.showInputDialog("Digite a Operação (+; -; *; /)");
                    c.push(1, op);

                    b = JOptionPane.showInputDialog("Digite um valor inteiro para B");
                    c.push(2, b);

                    c.infixa();
                  break;

                case 2:
                    op = JOptionPane.showInputDialog("Digite a Operação (+; -; *; /)");
                    c.push(0, op);

                    a = JOptionPane.showInputDialog("Digite um valor inteiro para A");
                    c.push(1, a);

                    b = JOptionPane.showInputDialog("Digite um valor inteiro para B");
                    c.push(2, b);

                    c.prefixa();
                  break;

                case 3:
                    a = JOptionPane.showInputDialog("Digite um valor inteiro para A");
                    c.push(0, a);

                    b = JOptionPane.showInputDialog("Digite um valor inteiro para B");
                    c.push(1, b);

                    op = JOptionPane.showInputDialog("Digite a Operação (+; -; *; /)");
                    c.push(2, op);

                    c.posfixa();
                  break;

                default:
                    System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3.");
            }
            s_notacao = JOptionPane.showInputDialog("Notação: 1-infixa); 2-Pre-fixa; 3-pos-fixa; 4-Fim");
            notacao = Integer.parseInt(s_notacao);
        }
        
        if(notacao == 4){
            System.out.print("\n\n==================== Fim!! ====================\n\n");
        }
        
    }
}
