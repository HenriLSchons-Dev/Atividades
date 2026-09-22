public class Pessoa{
    protected String nome;
    protected String cpf;
    protected int idade;

    public Pessoa(){

    }

    public Pessoa(String nome, String cpf, int idade){
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentar(){
        System.out.print("Prazer! ");
        System.err.printf("Me chamo %s tenho %d anos.%n", getNome(), getIdade());
    }

}