public class Cliente{
    private String nome;
    private int idade;
    private String cpf;

    public Cliente(){
        this.nome = "Fulano";
        this.idade = 0;
        this.cpf = "000.000.000-00";
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int i){
        this.idade = i;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setCpf(String m){
        this.cpf = m;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void statusCliente(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("cpf: " + this.cpf);
    }
}