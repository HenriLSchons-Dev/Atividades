public class ClientePf extends Cliente{


    ClientePf(String nome, String email, String telefone, String cadastro, boolean ativo) {

        super(nome, email, telefone, cadastro, ativo);
    }

    private String cpf;
    private String dataNascimento;

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {
        
        this.cpf = cpf;
    }

    public String getDataNascimento() {

        return dataNascimento;

    }
    public void setDataDenascimento(String dataNascimento) {

        this.dataNascimento = dataNascimento;
    }
    
}