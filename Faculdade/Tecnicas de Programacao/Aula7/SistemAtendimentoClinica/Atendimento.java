public class Atendimento{
    private String data;
    private String horario;
    private String observacao;
    private Paciente paciente;
    private Profissional profissional;

    public Atendimento(){

    }

    public Atendimento(String data, String horario, String observacao, Paciente paciente, Profissional profissional){
        setData(data);
        setHorario(horario);
        setObservacao(observacao);
        setPaciente(paciente);
        setProfissional(profissional);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public String getNomePaciente(){
        return paciente.getNome();
    }

    public boolean verificarEspecialidade(String especialidadeDesejada){
        if(especialidadeDesejada.toLowerCase().equalsIgnoreCase(profissional.getEspecialidade().toLowerCase())){
            return true;
        } else {
            return false;
        }
    }

    public void exibirResumo(){
        System.out.println("--------------- RESUMO ----------------");
        System.out.println("Data: " + this.data);
        System.out.println("Horario: " + this.horario);
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("CPF: " + paciente.getCpf());
        System.out.println("Profissional: " + profissional.getNome());
        System.out.println("Especialidade: " + profissional.getEspecialidade());
        System.out.println("Observacao: " + this.observacao);
        System.out.println("---------------------------------------");
    }
}