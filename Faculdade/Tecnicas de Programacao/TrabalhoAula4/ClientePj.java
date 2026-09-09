public class ClientePj extends Cliente{
    ClientePj(String nome, String email, String telefone, String cadastro, boolean ativo) {

        super(nome, email, telefone, cadastro, ativo);
    }

    private String cnpj; 
    private String razaoSocial;
    private String nomeFantasia;
    private String cnae;
    private String porte;
    private double faturamntoAnual;

    public String getCnpj() {

        return cnpj;
    }

    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {

        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {

        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {

        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {

        this.nomeFantasia = nomeFantasia;
    }

    public String getCnae() {

        return cnae;
    }

    public void setCnae(String cnae) {

        this.cnae = cnae;
    }

    public String getPorte() {

        return porte;
    }

    public void setPorte(String porte) {

        this.porte = porte;
    }

    public double getFaturamntoAnual() {
        
        return faturamntoAnual;
    }

    public void setFaturamntoAnual(double faturamntoAnual) {

        this.faturamntoAnual = faturamntoAnual;
    }

}