public class Instancia{
    public static void main(String[] args) {
        Projetor c1 = new Projetor();

        c1.modelo = "Epson";
        c1.cor = "Roxo";
        c1.ligado = false;
        c1.som = true;

        c1.projetar();
        c1.ligar();
        c1.projetar();
        c1.emitir();
        c1.status();

        System.out.println("-------------------------");
        Projetor c2 = new Projetor();

        c2.modelo = "Epson";
        c2.cor = "Branco";
        c2.ligado = true;
        c2.som = false;

        c2.projetar();
        c2.emitir();
        c2.desligar();
        c2.status();
    }
}