public class Funcionario{
    private String nome;
    private String cpf;
    private boolean contratado;

    public Funcionario(String nome, String cpf, boolean contrato){
        this.nome = nome;
        this.cpf = cpf;
        this.contratado = contrato;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setContratado(boolean contrato){
        this.contratado = contrato;
    }

    public Boolean isContratado(){
        return this.contratado;
    }

    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF do funcionario: " + this.cpf);
        System.out.println("Contratado: " + this.contratado);
    }
}