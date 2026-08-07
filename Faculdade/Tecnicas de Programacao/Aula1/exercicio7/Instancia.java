public class Instancia{
    public static void main(String[] args) {
        Conhecimento c1 = new Conhecimento();

        c1.aprendido = false;
        c1.nivel = 0;
        c1.area = "Geometria Analitica";
        c1.compartilhado = false;

        c1.aprender();
        c1.aprimorar();
        c1.ensinar();
        c1.status();

        System.out.println("-----------------------");
        Conhecimento c2 = new Conhecimento();

        c2.aprendido = true;
        c2.nivel = 50;
        c2.area = "Programacao";
        c2.compartilhado = false;

        c2.ensinar();
        c2.aprimorar();
        c2.aprimorar();
        c2.ensinar();
        c2.status();
    }
}