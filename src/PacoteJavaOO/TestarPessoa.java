
package PacoteJavaOO;


public class TestarPessoa {
    
public static void main(String[] args) {
    
    Pessoa ps;
    
    ps = new Pessoa();
    
    ps.setNome("Michael");
    ps.setEmail("michael_sp@hotmail.com");
    ps.setTelefone("(11)4002-8922");
    ps.setSexo('F');
    ps.setIdade(23);
    
    
    System.out.println("Seu Nome: "+ps.getNome()+"\n"
        +"Seu E-mail: "+ps.getEmail()+"\n"
                +"Seu Telefone: "+ps.getTelefone()+"\n"
                    +"Seu Sexo "+ps.getSexo()+"\n"
                        +"Sua Idade: "+ps.getIdade());
    
    ps.imprimirNome(ps.getEmail());
    
    }
    
}
