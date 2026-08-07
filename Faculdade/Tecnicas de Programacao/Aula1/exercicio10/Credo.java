public class Credo{
    boolean existe;
    int intencidade;
    boolean evidencias;
    boolean compartilhado;

    void pensar(){
        System.out.println("A fé pode cegar, mas oferece conforto");
    }
    
    void rezar(){
        if(this.existe){
            intencidade += 10;
        }
    }

    void pregar(){
        if(this.compartilhado && intencidade >= 55 && this.evidencias){
            System.out.println("Fé compartilhada");
        } else{
            System.out.println("Fé nao compartilhada");
        }
    }

    void status(){
        System.out.println("Existe: " + this.existe);
        System.out.println("Intencidade: " + this.intencidade);
        System.out.println("Evidencias:" + this.evidencias);
        System.out.println("Compartilhado: " + this.compartilhado);
    }
}