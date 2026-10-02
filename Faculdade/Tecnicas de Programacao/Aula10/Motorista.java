public class Motorista extends Pessoa{
    private String numeroCnh;
    private String categoriaCnh;
    private String validadeCnh;

    public Motorista(int id, String nome, String cpf, String telefone, String numeroCnh, String categoriaCnh, String validadeCnh){
        super(id, nome, cpf, telefone);
        setNumeroCnh(numeroCnh);
        setCategoriaCnh(categoriaCnh);
        setValidadeCnh(validadeCnh);
    }

    public String getNumeroCnh() {
        return numeroCnh;
    }

    public void setNumeroCnh(String numeroCnh) {
        if(numeroCnh == null || numeroCnh.trim().isEmpty()){
            System.out.println("CNH invalida!");
        } else {
            this.numeroCnh = numeroCnh;
        }
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    public void setCategoriaCnh(String categoriaCnh) {
        if(categoriaCnh == null || categoriaCnh.trim().isEmpty()){
            System.out.println("Categoria da CNH invalida!");
        } else {
            this.categoriaCnh = categoriaCnh;
        }
    }

    public String getValidadeCnh() {
        return validadeCnh;
    }

    public void setValidadeCnh(String validadeCnh) {
        if(validadeCnh == null || validadeCnh.trim().isEmpty()){
            System.out.println("Validade da CNH invalida");
        } else {
            this.validadeCnh = validadeCnh;
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Numero CNH: " + getNumeroCnh());
        System.out.println("Categoria CNH: " + getCategoriaCnh());
        System.out.println("Validade CNH: " + getValidadeCnh());
    }

}