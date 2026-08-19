public class Produto{
    private int quantidade;
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setQuantidade(int q){
        this.quantidade = q;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double p){
        this.preco = p;
    }

    public double getPreco(){
        return this.preco;
    }

    public void status(){
        System.out.println("Produtos inseridos: " + this.quantidade);
        System.out.println("Tipo de produto: " + this.nome);
        System.out.println("Precos: " + this.preco);
    }
}