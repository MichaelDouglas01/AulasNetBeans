package PacoteJavaOO;

public class TestarCaneta {

    public static void main(String[] args) {
        Caneta caneta;

        caneta = new Caneta();

        caneta.escrever();

        caneta.setMarca("Bic");

        caneta.setCor("Azul");

        //System.out.println("A cor é "+caneta.getCor()+" e a marca é "+caneta.getMarca());
        System.out.println("A cor é " + caneta.getCor());
        System.out.println("A marca é " + caneta.getMarca());

        Caneta caneta1 = new Caneta("preta", "Padrão", "Grossa", true, 5.00);

        System.out.println("A cor é "+ caneta1.getCor()+
                ", modelo é "+ caneta1.getModelo()+ ", a ponta é "+ caneta1.getTipo_de_ponta()+
                ", a resistencia da caneta é "+ caneta1.isResistencia()+ " e o seu preço é R$ "+ caneta1.getPreco());

    }

}
