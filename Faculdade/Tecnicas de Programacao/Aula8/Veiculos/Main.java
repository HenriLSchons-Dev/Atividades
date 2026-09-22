public class Main{
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", "M8 Competition", 2023, 4, false);

        carro.isPortamalas();
        carro.abrirPortamalas();
        carro.isPortamalas();
        carro.getQntdPortas();
        carro.exibirDados();
    }
}