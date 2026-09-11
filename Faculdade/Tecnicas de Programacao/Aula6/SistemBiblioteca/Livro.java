public class Livro{
    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicado;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn, int anoPublicado, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicado = anoPublicado;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void exibirDados(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Ano de publicacao: " + this.anoPublicado);
        System.out.println("Disponivel: " + this.disponivel);
    }
}