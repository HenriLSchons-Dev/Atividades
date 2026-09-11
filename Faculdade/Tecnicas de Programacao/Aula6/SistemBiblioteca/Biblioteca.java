public class Biblioteca{
    private String nome;

    public Biblioteca(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void realizarEmprestimo(Livro livro, Leitor leitor){
        if(livro.isDisponivel() && leitor.isMatricula()){
            System.out.println("Emprestimo realizado com sucesso!");
        } else {
            System.out.println("Livro indisponivel para emprestimo");
        }
    }
}