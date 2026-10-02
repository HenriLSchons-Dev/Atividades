public class Cobrador extends Pessoa{
    private String matricula;
    private String turno;

    public Cobrador(int id, String nome, String cpf, String telefone, String matricula, String turno){
        super(id, nome, cpf, telefone);
        setMatricula(matricula);
        setTurno(turno);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if(matricula == null || matricula.trim().isEmpty()){
            System.out.println("Matricula invalida!");
        } else {
            this.matricula = matricula;
        }
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if(turno == null || turno.trim().isEmpty()){
            System.out.println("Turno invalido!");
        } else {
            this.turno = turno;
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Turno: " + getTurno());
    }

}