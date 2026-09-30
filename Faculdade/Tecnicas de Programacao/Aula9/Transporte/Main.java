public class Main{
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro("Fusca");
        Veiculo minhaMoto = new Moto("Honda CB 300");

        meuCarro.acelerar();
        minhaMoto.acelerar();
    }
}