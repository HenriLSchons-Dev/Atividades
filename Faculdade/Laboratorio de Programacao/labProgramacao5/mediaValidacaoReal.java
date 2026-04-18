import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class mediaValidacaoReal {

    public static void main(String[] args) {
        int nota, media = 0, quantidade = 0;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Digite uma nota: ");
            nota = leia.nextInt();
            
            if(nota >= 0 && nota <= 10){
                quantidade++;
                media = (media + nota) / quantidade;
            }
            else{
                System.out.println("Favor digitar uma nota válida");
            }
        }while(nota != -1);
        System.out.println("Media das notas: " + media);
        System.out.println("Quantidade de notas: " + quantidade);
    }
}