public class Conhecimento{
    boolean aprendido;
    int nivel;
    String area;
    boolean compartilhado;
    
    void aprender(){
        this.aprendido = true;
    }

    void aprimorar(){
        this.nivel += 10;
        System.out.println("Nivel de conhecimento aprimorado");
        if(this.nivel >= 60){
            this.compartilhado = true;
        }
    }

    void ensinar(){
        if(this.compartilhado){
            System.out.println("Conhecimento compartilhado");
        } else{
            System.out.println("Erro: conhecimento nao compartilhado");
        }
    }

    void status(){
        System.out.println("Aprendido: " + this.aprendido);
        System.err.println("Nivel: " + this.nivel);
        System.err.println("Area: " + this.area);
        System.err.println("Compartilhado: " + this.compartilhado);
    }
}