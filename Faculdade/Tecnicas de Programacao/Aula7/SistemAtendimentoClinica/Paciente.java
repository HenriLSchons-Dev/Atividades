public class Paciente{
    private String nome;
    private String cpf;
    private int idade;
    private String telefone;

    public Paciente(){

    }

    public Paciente(String nome, String cpf, int idade, String telefone){
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Nome invalido!");
        } else {
            this.nome = nome;
        }
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Telefone: " + this.telefone);
    }

    public void exibirDados(boolean exibirDadosPessoais){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if(exibirDadosPessoais){
            System.out.println("CPF: " + this.cpf);
            System.out.println("Telefone: " + this.telefone);
        }
    }
}