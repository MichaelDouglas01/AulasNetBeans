package TestandoOO;

public class Pessoa_Juridica extends Cliente {

    private String CNPJ;
    private String inscricao_estadual;
    private String razao_social;

    public Pessoa_Juridica() {
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public void ValidadeCNPJ() {
        System.out.println("CNPJ Validado");
    }

}
