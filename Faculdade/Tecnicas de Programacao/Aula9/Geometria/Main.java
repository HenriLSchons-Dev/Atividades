public class Main{
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 5);
        Circulo circulo = new Circulo(3);

        System.out.print("Retângulo: ");
        retangulo.imprimirArea();

        System.out.print("Círculo: ");
        circulo.imprimirArea();
    }
}