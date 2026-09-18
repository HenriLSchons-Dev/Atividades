public class Operador{
    private String codigo;
    private String nome;
    private String nivel;

    public Operador(){

    }

    public Operador(String codigo, String nome, String nivel){
        setCodigo(codigo);
        setNome(nome);
        setNivel(nivel);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void controlarRobo(Robo robo){
        System.out.println("========================================");
        System.out.println("Operador: " + getNome());
        System.out.println("Codigo do Operador: " + getCodigo());
        System.out.println("");
        System.out.println("Robo controlado:");
        System.out.println("Nome: " + robo.getNome());
        System.out.println("Tipo: " + robo.getTipo());
        System.out.println("Bateria: " + robo.getBateria());
        System.out.println("========================================");
    }
}