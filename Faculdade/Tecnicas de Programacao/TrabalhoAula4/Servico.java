public class Servico {
    
    private int id;
    private String nomeServico;
    private String area;
    private String descricao;
    private double valorBase;
    private String periodicidade;

    public Servico(int id, String nomeServico, String area, String descricao, double valorBase, String periodicidade) {

        this.id = id;
        this.nomeServico = nomeServico;
        this.area = area;
        this.descricao = descricao;
        this.valorBase = valorBase;
        this.periodicidade = periodicidade;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNomeServico() {

        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {

        this.nomeServico = nomeServico;
    }

    public String getArea() {

        return area;
    }

    public void setArea(String area) {
        
        this.area = area;
    }
    public String getDescricao() {
        
        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public double getValorBase() {

        return valorBase;
    }

    public void setValorBase(double valorBase) {

        this.valorBase = valorBase;
    }

    public String getPeriodicidade() {

        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {

        this.periodicidade = periodicidade;
    }
}