public class Produto{
    private int codigo;
    private String nome;
    private double precoUnitario;
    private int qntEmEstoque;
    private String Categoria;

    public Produto(int id, String nomeProduto, double preco, int emEstoque, String categ){
        this.codigo = id;
        this.nome = nomeProduto;
        this.precoUnitario = preco;
        this.qntEmEstoque = emEstoque;
        this.Categoria = categ;
    }

    public void setCodigo(int id){
        this.codigo = id;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String nomeProduto){
        this.nome = nomeProduto;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        if(preco > 0){
            this.precoUnitario = preco;
        } else{
            System.out.println("Insira valor adequado!");
        }
    }

    public double getPreco(){
        return this.precoUnitario;
    }

    public void setEstoque(int emEstoque){
        if(emEstoque >= 0){
            this.qntEmEstoque = emEstoque;
        } else{
            System.out.println("Informe a quantidade correta!");
        }
    }

    public int getEstoque(){
        return this.qntEmEstoque;
    }

    public void setCategoria(String categ){
        this.Categoria = categ;
    }

    public String getCategoria(){
        return this.Categoria;
    }

    public void darBaixa(int qnt){
        if(qnt > qntEmEstoque){
            System.out.println("Operação recusada!");
        } else{
            this.qntEmEstoque =+ qnt;
        }
    }

    public void status(){
        System.out.println(".()");
        System.out.println(".()");
        System.out.println(".()");
        System.out.println(".()");
        System.out.println(".()");
    }
}