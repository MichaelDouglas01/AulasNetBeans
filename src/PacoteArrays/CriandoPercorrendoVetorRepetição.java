
package PacoteArrays;

import javax.swing.*;

public class CriandoPercorrendoVetorRepetição {
    
    public static void main(String[] args) {
        
    double numeros[] = new double [5];
    
    for (int  i = 0; i < 5; i++) {
    
    
    String aux = JOptionPane.showInputDialog(null, "Insira numeros de 1 até 5");
    numeros[i] = Double.parseDouble(aux);
    }
    
    for (int  i = 0; i < 5; i++) {
        System.out.println("Valores do Vetor: "+ numeros[i]+" Na Posição: "+i);
    }
    
    }
}
