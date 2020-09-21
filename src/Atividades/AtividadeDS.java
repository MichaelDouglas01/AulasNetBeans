
package Atividades;

import javax.swing.*;

public class AtividadeDS {
    
    
    public static void main(String args[]){
        
        double num1, num2, resp=0;
        String aux="";
        
        aux = JOptionPane.showInputDialog(null, "Salario Diário");
        
        num1 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Dias Trabalhados");
        num2 = Double.parseDouble(aux);
        
        resp = num1*num2;
        
        JOptionPane.showMessageDialog(null, "Seu Ganho foi de R$"+resp);
        
    }
}
