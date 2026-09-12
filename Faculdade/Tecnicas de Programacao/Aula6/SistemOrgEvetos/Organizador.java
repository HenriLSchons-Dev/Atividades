public class Organizador{
    private String nome;
    private String codigo;
    private String especialidade;

    public Organizador(String nome, String codigo, String especialidade){
        this.nome = nome;
        this.codigo = codigo;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void assumirEvento(Evento meuEvento, Espaco meuEspaco){
        System.out.println("Nome do organizador: " + this.nome);
        System.out.println("Codigo: " + this.codigo);
        System.out.printf("Nome do evento: %s %n", meuEvento.getNome());
        System.out.printf("Data: %s %n", meuEvento.getData());
        System.out.printf("Espaço onde sera realizado na %s, que fica localizada %s %n", meuEspaco.getNome(), meuEspaco.getEndereco());
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Especialidade: " + this.especialidade);
    }
}