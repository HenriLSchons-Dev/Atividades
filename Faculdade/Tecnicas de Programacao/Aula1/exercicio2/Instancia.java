public class Instancia{
    public static void main(String[] args) {
        Mochila c1 = new Mochila();

        c1.modelo = "Kipling";
        c1.cor  = "Preta";
        c1.itens = 4;
        c1.cheia = true;
        c1.aberto = true;

        c1.guardar();
        c1.retirar();
        c1.guardar();
        c1.fechar();
        c1.status();

        System.out.println("--------------------------");

        Mochila c2 = new Mochila();

        c2.modelo = "Kipling";
        c2.cor = "Rosa";
        c2.itens = 8;
        c2.cheia = false;
        c2.aberto = false;
        
        c2.abrir();
        c2.guardar();
        c2.fechar();
        c2.status();
    }
}