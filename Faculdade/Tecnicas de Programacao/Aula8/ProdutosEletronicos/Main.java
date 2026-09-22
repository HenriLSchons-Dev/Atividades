public class Main{
    public static void main(String[] args) {
        Eletronicos produtoEletronico = new Eletronicos(42.99, "carrinho de controle remoto", 6.7, 6);

        produtoEletronico.exibirEtiqueta();
        produtoEletronico.detalharGarantia();
    }
}