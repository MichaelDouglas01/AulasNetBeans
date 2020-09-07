
package PacoteJava;
// Variaveis:
// A - Variavel de Entrada
// B - Variavel de Entrada
// C - Peso
// D - Altura 
// E - Resultado
// F - Convertendo resultado para int
import javax.swing.*;

public class Exercicio0707 {
    
         public static void main(String args[]){
        voltar();
    }
    public static void closing(){
        int  A = 0;
        String B = "";
        B = JOptionPane.showInputDialog(null, "1 - Continuar\n2 - Sair ", "Meu IMC", 0);
        A = Integer.parseInt(B);
        if (A == 1) {
            voltar();
        }
        else {
            System.exit(0);
        }
    }
    public static void voltar(){
        double C, D, E= 0;
        int F = 0;
        String inp = "";
try {
        inp = JOptionPane.showInputDialog(null,"Informe seu Peso: (kg)", "Meu IMC", JOptionPane.QUESTION_MESSAGE);
        inp = inp.replace(',','.');
        C = Double.parseDouble(inp);
        if (C < 0.5){
            JOptionPane.showMessageDialog(null, "Peso Invalido!", "Desculpe", JOptionPane.ERROR_MESSAGE);
            voltar();
        }
        inp = JOptionPane.showInputDialog(null,"Informe sua Altura: (M)", "Meu IMC", JOptionPane.QUESTION_MESSAGE);
        inp = inp.replace(',','.');
        D = Double.parseDouble(inp);
        if (D < 0.1){
            JOptionPane.showMessageDialog(null, "Altura Invalida!", "Desculpe", JOptionPane.ERROR_MESSAGE);
            voltar();
        }
        E = C / Math.pow(D,2);
        F = (int)E;

        if (E < 18.5) {
            JOptionPane.showMessageDialog(null, "O SEU IMC É: " + F + "\nEXCESSO DE MAGREZA", "Meu IMC", 1);
        }

        else if(E > 18.5 && E < 25) {
            JOptionPane.showMessageDialog(null, "O SEU IMC É: " + F + "\nPESO NORMAL", "Meu IMC", 1);
        }

        else if(E > 25 && E < 30) {
            JOptionPane.showMessageDialog(null, "O SEU IMC É: " + F + "\nEXCESSO DE PESO", "Meu IMC", 1);
        }

        else if(E >= 30 && E < 35) {
            JOptionPane.showMessageDialog(null, "O SEU IMC É: " + F + "\nOBESIDADE GRAU I", "Meu IMC", 1);
        }

        else if(E >= 35 && E < 40) {
            JOptionPane.showMessageDialog(null, "O SEU IMC É: " + F + "\nOBESIDADE GRAU II", "Meu IMC", 1);
        }

        else if(E > 40) {
            JOptionPane.showMessageDialog(null, "O SEU IMC É: " + F + "\nOBESIDADE GRAU III", "Meu IMC", 1);
        }

        closing();
    }
    catch (NumberFormatException ex) {
             JOptionPane.showMessageDialog(null,"Somente Numeros!", "Desculpe", JOptionPane.ERROR_MESSAGE);
             voltar();   
    }
    catch (NullPointerException ex) {
             System.exit(0);
    }
    }
}