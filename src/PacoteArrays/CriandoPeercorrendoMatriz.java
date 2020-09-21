
package PacoteArrays;

import javax.swing.*;

public class CriandoPeercorrendoMatriz {
    
    public static void main(String[] args) {
        
        int  numeros[][] = new int[3][3];
        String aux = "";
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
               aux = JOptionPane.showInputDialog(null, "Insira Números: ");
               numeros[i][j] = Integer.parseInt(aux);   
        }
    }   
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {    
        System.out.println("Valores na matriz: " + numeros[i][j]);
    }
}   

    }
}
