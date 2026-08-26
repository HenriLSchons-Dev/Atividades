public class Produto{
    private int codigo;
    private String nome;
    private double precoUnitario;
    private int qntEmEstoque;
    private String categoria;

    public Produto(int id, String nomeProduto, double preco, int emEstoque, String categ){
        this.codigo = id;
        this.nome = nomeProduto;
        setPreco(preco);
        setEstoque(emEstoque);
        this.categoria = categ;
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
        this.categoria = categ;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public boolean darBaixa(int qnt){
        if(qnt > qntEmEstoque || qnt <= 0){
            System.out.println("Operação recusada!");
            return false;
        } else{
            this.qntEmEstoque -= qnt;
            return true;
        }
    }

    public double calcularImposto() {
        String categoriaFormatada = categoria.toLowerCase();

        if (categoriaFormatada.equals("cesta basica") || categoriaFormatada.equals("cesta básica")) {
            return precoUnitario * 0.07;

        } else if (categoriaFormatada.equals("produto de limpeza")) {
            return precoUnitario * 0.12;

        } else if (categoriaFormatada.equals("bebida")) {
            return precoUnitario * 0.18;

        } else {
            return precoUnitario * 0.15;
        }
    }
}