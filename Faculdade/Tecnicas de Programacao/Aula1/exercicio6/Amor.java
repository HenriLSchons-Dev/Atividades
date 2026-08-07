public class Amor{
    boolean existe;
    int intencidade;
    int confianca;
    boolean correspondido;

    void amar(){
        if(this.existe){
            System.out.println("Amando...");
        } else{
            System.out.println("Erro: Sem amor");
        }
    }

    void demonstrar(){
        if(this.correspondido){
            System.out.println("Amor correspondido");
        } else{
            System.out.println("Amor nao correspondido");
        }
    }

    void fortalecer(){
        this.intencidade += 10;
        System.out.println("Amor fortalecido");
    }

    void status(){
        System.out.println("Existe amor: " + this.existe);
        System.err.println("Intencidade: " + this.intencidade);
        System.err.println("Confianca: " + this.confianca);
        System.err.println("Correspondido: " + this.correspondido);
    }
}