package TestandoOO;

public class Pessoa_Fisica extends Cliente {

    private String CPF;
    private String RG;
    private char sexo;
    private String data_nascimento;

    public Pessoa_Fisica() {
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void ValidarCPF() {
        System.out.println("CPF Validado");

    }

}
