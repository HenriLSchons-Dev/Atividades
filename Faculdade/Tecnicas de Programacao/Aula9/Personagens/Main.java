public class Main{
    public static void main(String[] args) {
        Personagem p1 = new Guerreiro("Aragorn");
        Personagem p2 = new Mago("Gandalf");

        p1.atacar();
        p2.atacar();
    }
}