
package AtividadeDS3;

import javax.swing.*;

public class Exercicio4 {
    
public static void main(String[] args) {
    
    
    double altura[] = new double [10]; 
    double soma = 0;
    int divisao = 10;
    double resultado = 0;
    
    System.out.println("Crie um programa em Java que leia um array de 10 alturas e elabore um algoritmo que permita calcular a média das alturas.\n\n");
    
    altura[0]= 1.85;
    altura[1]= 1.64;
    altura[2]= 2.13;
    altura[3]= 1.44;
    altura[4]= 1.55;
    altura[5]= 1.72;
    altura[6]= 1.83;
    altura[7]= 1.79;
    altura[8]= 1.43;
    altura[9]= 1.59;

    
    System.out.println("1° Altura é: "+altura[0]);
    System.out.println("2° Altura é: "+altura[1]);
    System.out.println("3° Altura é: "+altura[2]);
    System.out.println("4° Altura é: "+altura[3]);
    System.out.println("5° Altura é: "+altura[4]);
    System.out.println("6° Altura é: "+altura[5]);
    System.out.println("7° Altura é: "+altura[6]);
    System.out.println("8° Altura é: "+altura[7]);
    System.out.println("9° Altura é: "+altura[8]);
    System.out.println("10° Altura é: "+altura[9]+"\n");
    
    soma = altura[0]+altura[1]+altura[2]+altura[3]+altura[4]+altura[5]+altura[6]+altura[7]+altura[8]+altura[9];
    
    
    resultado = soma / divisao;
    resultado = resultado * 100;
    resultado = Math.ceil(resultado);
    resultado = resultado / 100;
    
    System.out.println("A Média das Alturas é: "+resultado);  
    
    System.exit(0); 
}    
}
