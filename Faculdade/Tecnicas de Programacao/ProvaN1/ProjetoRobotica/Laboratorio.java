import java.util.ArrayList;
import java.util.List;
public class Laboratorio{
    private String nome;
    private List<Robo> robos;

    public Laboratorio(){

    }

    public Laboratorio(String nome){
        setNome(nome);
        this.robos = new ArrayList<>();
    }

    public void adicionarRobo(Robo robo){
        robos.add(robo);
    }


    public void listarRobos(){
        System.out.println("========== ROBOS CADASTRADOS ==========");
        for(Robo robo : robos){
            System.out.println("Codigo: " + robo.getCodigo());
            System.out.println("Nome: " + robo.getNome());
            System.out.println("Tipo: " + robo.getTipo());
            System.out.println("Bateria: " + robo.getBateria());
            System.out.println("Status: " + robo.isAtivo());
            System.out.println("");
        }
        System.out.println("========================================");
    }

    public Robo buscarRobo(int codigo){
        for(Robo robo : robos){
            if(codigo == robo.getCodigo()){
                System.out.println("========= Robo Encontrado ========");
                System.out.println("Codigo: " + robo.getCodigo());
                System.out.println("Nome: " + robo.getNome());
                System.out.println("Tipo: " + robo.getTipo());
                System.out.println("Bateria: " + robo.getBateria());
                System.out.println("Status: " + robo.isAtivo());
                System.out.println("==================================");

                return robo;
            }
        }
        return null;
    }

    public int contarRobosAtivos(){
        int ativos = 0;
        for(Robo robo : robos){
            if(robo.isAtivo()){
                ativos++;
            }
        }
        System.out.println("Quantidade de robos ativos: " + ativos);
        return ativos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Robo> getRobos() {
        return robos;
    }

    public void setRobos(List<Robo> robos) {
        this.robos = robos;
    }
}