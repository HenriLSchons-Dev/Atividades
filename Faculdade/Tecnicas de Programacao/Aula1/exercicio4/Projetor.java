public class Projetor{
    String modelo;
    String cor;
    boolean ligado;
    boolean som;

    void ligar(){
        this.ligado = true;
    }

    void desligar(){
        this.ligado = false;
    }

    void projetar(){
        if(this.ligado){
            System.out.println("Projetando...");
        } else{
            System.out.println("Projetor desligado!");
        }
    }

    void emitir(){
        if(this.som){
            System.out.println("Emitindo som...");
        } else{
            System.out.println("Erro: problema no som");
        }
    }

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.err.println("Cor: " + this.cor);
        System.err.println("Ligado: " + this.ligado);
        System.err.println("Som funcionando: " + this.som);
    }
}