package TestandoOO;

public class Cliente {

    private String nome;
    private String endereco;
    private String cidade;
    private String UF;
    private int CEP;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public void IncluirNovoCliente() {
        System.out.println("Cliente Incluido");
    }

    public void AtualizarCliente() {
        System.out.println("Cliente Atualizado");
    }

}
