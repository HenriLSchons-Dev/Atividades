public class Gerente extends Funcionario{
    protected String departamento;
    protected double bonificacao;

    public Gerente(){

    }

    public Gerente(String nome, double salario, String departamento, double bonificacao){
        super(nome, salario);
        setDepartamento(departamento);
        setBonificacao(bonificacao);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public void calcularSalarioTotal(){
        double calculo = getSalario() + this.bonificacao;
        System.out.printf("O salario total de %s:      R$%.2f%n", getNome(), calculo);
    }

}