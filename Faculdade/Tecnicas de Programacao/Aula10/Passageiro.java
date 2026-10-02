public class Passageiro extends Pessoa{
    private String codigoCartao;
    private double saldo;
    private String categoria;

    public Passageiro(int id, String nome, String cpf, String telefone, String codigoCartao, double saldo, String categoria){
        super(id, nome, cpf, telefone);
        setCodigoCartao(codigoCartao);
        setSaldo(saldo);
        setCategoria(categoria);
    }

    public String getCodigoCartao() {
        return codigoCartao;
    }

    public void setCodigoCartao(String codigoCartao) {
        if (codigoCartao != null && codigoCartao.matches("\\d{10}")) {
            this.codigoCartao = codigoCartao;
        } else {
            System.out.println("Código do cartão inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo > 0){
            this.saldo = saldo;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        categoria = categoria.toUpperCase().trim().replaceAll("[0-9]", "");
        
        if(categoria.equals("COMUM") || categoria.equals("ESTUDANTE") || categoria.equals("IDOSO")){
            this.categoria = categoria;
        } else {
            System.out.println("Categoria invalida!");
        }
    }

    public double calcularValorTarifa(double tarifaBase){
        if(getCategoria().equals("COMUM")){
            return 5.00;
        } else if (getCategoria().equals("ESTUDANTE")){
            return 2.50;
        } else {
            return 0.00;
        }
    }

    public void debitarTarifa(){
        if(getSaldo() >= calcularValorTarifa(saldo)){
            this.saldo -= calcularValorTarifa(saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Codigo cartao de embarque: " + getCodigoCartao());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Categoria: " + getCategoria());
    }
}