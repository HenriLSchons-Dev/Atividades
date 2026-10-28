public abstract class Ingresso{
    private String nomeEvento;
    private double valorBase;
    private String codigoAssento;

    public Ingresso(String codigoAssento, String nomeEvento, double valorBase) {
        setCodigoAssento(codigoAssento);
        setNomeEvento(nomeEvento);
        setValorBase(valorBase);
    }

    public abstract double calcularValorFinal();

    public void exibirResumo(){
        System.out.printf("==================== %s ======================= %n",nomeEvento);
        System.out.printf("O valor do ingresso: R$ %.2f%n", valorBase);
        System.out.printf("Assento solicitado: %s%n",codigoAssento);
        System.out.printf("Valor final: R$ %.2f%n",calcularValorFinal());
        System.out.println("==============================================");
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        if(nomeEvento == null || nomeEvento.trim().isEmpty()){
            throw new IllegalArgumentException("Nome do evento invalido!");
        } else {
            this.nomeEvento = nomeEvento;
        }
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        if(valorBase <= 0){
            throw new IllegalArgumentException("Valor base invalido!");
        } else {
            this.valorBase = valorBase;
        }
    }

    public String getCodigoAssento() {
        return codigoAssento;
    }

    public void setCodigoAssento(String codigoAssento) {
        if(codigoAssento == null || codigoAssento.trim().isEmpty()){
            throw new IllegalArgumentException("Codigo invalido!");
        } else {
            this.codigoAssento = codigoAssento;
        }
    }
}