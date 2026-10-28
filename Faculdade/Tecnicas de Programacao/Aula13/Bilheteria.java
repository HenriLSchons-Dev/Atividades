public class Bilheteria {

    public void processarVenda(Ingresso ingresso){
        ingresso.calcularValorFinal();
        ingresso.exibirResumo();
    }
}