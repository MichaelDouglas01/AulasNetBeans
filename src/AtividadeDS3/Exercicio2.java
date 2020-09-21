
package AtividadeDS3;
/* Variaveis:
A = Quantidade dee Pessoas;
B = Length;
C = Idade;
D = Sexo;
E = Cabelo;
F = Quant. de Mulheres;
G = Quant. de Pessoas com mais de 30 anos;
H = Calculo da Porcentagem;
I = Quant. de Caabelos castanhos;
*/
import javax.swing.*;

public class Exercicio2 {
    
    public static void main (String args []){
        
    int A = 0;
    String aux = "";
        
    try {      
    aux =  JOptionPane.showInputDialog(null,"Quantidade de Pessoas:", "Pesquisa Regional!", JOptionPane.QUESTION_MESSAGE);
    A = Integer.parseInt(aux);
         
    double B [] = new double [A];
    int C, D, E;
    int F = 0, I = 0, G = 0;

       
        for (int i = 0; i < B.length; i++) { 
        
            String idade = JOptionPane.showInputDialog((i+1)+"º Pessoa - Digite a Idade:");   
            C = Integer.parseInt(idade); 
            if (C > 120){
            JOptionPane.showMessageDialog(null, "Idade Invalida!", "Desculpe", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            }
            String sexo = JOptionPane.showInputDialog((i+1)+"º Pessoa - Digite o Sexo:\n1 - Masculino\n2 - Feminino");   
            D = Integer.parseInt(sexo);
            if (D > 2){
            JOptionPane.showMessageDialog(null, "Sexo Invalido!", "Desculpe", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            }
            String cabelo = JOptionPane.showInputDialog((i+1)+"º Pessoa - Digite a Cor do Cabelo:\n1 - Castanho\n2 - Preto\n3 - Loiro\n4 - Ruivo");   
            E = Integer.parseInt(cabelo);
            if (E > 4){
            JOptionPane.showMessageDialog(null, "Cor de Cabelo Invalida!", "Desculpe", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            }
            
            
            if (D == 2) {
                F++;
            }
            
            if (C >= 31){
                G++;
            }
            if (E == 1) {
                I++;
            }
        }  

        G = G * 100;
        int H = G / A;

        
            System.out.println(F + " - Habitantes Femininas");
            System.out.println(I + " - Habitantes tem a cor do cabelo castanho");
            System.out.println(H + "% - Dos Habitantes possuem mais de 30 Anos");
    }
    catch (java.lang.NumberFormatException ex) {
            System.exit(0);
    }
}
}