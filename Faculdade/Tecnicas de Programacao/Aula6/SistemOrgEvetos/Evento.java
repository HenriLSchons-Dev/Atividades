public class Evento{
    private String nome;
    private String data;
    private int qntParticipantes;
    private double valor;

    public Evento(String nome, String data, int qntParticipantes, double valor){
        this.nome = nome;
        this.data = data;
        this.qntParticipantes = qntParticipantes;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQntParticipantes() {
        return qntParticipantes;
    }

    public void setQntParticipantes(int qntParticipantes) {
        this.qntParticipantes = qntParticipantes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibirDados(){
        System.out.println(".()");
        System.out.println(".()");
        System.out.println(".()");
        System.out.println(".()");
        System.out.println(".()");
    }

    public void verificarCapacidade(){
        if(qntParticipantes <= 0){
            System.out.println("");
        }
    }
    
}