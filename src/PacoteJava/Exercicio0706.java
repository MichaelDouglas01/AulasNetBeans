
package PacoteJava;
// Variaveis: 
// A - Salário Bruto
// B - Salário Liquido
// C - Alíquota 
// D - Salário Bruto / Alíquota
import javax.swing.*;

public class Exercicio0706 {
    public static void main(String args []) {
        reiniciar();
    }
   public static void reiniciar() {
                   double A = 0;
        double B = 0;
        int C = 0;      
        String aux="";

        try {
        
        aux = JOptionPane.showInputDialog(null, "Informe seu Salário ", "Meu INSS", JOptionPane.QUESTION_MESSAGE);
        aux = aux.replace(',','.');
        A = Double.parseDouble(aux);

        
        
       if (A < 465.65) {
           String erro = String.format("Desculpe");
           JOptionPane.showMessageDialog(null, "Salário Invalido", erro,0); 
           reiniciar();
       }
       
       else if (A >= 465.65 && A <= 965.67) { 
          C = 8;
          double D = A * C;
          D = D / 100;
          B = A - D;
          B = B * 100;
          B = Math.ceil(B);
          B = B / 100;
          
          String mensagem = String.format( "<html>Salário Bruto: R$%,.2f<br>Salário Liquido: R$%,.2f<br>" +
                "Desconto do INSS: R$%,.2f<br>Alíquota: %d%%</html>", A, B, D, C);
          JOptionPane.showMessageDialog(null, mensagem, "Meu INSS",1);
          System.exit(0);
                                //Outra Resolução
          //String mensagem = String.format("Meu INSS");
          //JOptionPane.showMessageDialog(null, "Salario Liquido: R$ "+B, mensagem,1); 
          //System.exit(0); 
       }
          
       else if (A >= 965.68 && A <= 1609.45) { 
          C = 9;
          double D = A * C;
          D = D / 100;
          B = A - D;
          B = B * 100;
          B = Math.ceil(B);
          B = B / 100;
          
          String mensagem = String.format( "<html>Salário Bruto: R$%,.2f<br>Salário Liquido: R$%,.2f<br>" +
                "Desconto do INSS: R$%,.2f<br>Alíquota: %d%%</html>", A, B, D, C);
          JOptionPane.showMessageDialog(null, mensagem, "Meu INSS",1);
          System.exit(0);
          
                                //Outra Resolução
          //String mensagem = String.format("Meu INSS");
          //JOptionPane.showMessageDialog(null, "Salario Liquido: R$ "+B, mensagem,1); 
          //System.exit(0);
       }
             
         else if (A >= 1609.46 && A <= 3218.90) { 
          C = 11;
          double D = A * C;
          D = D / 100;
          B = A - D;
          B = B * 100;
          B = Math.ceil(B);
          B = B / 100;
          
          String mensagem = String.format( "<html>Salário Bruto: R$%,.2f<br>Salário Liquido: R$%,.2f<br>" +
                "Desconto do INSS: R$%,.2f<br>Alíquota: %d%%</html>", A, B, D, C);
          JOptionPane.showMessageDialog(null, mensagem, "Meu INSS",1);
          System.exit(0);
          
                                //Outra Resolução
          //String mensagem = String.format("Meu INSS");
          //JOptionPane.showMessageDialog(null, "Salario Liquido: R$ "+B, mensagem,1);
          //System.exit(0);
       }
         else if (A > 3218.90) {
            
             double D = 354.07;
             B = A - D;
             B = B * 100;
             B = Math.ceil(B);
             B = B / 100;
             String mensagem = String.format( "Salário Bruto: R$%,.2f%nSalário Liquido: R$%,.2f%n" +
                "Desconto do INSS: R$%,.2f%nO Desconto Maximo é de: R$ 354,07", A, B, D);
          JOptionPane.showMessageDialog(null, mensagem, "Meu INSS",1);
          System.exit(0);      
             
             //JOptionPane.showMessageDialog(null, "O Desconto Maximo é de: R$ 354,07","Meu INSS", JOptionPane.PLAIN_MESSAGE);
             //System.exit(0);
            }
        }
        catch (NumberFormatException ex) {
             JOptionPane.showMessageDialog(null,"Por favor insira somente valores", "Meu INSS", JOptionPane.ERROR_MESSAGE);     
             reiniciar();
        }
         catch (NullPointerException ex) {
             System.exit(0);
        }
        }
    }
  
   

    