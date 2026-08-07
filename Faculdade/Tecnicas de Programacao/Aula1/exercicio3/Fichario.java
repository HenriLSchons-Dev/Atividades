public class Fichario{
    String modelo;
    String cor;
    boolean folhas;
    boolean aberto;

    void abrir(){
        this.aberto = true;
    }

    void fechar(){
        this.aberto = false;
    }

    void escrever(){
        if(this.folhas && this.aberto){
            System.out.println("Escrevendo...");
        } else{
            System.out.println("Erro: fichario fechado ou sem folhas");
        }
    }

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.err.println("Cor: " + this.cor);
        System.err.println("Folhas: " + this.folhas);
        System.err.println("Aberto: " + this.aberto);
    }
}