public class Aluno{
    String nome;
    int idade;
    boolean acordado;
    int atencao;

    void acordar(){
        this.acordado = true;
    }

    void aprender(){
        if(this.acordado && this.atencao >= 60){
            System.out.println("Aprendendo...");
        } else{
            System.out.println("Aluno sem interesse ou dormindo");
        }
    }

    void dormir(){
        if(this.atencao <= 50){
            this.acordado = false;
        }
    }

    void status(){
        System.out.println("Nome: " + this.nome);
        System.err.println("Idade: " + this.idade);
        System.err.println("Acordado: " + this.acordado);
        System.err.println("Atencao: " + this.atencao);
    }
}