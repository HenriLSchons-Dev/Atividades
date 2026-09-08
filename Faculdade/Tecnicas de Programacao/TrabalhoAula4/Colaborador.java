public class Colaborador {
    
    private int matricula;
    private String nomeColaborador;
    private String cargo;

    public Colaborador(int matricula, String nomeColaborador, String cargo) {
        this.matricula = matricula;
        this.nomeColaborador = nomeColaborador;
        this.cargo = cargo;
    }

    public int getMatricula() {

        return matricula;
    }

    public void setMatricula(int matricula) {

        this.matricula = matricula;
    }

    public String getNomeColaborador() {

        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        
        this.nomeColaborador = nomeColaborador;
    }

    public String getCargo() {

        return cargo;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }
}
