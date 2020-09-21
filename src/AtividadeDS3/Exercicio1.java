
package AtividadeDS3;

import javax.swing.*;
/* Variaveis 
Quantidade dee Pessoas = A
Altura = B
Idade = C
Sexo = D
Converter = E
Length = F 
Menor Altura = G
Maior Altura = H
Quantidade de Mulher = I
Média da Altura M. = J
Homem mais Velho = K
Mulher mais Nova = L
*/

public class Exercicio1 {
    
    public static void main (String args []){  
    reiniciar();    
    }
    
    public static void reiniciar() {
    
        
    int A = 0;
    String E = "";
        
    try {    
    E =  JOptionPane.showInputDialog(null,"Quantidade de Pessoas:", "Bem Vindo!", JOptionPane.QUESTION_MESSAGE);
    A = Integer.parseInt(E);
       
    double B;
    int C, D; 
    double F [] = new double [A];
    double H = 0, G = 120; 
    double I = 0, J = 0;       
    int K =0, L = 200;   
        
        for (int i = 0; i < F.length; i++) {       
                 
        String altura = JOptionPane.showInputDialog ((i+1)+"º Pessoa - Digite a altura (M)"); 
        altura = altura.replace(',','.');
        B = Double.parseDouble(altura);  
        if (B > 100){
        JOptionPane.showMessageDialog(null, "Altura Invalida!", "Desculpe", JOptionPane.ERROR_MESSAGE);
        reiniciar();                   
        }
        String idade = JOptionPane.showInputDialog((i+1)+"º Pessoa - Digite a idade");   
        C = Integer.parseInt(idade); 
        if (C > 120){
        JOptionPane.showMessageDialog(null, "Idade Invalida!", "Desculpe", JOptionPane.ERROR_MESSAGE);
        reiniciar(); 
        }           
        String sexo = JOptionPane.showInputDialog((i+1)+"º Pessoa - Digite:\n 1 - Masculino\n 2 - Feminino");   
        D = Integer.parseInt(sexo);
        if (D > 2){
        JOptionPane.showMessageDialog(null, "Sexo Invalido!", "Desculpe", JOptionPane.ERROR_MESSAGE);
        reiniciar();
        }
        
            if (H < B) {         
                H = B;
                H = H * 100;
                H = Math.ceil(H);
                H = H / 100;
            }
            if (G > B) {
                G = B;
                G = G * 100;
                G = Math.ceil(G);
                G = G / 100;
            }
            if (D == 2) { 
                J = J + B;
                I++;   
            }
            if (D == 1) {
            if (K < C) {
                K = C;
            } 
            }
            if (D == 2) {
            if (L > C) {
                L = C;
            } 
            }
            }
        
        J = J / I;
        J = J * 100;
        J = Math.ceil(J);
        J = J / 100;
              
        System.out.println("A Maior Altura é (M): "+H);  
        System.out.println("A Menor Altura é (M): "+G); 
        System.out.println("A Altura Média das Mulheres é (M): "+J);
        System.out.println("O Homem Mais Velho tem (Anos): "+K);  
        System.out.println("A Mulher Mais Nova tem (Anos): "+L); 
      }  
    catch (java.lang.NumberFormatException ex) {
    System.exit(0);        
    }
    }
    } 