public class Instancia{
    public static void main(String[] args) {
        Alegria c1 = new Alegria();

        c1.existe = true;
        c1.intencidade = 80;
        c1.duracao = 10;
        c1.compartilhado = true;

        c1.sentir();
        c1.alegrar();
        c1.sorrir();
        c1.status();

        System.out.println("-------------------------");
        Alegria c2 = new Alegria();

        c2.existe = false;
        c2.intencidade = 0;
        c2.duracao = 2;
        c2.compartilhado = false;

        c2.sentir();
        c2.alegrar();
        c2.sorrir();
        c2.sentir();
        c2.status();
    }
}