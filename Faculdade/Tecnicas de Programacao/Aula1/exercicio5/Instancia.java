public class Instancia{
    public static void main(String[] args) {
        Aluno c1 = new Aluno();

        c1.nome = "Henri";
        c1.idade = 18;
        c1.atencao = 82;
        c1.acordado = true;

        c1.aprender();
        c1.status();

        System.out.println("---------------------");
        Aluno c2 = new Aluno();

        c2.nome = "Thiago";
        c2.idade = 18;
        c2.atencao = 45;
        c2.acordado = false;

        c2.acordar();
        c2.aprender();
        c2. dormir();
        c2.status();
    }
}