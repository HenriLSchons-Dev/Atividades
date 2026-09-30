public class CPF extends Documento {
    public CPF(String numero) {
        super(numero);
    }

    @Override
    public boolean validar() {
        return numero.length() == 11 && numero.matches("\\d+");
    }
}