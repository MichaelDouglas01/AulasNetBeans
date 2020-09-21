
package PacoteArrays;

import javax.swing.*;

public class VetorLength {
    
    public static void main(String[] args) {
        
        int tamanhovetor = 0;
        String aux = "";
        
        
        aux =  JOptionPane.showInputDialog(null,"Insira o tamanho do vetor");
        tamanhovetor = Integer.parseInt(aux);
        
        double pagamento [] = new double [tamanhovetor];
        
        for (int i = 0; i < pagamento.length; i++) {
            
            aux =  JOptionPane.showInputDialog(null,"Insira um numero");
            pagamento[i] = Double.parseDouble(aux);
        }
        
        for (int i = 0; i < pagamento.length; i++) {
            System.out.println("Valor do Pagamento: "+pagamento[i]);
        }
        
        
        System.out.println("Tamanho do vetor: "+tamanhovetor);
    }
    
    
}
