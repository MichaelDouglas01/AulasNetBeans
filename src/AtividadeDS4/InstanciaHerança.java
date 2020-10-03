package AtividadeDS4;

public class InstanciaHerança {

    public static void main(String[] args) {

        Cliente C = new Cliente();

        C.setNome("Michael");
        C.setCPF("243.145.795-50");
        C.setTelefone("(11)4002-8922");
        C.setEmail("Michael@Michael.com.br");
        C.setDataNascimento("21/07/1997");
        C.setClienteDesde("01/02/2019");

        C.setclienteDesde("01 de Fevereiro de 2019");

        System.out.println("Nome: " + C.getNome()
                + "\nCPF: " + C.getCPF()
                + "\nTelefone: " + C.getTelefone()
                + "\nEmail: " + C.getEmail()
                + "\nData de Nascimento: " + C.getDataNascimento()
                + "\nCliente desde: " + C.getClienteDesde()
                + "\nCliente desde: " + C.getclienteDesde());

        Funcionario F = new Funcionario();

        F.setNome("Michael");
        F.setCPF("243.145.795-50");
        F.setTelefone("(11)4002-8922");
        F.setEmail("Michael@Michael.com.br");
        F.setDataNascimento("21/07/1997");
        F.setClienteDesde("01/02/2019");

        F.setRegistro("87497");
        F.setCarteiraTrabalho("Analista de Sistema");
        F.setPis("170.33259.50-4");

        System.out.println("\n\nNome: " + F.getNome()
                + "\nCPF: " + F.getCPF()
                + "\nTelefone: " + F.getTelefone()
                + "\nEmail: " + F.getEmail()
                + "\nData de Nascimento: " + F.getDataNascimento()
                + "\nCliente desde: " + F.getClienteDesde()
                + "\nRegistro: " + F.getRegistro()
                + "\nCarteira de Trabalho: " + F.getCarteiraTrabalho()
                + "\nPis: " + F.getPis());

    }

}
