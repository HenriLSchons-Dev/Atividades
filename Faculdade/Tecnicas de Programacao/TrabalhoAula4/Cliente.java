public class Cliente {
    
    private String nome;
    private String email;
    private String telefone;
    private String cadastro;
    private boolean ativo;
    private Endereco endereco;

    public Cliente(String nome, String email, String telefone, String cadastro, boolean ativo) {

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cadastro = cadastro;
        this.ativo = ativo;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public String getCadastro() {

        return cadastro;
    }

    public void setCadastro(String cadastro) {

        this.cadastro = cadastro;
    }

    public boolean getAtivo() {

        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Endereco getEndereco() {

        return endereco;
    }

    public void setEndereco(Endereco endereco) {

        this.endereco = endereco;
    }

}