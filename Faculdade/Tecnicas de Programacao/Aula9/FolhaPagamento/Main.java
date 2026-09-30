public class Main{
    public static void main(String[] args) {
        FuncionarioCLT funcionarioclt = new FuncionarioCLT(1708.41, "Henri");
        FuncionarioHorista funcionariohorista = new FuncionarioHorista("Henri", 6, 80.00);

        System.out.printf("Salario do funcionario CLT é de:  RS%.2f.%n",funcionarioclt.calcularSalario());
        System.out.println();
        System.out.printf("Salario do funcionario horista é de: RS%.2f.%n", funcionariohorista.calcularSalario());
    }
}