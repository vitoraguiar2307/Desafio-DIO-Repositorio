

package com.mycompany.trabalhofaculdadejava1;

import javax.swing.JOptionPane;

// Tecnico
public class TrabalhoFaculdadeJava1 { 

    public static void main(String[] args) {
       String aux; 
       double salarioBase, horasExtras;
       
       aux= JOptionPane.showInputDialog("Informe o salarioBase."); // R$1200
       salarioBase = Double.parseDouble(aux);
       
       aux= JOptionPane.showInputDialog("Informe as horasExtras."); // 5horas
       horasExtras = Double.parseDouble(aux);
       
       JOptionPane.showMessageDialog(null,"Salario Final do Técnico = " + (salarioBase + 350) * horasExtras ); // soma de (salarioBase + 350) * horasExtras 
       
      
    }
}
