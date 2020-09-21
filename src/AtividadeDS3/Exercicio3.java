
package AtividadeDS3;


public class Exercicio3 {
    
    
public static void main(String[] args) {
    
    int vetorum[] = new int [10];
    int vetordois[] = new int [10];
    
    
    System.out.println("Crie um programa em Java que leia um array de 10 números inteiros e gere um segundo vetor (que deve ser impresso), cujas posições pares\n" +
"são o dobro do vetor original e as ímpares são o triplo.\n\n");
     
    
    vetorum[0]= 10;
    vetorum[1]= 20;
    vetorum[2]= 30;
    vetorum[3]= 40;
    vetorum[4]= 50;
    vetorum[5]= 60;
    vetorum[6]= 70;
    vetorum[7]= 80;
    vetorum[8]= 90;
    vetorum[9]= 100;
    
    System.out.println("Os Números do 1° Vetor são:\n");
    
    
    System.out.println("Posição 0: "+vetorum[0]);
    System.out.println("Posição 1: "+vetorum[1]);
    System.out.println("Posição 2: "+vetorum[2]);
    System.out.println("Posição 3: "+vetorum[3]);
    System.out.println("Posição 4: "+vetorum[4]);
    System.out.println("Posição 5: "+vetorum[5]);
    System.out.println("Posição 6: "+vetorum[6]);
    System.out.println("Posição 7: "+vetorum[7]);
    System.out.println("Posição 8: "+vetorum[8]);
    System.out.println("Posição 9: "+vetorum[9]+"\n");
    
    
    vetordois[0]= 10 * 2;
    vetordois[1]= 20 * 3;
    vetordois[2]= 30 * 2;
    vetordois[3]= 40 * 3;
    vetordois[4]= 50 * 2;
    vetordois[5]= 60 * 3;
    vetordois[6]= 70 * 2;
    vetordois[7]= 80 * 3;
    vetordois[8]= 90 * 2;
    vetordois[9]= 100 * 3;
    
    System.out.println("Os Números do 2° Vetor são:\n");
    
    System.out.println("Posição 0: "+vetordois[0]);
    System.out.println("Posição 1: "+vetordois[1]);
    System.out.println("Posição 2: "+vetordois[2]);
    System.out.println("Posição 3: "+vetordois[3]);
    System.out.println("Posição 4: "+vetordois[4]);
    System.out.println("Posição 5: "+vetordois[5]);
    System.out.println("Posição 6: "+vetordois[6]);
    System.out.println("Posição 7: "+vetordois[7]);
    System.out.println("Posição 8: "+vetordois[8]);
    System.out.println("Posição 9: "+vetordois[9]);
    
    System.exit(0);       
}
}
