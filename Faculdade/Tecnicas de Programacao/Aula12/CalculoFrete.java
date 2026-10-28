public abstract class CalculoFrete {
    
    private String cep;
    private double pesoKg;
    
    public CalculoFrete(String cep, double pesoKg) {
        setCep(cep);
        setPesoKg(pesoKg);
    }
    
    public double getTaxaOperacional() {
        return 12.50;
    }
    
    public abstract double calcularFrete();

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

}