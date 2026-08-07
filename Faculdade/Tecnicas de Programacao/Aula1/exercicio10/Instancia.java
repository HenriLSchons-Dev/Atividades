public class Instancia{
    public static void main(String[] args) {
        Credo c1 = new Credo();

        c1.existe = true;
        c1.intencidade = 80;
        c1.evidencias = false;
        c1.compartilhado = true;

        c1.pensar();
        c1.rezar();
        c1.pregar();
        c1.status();

        System.out.println("-------------------------");
        Credo c2 = new Credo();

        c2.existe = true;
        c2.intencidade = 0;
        c2.evidencias = true;
        c2.compartilhado = true;

        c2.pensar();
        c2.rezar();
        c2.pregar();
        c2.status();
    }
}