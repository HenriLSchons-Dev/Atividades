public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    @Override
    public double calcularArea() {
        return 3.14 * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}