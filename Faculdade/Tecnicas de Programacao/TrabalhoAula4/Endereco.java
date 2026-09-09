public class Endereco {
    
    private String cep;
    private boolean validar;


    public Endereco(String cep, boolean validar) {
        this.cep = cep;
        this.validar = validar;
    }

    public String getCep() {

        return cep;
    }

    public void setCep(String cep) {

        this.cep = cep;
    }

    public boolean getValidar() {

        return validar;
    }

    public void setValidar(boolean validar) {

        this.validar = validar;
    }

}