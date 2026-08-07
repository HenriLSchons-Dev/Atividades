public class Mochila{
    String modelo;
    String cor;
    int itens;
    boolean cheia;
    boolean aberto;

    void abrir(){
        this.aberto = true;
    }

    void fechar(){
        this.aberto = false;
    }

    void guardar(){
        if(this.cheia){
            System.out.println("Erro: Mochila cheia, retire um iten antes");
        } else{
            System.out.println("Guardando iten...");
            this.cheia = true;
        }
    }

    void retirar(){
        if(this.itens <= 0){
            System.out.println("Erro: Sem itens para retirar");
        } else{
            this.itens = this.itens - 1;
            this.cheia = false;
            System.out.println("Tirando iten");
        }
    }

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.err.println("Cor: " + this.cor);
        System.err.println("Itens: " + this.itens);
        System.err.println("Cheia: " + this.cheia);
    }
}