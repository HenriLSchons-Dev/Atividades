public class SistemAtendimentoClinica{
    public static void main(String[] args) {

        Paciente paciente = new Paciente("Henri", "29736073882", 18, "62994578665");

        Profissional profissional = new Profissional("House", "010167", "    Infectologista     ");

        Atendimento atendimento1 = new Atendimento("09/11", "18h", "Observacao generica", paciente, profissional);

        Atendimento atendimento2 = new Atendimento("09/11", "19h", "Observacao generica", paciente, profissional);
        
        paciente.exibirDados();
        System.out.println("");

        profissional.exibirDados();
        System.out.println("");

        atendimento1.verificarEspecialidade("Infectologista");
        atendimento1.exibirResumo();
        atendimento1.getNomePaciente();
        System.out.println("");

        atendimento2.verificarEspecialidade("Infectologista");
        atendimento2.exibirResumo();
        atendimento2.getNomePaciente();
    }
}