public class IngressoMeiaEntrada extends Ingresso implements Validavel{
    private String numeroCarteiraEstudantil;

    public IngressoMeiaEntrada(String numeroCarteiraEstudantil, String codigoAssento, String nomeEvento, double valorBase) {
        super(codigoAssento, nomeEvento, valorBase);
        setNumeroCarteiraEstudantil(numeroCarteiraEstudantil);
    }

    @Override
    public double calcularValorFinal(){
        if(validarDocumento(numeroCarteiraEstudantil)){
            double valorFinal = getValorBase() * 0.50;
            return valorFinal;
        } else {
            throw new IllegalArgumentException("O documento nao é valido!");
        }
    }

    @Override
    public boolean validarDocumento(String numeroCarteiraEstudantil){
        if(numeroCarteiraEstudantil == null || numeroCarteiraEstudantil.trim().isEmpty()){
            return false;
        } else {
            return true;   
        }
    }

    public String getNumeroCarteiraEstudantil() {
        return numeroCarteiraEstudantil;
    }

    public void setNumeroCarteiraEstudantil(String numeroCarteiraEstudantil) {
        if(numeroCarteiraEstudantil == null || numeroCarteiraEstudantil.trim().isEmpty()){
            throw new IllegalArgumentException("Numero estudantil invalido!");
        } else {
            this.numeroCarteiraEstudantil = numeroCarteiraEstudantil;
        }
    }

}