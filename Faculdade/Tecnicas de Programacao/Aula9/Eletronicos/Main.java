public class Main{
    public static void main(String[] args) {
        DispositivoEletronico ar = new ArCondicionado("Samsung", 1500);
        DispositivoEletronico tv = new Televisao("LG", 100);

        System.out.println("Consumo Ar Condicionado (8h): " + ar.calcularConsumoDiario(8) + " kWh");
        System.out.println("Consumo Televisão (4h): " + tv.calcularConsumoDiario(4) + " kWh");
    }
}