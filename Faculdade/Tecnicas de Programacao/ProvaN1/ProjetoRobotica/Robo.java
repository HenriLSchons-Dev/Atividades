public class Robo{
    private int codigo;
    private String nome;
    private String tipo;
    private int bateria;
    private boolean ativo;

    public Robo(){

    }

    public Robo(int codigo, String nome, String tipo){
        setCodigo(codigo);
        setNome(nome);
        setTipo(tipo);
        this.bateria = 100;
        this.ativo = false;
    }

    public Robo(int codigo, String nome, String tipo, int bateria, boolean ativo){
        setCodigo(codigo);
        setNome(nome);
        setTipo(tipo);
        setBateria(bateria);
        setAtivo(ativo);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo > 0){
            this.codigo = codigo;
        } else {
            System.out.println("Erro!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Erro!");
        } else{
            this.nome = nome;
        }
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        if(tipo == null || tipo.trim().isEmpty()){
            System.out.println("Erro!");
        } else {
            this.tipo = tipo;
        }
    }

    public int getBateria() {
        return this.bateria;
    }

    public void setBateria(int bateria) {
        if(bateria >= 0 && bateria <= 100){
            this.bateria = bateria;
        } else {
            System.out.println("Erro!");
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void ligar() {
        if(getBateria() >= 0 && getBateria() <= 100){
            this.ativo = true;
        } else {
            System.out.println("Nao foi possivel ligar o robo");
            System.out.println("Bateria insuficiente");
        }
    }

    public void desligar(){
        if(isAtivo()){
            this.ativo = false;
        } else {
            System.out.println("Robo ja desligado");
        }
    }

    public void recarregar(){
        this.bateria = 100;
    }

    public void consumirBateria(int porcentagem){ 
        int consumo = this.bateria - porcentagem;

        if(consumo >= 0 && consumo <= this.bateria){
            this.bateria = consumo;
        } else {
            System.out.println("Consumo de bateria nao possivel");
        }
    }

    public void exibirDados(){
        System.out.println("---------------------------------------");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Bateria: " + getBateria());
        System.out.println("Status: " + isAtivo());
        System.out.println("---------------------------------------");
    }
}