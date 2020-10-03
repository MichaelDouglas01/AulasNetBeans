
package PacoteJavaOO;


public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private char sexo;
    
//________________________ 
// criando construtor da classe    
    public Pessoa() {
    }

//____________________________ 

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void imprimirNome(Object qualquercoisa) {
        System.out.println("Estou Imprindo - "+qualquercoisa);
    }

}
