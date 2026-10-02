public class Terminal{
    private int idTerminal;
    private String nome;
    private String localizacao;

    public Terminal(int idTerminal, String nome, String localizacao){
        setIdTerminal(idTerminal);
        setNome(nome);
        setLocalizacao(localizacao);
    }

    public int getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(int idTerminal) {
        if(idTerminal > 0){
            this.idTerminal = idTerminal;
        } else {
            System.out.println("ERRO: Terminal sem id!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("ERRO: Nome invalido!");
        } else {
            this.nome = nome;
        }
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        if(localizacao == null || localizacao.trim().isEmpty()){
            System.out.println("ERRO: Localizacao invalida!");;
        } else {
            this.localizacao = localizacao;
        }
    }

}