public class Alegria{
    boolean existe;
    int intencidade;
    int duracao ;
    boolean compartilhado;

    void alegrar(){
        this.existe = true;
        this.intencidade += 10;
    }
    
    void sentir(){
        if(this.existe){
            System.out.println("Alegria sentida!!");
            this.compartilhado = true;
        } else{
            System.out.println("Sem alegria...");
        }
    }

    void sorrir(){
        if(this.compartilhado){
            System.out.println("Alegria compartilhada");
        } else{
            System.out.println("Alegria nao compartilada");
        }
    }

    void status(){
        System.out.println("Existe: " + this.existe);
        System.err.println("Intencidade: " + this.intencidade);
        System.err.println("Duracao: " + this.duracao);
        System.err.println("Compartilhado: " + this.compartilhado);
    }
}