public class Aluno extends Pessoa{
    protected String matricula;
    protected String curso;
    protected int inteligencia;

    public Aluno(){

    }

    public Aluno(String nome, String cpf, int idade, String matricula, String curso, int inteligencia){
        super(nome, cpf, idade);
        setMatricula(matricula);
        setCurso(curso);
        setInteligencia(inteligencia);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void estudar(){
        this.inteligencia += 20;
        System.out.println("Estudo realizado!");
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

}