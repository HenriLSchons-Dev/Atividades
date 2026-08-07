public class Instancia{
    public static void main(String[] args) {
        Fichario c1 = new Fichario();

        c1.modelo = "Trademark";
        c1.cor = "Preto";
        c1.folhas = true;
        c1.aberto = true;

        c1.escrever();
        c1.fechar();
        c1.status();

        System.out.println("------------------------------");
        Fichario c2 = new Fichario();

        c2.modelo = "Trademark";
        c2.cor = "Branco";
        c2.folhas = false;
        c2.aberto = false;

        c2.escrever();
        c2.abrir();
        c2.escrever();
        c2.status();
    }
}