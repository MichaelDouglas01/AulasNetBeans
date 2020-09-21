package PacoteArrays;


public class CriandoPercorrendoVetores {
    public static void main(String[] args) {
        
        String nomes[] = new String[5];
        
        nomes[0]="Michael";
        nomes[1]="Logan"; 
        nomes[2]="Igor";
        nomes[3]="Muri";
        nomes[4]="Guilherme"; 

        for (int i = 0; i < 5; i++) {
        
            System.out.println("Seu nome é "+nomes[i]);
        }
    }
     
}
