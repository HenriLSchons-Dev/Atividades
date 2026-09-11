public class Leitor{
    private String nome;
    private boolean matricula;

    public Leitor(String nome, boolean matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
    }
}