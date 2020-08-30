//JOptionPane.showMessageDialog(null, "Janela de Mensagem");
package PacoteJava;

import javax.swing.*;

public class EntendendoJOP {
    
    public static void main(String args[]){
        
        double num1, num2, resp=0;
        String aux="";
        
        aux = JOptionPane.showInputDialog(null, "Insira o Primeiro Número");
        
        num1 = Double.parseDouble(aux);
        
        JOptionPane.showMessageDialog(null, "Valor do Primeiro Número"+num1);
        
        
        
    }
}
