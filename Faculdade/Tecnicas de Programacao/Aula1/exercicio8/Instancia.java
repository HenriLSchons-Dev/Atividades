public class Instancia{
    public static void main(String[] args) {
        Tristeza c1 = new Tristeza();

        c1.existe = true;
        c1.intencidade = 80;
        c1.duracao = 10;
        c1.compartilhado = true;

        c1.sentir();
        c1.refletir();
        c1.diminuir();
        c1.status();

        System.out.println("-------------------------");
        Tristeza c2 = new Tristeza();

        c2.existe = false;
        c2.intencidade = 0;
        c2.duracao = 2;
        c2.compartilhado = false;

        c2.sentir();
        c2.entristecer();
        c2.sentir();
        c2.status();
    }
}