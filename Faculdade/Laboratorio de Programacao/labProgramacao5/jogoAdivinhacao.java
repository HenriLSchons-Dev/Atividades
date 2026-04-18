import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class jogoAdivinhacao {

    public static void main(String[] args) {
        int numeroCerto = 7, adivinhacao;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Adivinhe o numero pre determinado");
            adivinhacao = leia.nextInt();
            
            if(adivinhacao != 7){
                System.out.println("Tente de novo! Numero errado");
            }
        }while(adivinhacao != numeroCerto);
        System.out.println("Numero correto, parabens!");
    }
}