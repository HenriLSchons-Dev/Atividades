public class Profissional{
    private String nome;
    private String registro;
    private String especialidade;
    
    public Profissional(){

    }

    public Profissional(String nome, String registro, String especialidade){
        setNome(nome);
        setRegistro(registro);
        setEspecialidade(especialidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null|| nome.trim().isEmpty() ){
            System.out.println("Nome invalido!");
        } else {
            this.nome = nome;
        }
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        if(registro == null || registro.trim().isEmpty()){
            System.out.println("Registro invalido!");
        } else {
            this.registro = registro;
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if(especialidade == null|| especialidade.trim().isEmpty()){
            System.out.println("Especialidade invalida!");
        } else {
            this.especialidade = especialidade.toLowerCase().trim();
        }
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Registro: " + this.registro);
        System.out.println("Especialidade: " + this.especialidade);
    }

    public void exibirDados(boolean exibirRegistro){
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        if(exibirRegistro){
            System.out.println("Registro: " + this.registro);
        }
    }
}