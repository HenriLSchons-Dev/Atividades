public class FuncionarioCLT extends Funcionario{
    private double salarioFixo;

    public FuncionarioCLT(double salarioFixo, String nome){
        super(nome);
        setSalarioFixo(salarioFixo);
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario(){
        return getSalarioFixo();
    }
}