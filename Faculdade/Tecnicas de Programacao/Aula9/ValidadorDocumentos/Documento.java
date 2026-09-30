public abstract class Documento {
    protected String numero;

    public Documento(String numero) {
        setNumero(numero);
    }

    public abstract boolean validar();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}