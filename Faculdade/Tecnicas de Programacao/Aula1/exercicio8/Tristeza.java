public class Tristeza{
    boolean existe;
    int intencidade;
    int duracao ;
    boolean compartilhado;
    boolean refletido;

    void entristecer(){
        this.existe = true;
        this.intencidade += 10;
    }
    
    void sentir(){
        if(this.existe){
            System.out.println("Tristeza sentida...");
        } else{
            System.out.println("Sem tristeza");
        }
    }

    void refletir(){
        if(this.existe){
            System.out.println("Refletindo do porque estou triste...");
        }
        this.refletido = true;
    }

    void diminuir(){
        if(this.existe && this.refletido){
            this.intencidade -= 10;
            System.out.println("Tristeza diminuida");
        } else{
            System.out.println("Sem tristesa para diminuir");
        }
    }

    void status(){
        System.out.println("Existe: " + this.existe);
        System.err.println("Intencidade: " + this.intencidade);
        System.err.println("Duracao: " + this.duracao);
        System.err.println("Compartilhado: " + this.compartilhado);
    }
}