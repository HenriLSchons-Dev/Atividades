public class IngressoPista extends Ingresso{

    public IngressoPista(String codigoAssento, String nomeEvento, double valorBase) {
        super(codigoAssento, nomeEvento, valorBase);
    }

    @Override
    public double calcularValorFinal(){
        double valorFinal = getValorBase() * 1.10;
        return valorFinal;
    }
}