public class Produtos{
    protected double preco;
    protected String nome;

    public Produtos(){

    }

    public Produtos(double preco, String nome){
        setPreco(preco);
        setNome(nome);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirEtiqueta(){
        System.out.printf("O produto '%s' esta saindo por %.2f%n", getNome(), getPreco());
    }

}