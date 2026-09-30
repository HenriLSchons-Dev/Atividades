public abstract class Personagem {
    protected String nome;

    public Personagem(String nome) {
        setNome(nome);
    }

    public abstract void atacar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}