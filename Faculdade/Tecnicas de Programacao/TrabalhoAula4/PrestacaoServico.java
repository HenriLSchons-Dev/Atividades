public class PrestacaoServico {
    
    private String dataInicio;
    private String dataFim;
    private double valor;
    private String status;

    private Cliente cliente;
    private Colaborador colaborador;
    private Servico servico;
    private Documento[] documentos = new Documento[10];
    private int quantidadeDocumentos = 0;

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

    public Cliente getCliente() {

        return cliente;
    }

    public void setCliente(Cliente cliente) {

        this.cliente = cliente;
    }

    public Colaborador getColaborador() {

        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {

        this.colaborador = colaborador;
    }

    public Servico getServico() {

        return servico;
    }

    public void setServico(Servico servico) {

        this.servico = servico;
    }

    public void adicionarDocumento(Documento documento) {

        documentos[quantidadeDocumentos] = documento;
        quantidadeDocumentos++;
    }

    public Documento[] getDocumentos() {

        return documentos;
    }

    public int getQuantidadeDocumentos() {

        return quantidadeDocumentos;
    }
}