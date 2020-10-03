
package TestandoOO;


public class TestarHerança {
    
    public static void main(String[] args) {
        
        Pessoa_Fisica pf = new Pessoa_Fisica();
        
        pf.setNome("Michael");
        pf.setEndereco("Oscar Schade, 87");
        pf.setCidade("São Paulo");
        pf.setUF("SP");
        pf.setCEP(15308000);
        
        pf.setCPF("123.456.789-10");
        pf.setRG("12.345.678-9");
        pf.setSexo('M');
        pf.setData_nascimento("21/07/1997");
        
        System.out.println("Nome: "+pf.getNome()
        +"\nEndereço: "+pf.getEndereco()
        +"\nCidade: "+pf.getCidade()
        +"\nUF: "+pf.getUF()
        +"\nCEP: "+pf.getCEP()
        +"\n\n\nCPF: "+pf.getCPF()
        +"\nRG: "+pf.getRG()
        +"\nSexo: "+pf.getSexo()
        +"\nNascimento: "+pf.getData_nascimento());
        
        
        Pessoa_Juridica pj = new Pessoa_Juridica();
        
        pj.setCNPJ("12.345.678/0001-XX");
        pj.setInscricao_estadual("1234502312");
        pj.setRazao_social("Michael Douglas LTDA");
        
        System.out.println("\n\nCNPJ: "+pj.getCNPJ()
        +"\nIE: "+pj.getInscricao_estadual()
        +"\nRS: "+pj.getRazao_social());
        
        
    }
    
}
