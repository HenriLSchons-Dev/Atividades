public class Instancia{
    public static void main(String[] args) {
        Lapiseira c1 = new Lapiseira();

        c1.modelo = "Graphgear";
        c1.cor = "Azul";
        c1.carga = 45;
        c1.grafite = false;

        c1.escrever();
        c1.status();

        System.out.println("-------------------------------------------------");

        Lapiseira c2 = new Lapiseira();

        c2.modelo = "Bic";
        c2.cor = "Verde";
        c2.carga = 79;
        c2.grafite = false;

        c2.projetar();
        c2.escrever();
        c2.status();
    }
}