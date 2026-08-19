public class Computador{
    private String cpu;
    private String gpu;
    private String sistema;
    private boolean manutencao;

    public Computador(){
        this.cpu = "pentium 4";
        this.gpu = "Geforce 4 MX 440";
        this.sistema = "windows XP";
        this.manutencao = false;
    }

    public void setCpu(String c){
        this.cpu = c;
    }

    public String getCpu(){
        return this.cpu;
    }

    public void setGpu(String g){
        this.gpu = g;
    }

    public String getGpu(){
        return this.gpu;
    }

    public void setSistema(String s){
        this.sistema = s;
    }

    public String getSistema(){
        return this.sistema;
    }

    public void setManutencao(boolean m){
        this.manutencao = m;
    }

    public boolean isManutencao(){
        return this.manutencao;
    }

    public void status(){
        System.out.println("Processador da maquina: " + this.cpu);
        System.out.println("Placa de video da maquina: " + this.gpu);
        System.out.println("Sistema Operacional da maquina: " + this.sistema);
        System.out.println("A maquina esta em manutencao? " + this.manutencao);
    }
}