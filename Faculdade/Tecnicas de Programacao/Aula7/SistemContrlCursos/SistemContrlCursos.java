public class SistemContrlCursos{
    public static void main(String[] args){
        Curso curso1 = new Curso();
        Curso curso2 = new Curso(676767, "Eng. de Software", 180, 375.99);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Henri", 6742, 18, "emailgenerico@gmail.com");

        aluno1.exibirDados();
        aluno1.verificarMaioridade();
        System.out.println("");
        aluno2.exibirDados();
        aluno2.verificarMaioridade();
        System.out.println("");
        curso1.exibirDados();
        curso1.validarCurso();
        curso1.calcularValorPorHora();
        System.out.println("");
        curso2.exibirDados();
        curso2.validarCurso();
        curso2.calcularValorPorHora();
    }
}