

package com.mycompany.trabalhofaculdadejava2;

// Jogador

import javax.swing.JOptionPane;

public class TrabalhoFaculdadeJava2 {

    public static void main(String[] args) {
       String aux; 
       double salarioBase, bonus;
       
       aux= JOptionPane.showInputDialog("Informe o salarioBase."); // R$1200
       salarioBase = Double.parseDouble(aux);
       
       aux= JOptionPane.showInputDialog("Informe o bonus."); // 5horas
       bonus = Double.parseDouble(aux);
       
       JOptionPane.showMessageDialog(null,"Salario Final do Jogador = " + (salarioBase + 5) * bonus ); // soma de (salarioBase + 350) * horasExtras 
       
      
    }
    }
