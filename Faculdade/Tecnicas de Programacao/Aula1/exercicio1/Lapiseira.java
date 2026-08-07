public class Lapiseira{
    String modelo;
    String cor;
    int carga;
    boolean grafite;

    void escrever(){
        if(this.grafite == false){
            System.out.println("Erro: Lapiseira sem grafite");
        } else{
            System.out.println("Escrevre...");
        }
    }

    void projetar(){
        this.grafite = true;
    }
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Grafite: " + this.grafite);
    }
}
