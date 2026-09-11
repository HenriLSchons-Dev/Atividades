public class Main{
    public static void main(String[] agrs){
        Livro meuLivro = new Livro("I Have No Mouth And I Must Scream", "Harlan Ellison", "978-1497643079", 1967, true);
        Leitor meuLeitor = new Leitor("Henri", true);
        Biblioteca minhaBiblioteca = new Biblioteca("Alexandria");

        minhaBiblioteca.realizarEmprestimo(meuLivro, meuLeitor);
    }
}