
package PacoteJava;

import javax.swing.JOptionPane;





public class Notas {
     public static void main(String args[]){
        double nota1, nota2, trabalho, media=0;
        String aux="";
        
        try {
        
        aux = JOptionPane.showInputDialog(null,"1° Semestre: ", "Zenaidão", JOptionPane.PLAIN_MESSAGE);
        nota1 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null,"2° Semestre: ", "Zenaidão", JOptionPane.PLAIN_MESSAGE);
        nota2 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null,"Recuperação: ", "Zenaidão", JOptionPane.PLAIN_MESSAGE);
        trabalho = Double.parseDouble(aux);
        
        media = (nota1+nota2+trabalho)/3;
        
        JOptionPane.showMessageDialog(null,"A sua média é: "+media, "Zenaidão", JOptionPane.INFORMATION_MESSAGE);
        
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Insira somente Numeros", "Zenaidão", JOptionPane.ERROR_MESSAGE);
        }
     }
}
