//JOptionPane.showMessageDialog(null, "Janela de Mensagem");
package PacoteJava;

import javax.swing.*;

public class EntendendoJOP {
    
    public static void main(String args[]){
        
        double num1, num2, resp=0;
        String aux="";
        
        aux = JOptionPane.showInputDialog(null, "Insira o Primeiro Número");
        aux = aux.replace(',','.');
        num1 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "insira o Segundo Numero");
        aux = aux.replace(',','.');
        num2 = Double.parseDouble(aux);
        
        resp = num1+num2;
        resp = resp * 100;
        resp = Math.ceil(resp);
        resp= resp / 100;
        
        JOptionPane.showMessageDialog(null, "A soma é "+resp);
        
    }
}
