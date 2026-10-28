public class IngressoVip extends Ingresso implements Validavel{
    private String cupomCorp;
    private boolean incluiBuffet;

    public IngressoVip(String cupomCorp, boolean incluiBuffet, String codigoAssento, String nomeEvento, double valorBase) {
        super(codigoAssento, nomeEvento, valorBase);
        setCupomCorp(cupomCorp);
        setIncluiBuffet(incluiBuffet);
    }

    @Override
    public double calcularValorFinal(){
        if(validarDocumento(cupomCorp)){
            if(incluiBuffet){
                double valorFinal = getValorBase() + 100;
                return valorFinal;
            } else {
                double valorFinal = getValorBase();
                return valorFinal;
            }
        } else {
            throw new IllegalArgumentException("O documento nao é valido!");
        }
    }

    @Override
    public boolean validarDocumento(String cupomCorp){
        if(cupomCorp == null || cupomCorp.trim().isEmpty()){
            return false;
        } else {
            return true;
        }
    }

    public String getCupomCorp() {
        return cupomCorp;
    }

    public void setCupomCorp(String cupomCorp) {
        this.cupomCorp = cupomCorp;
    }

    public boolean isIncluiBuffet() {
        return incluiBuffet;
    }

    public void setIncluiBuffet(boolean incluiBuffet) {
        this.incluiBuffet = incluiBuffet;
    }
}