public abstract class Forma {
    public abstract double calcularArea();

    public void imprimirArea() {
        System.out.println("A área é: " + calcularArea());
    }
}