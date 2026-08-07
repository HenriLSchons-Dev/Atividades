public class Instancia{
    public static void main(String[] args) {
        Amor c1 = new Amor();

        c1.existe = true;
        c1.intencidade = 60;
        c1.confianca = 80;
        c1.correspondido = false;

        c1.amar();
        c1.fortalecer();
        c1.demonstrar();
        c1.status();

        System.out.println("-------------------");
        Amor c2 = new Amor();

        c2.existe = false;
        c2.intencidade = 0;
        c2.confianca = 20;
        c2.correspondido = false;

        c2.amar();
        c2.demonstrar();
        c2.status();
    }
}