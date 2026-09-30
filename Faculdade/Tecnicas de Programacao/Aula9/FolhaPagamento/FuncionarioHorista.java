public class FuncionarioHorista extends Funcionario{
    private int horasTrabalhadas;
    private double valorHoras;

    public FuncionarioHorista(String nome, int horasTrabalhadas, double valorHoras){
        super(nome);
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHoras(valorHoras);
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }

    @Override
    public double calcularSalario(){
        double calculo = getHorasTrabalhadas() * getValorHoras();
        return calculo;
    }
}