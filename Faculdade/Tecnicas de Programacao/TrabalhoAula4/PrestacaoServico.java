public class PrestacaoServico {
    
    private String dataInicio;
    private String dataFim;
    private double valor;
    private String status;


    public PrestacaoServico(String dataInicio, String dataFim, double valor, String status) {

        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
        this.status = status;
    }

    public String getDataInicio() {

        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {

        this.dataInicio = dataInicio;
    }

    public String getDataFim() {

        return dataFim;
    }

    public void setDataFim(String dataFim) {

        this.dataFim = dataFim;
    }

    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {
        
        this.status = status;
    }
}
