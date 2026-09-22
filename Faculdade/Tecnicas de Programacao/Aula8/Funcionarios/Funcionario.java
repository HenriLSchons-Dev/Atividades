public class Funcionario{
    protected String nome;
    protected double salario;

    public Funcionario(){

    }

    public Funcionario(String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirSalario(){
        System.out.printf("O salario do funcionario %s:      R$ %.2f.%nw", getNome(),getSalario());
    }
}