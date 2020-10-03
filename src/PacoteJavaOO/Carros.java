
package PacoteJavaOO;


public class Carros {
    private String marca;
    private String cor;
    private String placa;
    private int velocidade_atual;
    private char marcha_atual;
    private boolean freio_de_mao_puxado;
    private boolean chave_virada;
    
//________________________ 
// criando construtor da classe    
    public Carros() {
    } 
//____________________________ 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidade_atual() {
        return velocidade_atual;
    }

    public void setVelocidade_atual(int velocidade_atual) {
        this.velocidade_atual = velocidade_atual;
    }

    public char getMarcha_atual() {
        return marcha_atual;
    }

    public void setMarcha_atual(char marcha_atual) {
        this.marcha_atual = marcha_atual;
    }

    public boolean isFreio_de_mao_puxado() {
        return freio_de_mao_puxado;
    }

    public void setFreio_de_mao_puxado(boolean freio_de_mao_puxado) {
        this.freio_de_mao_puxado = freio_de_mao_puxado;
    }

    public boolean isChave_virada() {
        return chave_virada;
    }

    public void setChave_virada(boolean chave_virada) {
        this.chave_virada = chave_virada;
    }
    
    public void ligar(){
        
    }
    
    public void acelerar_ate(int velocidade){
        
    }
    
    public void mudar_marcha(int marcha){
        
    }
    
    public void parar(){
         
    }
    
    
}
