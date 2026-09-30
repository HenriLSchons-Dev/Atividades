public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " lança uma bola de fogo causando dano mágico!");
    }
}