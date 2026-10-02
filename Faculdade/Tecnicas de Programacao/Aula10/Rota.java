import java.util.ArrayList;
import java.util.List;

public class Rota{
    private int codigoLinha;
    private String nomeLinha;
    private List<Terminal> terminais = new ArrayList<>();

    public Rota(int codigoLinha, String nomeLinha){
        setCodigoLinha(codigoLinha);
        setNomeLinha(nomeLinha);
    }
    
    public void adicionarTerminais(Terminal terminal){
        terminais.add(terminal);
    }

    public void removerTerminal(Terminal terminal){
        for(int i = 0; i < terminais.size(); i++){
            if(terminais.get(i).getNome().equals(terminal.getNome())){
                terminais.remove(i);
                System.out.printf("Terminal %s foi removido", terminais.get(i).getNome());
            }
        }
    }

    public void imprimirRota(){
        System.out.println("=============== Itinerario da linha ==============");
        for(Terminal terminal : terminais){
            System.out.println(terminal);
            System.out.println("================================================");
        }
    }

    public int getCodigoLinha() {
        return codigoLinha;
    }

    public void setCodigoLinha(int codigoLinha) {
        if(codigoLinha > 0){
            this.codigoLinha = codigoLinha;
        } else {
            System.out.println("ERRO: Codigo da linha invalido!");
        }
    }

    public String getNomeLinha() {
        return nomeLinha;
    }

    public void setNomeLinha(String nomeLinha) {
        if(nomeLinha == null || nomeLinha.trim().isEmpty()){
            System.out.println("ERRO: Nome da linha invalido!");
        } else {
            this.nomeLinha = nomeLinha;
        }
    }


}