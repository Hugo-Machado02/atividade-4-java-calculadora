/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Calculo {
    String[] pilha = new String[3];
    String opr;
    int topo_pilha;
    int valA, valB;
    double resultado;
            
            
    void infixa(){
        valA = Integer.parseInt(this.pilha[0]);
        opr = this.pilha[1];
        valB = Integer.parseInt(this.pilha[2]);
        
        System.out.println("valA: " + valA);
        System.out.println("valB: " + valB);
        System.out.println("opr: " + opr);
        
        System.out.println("==========================================");
        System.out.println("Notação Escolhida - Infixa: "+valA+opr+valB);
        System.out.println("==========================================");
        
        if("+".equals(opr)){
            resultado = valA+valB;
            System.out.println("Valor da Soma: "+resultado);
        }
        if("-".equals(opr)){
            resultado = valA-valB;
            System.out.println("Valor da Subtracao: "+resultado);
        }
        if("*".equals(opr)){
            resultado = valA*valB;
            System.out.println("Valor da Multiplicacao: "+resultado);
        }
        if("/".equals(opr)){
            resultado = valA/valB;
            System.out.println("Valor da Divisao: "+resultado);
        }
        System.out.println("------------------------------------------");
        System.out.println("Notação pre-fixa: "+opr+valA+valB);
        System.out.println("Notação pos-fixa: "+valA+valB+opr);
        System.out.println("==========================================");
    }
    
    void prefixa(){
        opr = this.pilha[0];
        valA = Integer.parseInt(this.pilha[1]);
        valB = Integer.parseInt(this.pilha[2]);
        
        System.out.println("==========================================");
        System.out.println("Notação Escolhida - Pre-fixa: "+opr+valA+valB);
        System.out.println("==========================================");
        
        if("+".equals(opr)){
            resultado = valA+valB;
            System.out.println("Valor da Soma: "+resultado);
        }
        if("-".equals(opr)){
            resultado = valA-valB;
            System.out.println("Valor da Subtracao: "+resultado);
        }
       if("*".equals(opr)){
            resultado = valA*valB;
            System.out.println("Valor da Multiplicacao: "+resultado);
        }
        if("/".equals(opr)){
            resultado = valA/valB;
            System.out.println("Valor da Divisão: "+resultado);
        }
        
        System.out.println("------------------------------------------");
        System.out.println("Notação Infixa: "+valA+opr+valB);
        System.out.println("Notação pos-fixa: "+valA+valB+opr);
        System.out.println("==========================================");
        
    }
    
    void posfixa(){
        valA = Integer.parseInt(this.pilha[0]);
        valB = Integer.parseInt(this.pilha[1]);
        opr = this.pilha[2];
        
        System.out.println("==========================================");
        System.out.println("Notação Escolhida - Pos-fixa: "+valA+valB+opr);
        System.out.println("==========================================");
        
        if("+".equals(opr)){
            resultado = valA+valB;
            System.out.println("Valor da soma: "+resultado);
        }
        if("-".equals(opr)){
            resultado = valA-valB;
            System.out.println("Valor da Subtracao: "+resultado);
        }
        if("*".equals(opr)){
            resultado = valA*valB;
            System.out.println("Valor da Multiplicacao: "+resultado);
        }
        if("/".equals(opr)){
            resultado = valA/valB;
            System.out.println("Valor da Divisão: "+resultado);
        }
        System.out.println("------------------------------------------");
        System.out.println("Notação Infixa: "+valA+opr+valB);
        System.out.println("Notação pre-fixa: "+opr+valA+valB);
        System.out.println("==========================================");
    }
    
    //Inserir String
     int push(int topo, String valores){
        this.topo_pilha = topo;
        
        if(this.topo_pilha<0){
            this.topo_pilha = 0;
        }
        
        if(this.topo_pilha > 2){
            JOptionPane.showMessageDialog(null,"A pilha foi estourada");
            return(this.topo_pilha--);
        }else{
            this.pilha[this.topo_pilha]=valores;
            return(this.topo_pilha);
        }
    }
}
