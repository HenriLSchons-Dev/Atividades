public class Espaco {
    private String nome;
    private String endereco;
    private int capacidade;
    private String tipo;

    public Espaco(String nome, String endereco, int capacidade, String tipo) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
        }

        this.nome = nome;
        this.endereco = endereco;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Tipo: " + this.tipo);
    }
}