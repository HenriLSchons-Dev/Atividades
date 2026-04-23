import java.util.Scanner;
/**
 *
 * @author Henri Lopes Schons
 */
public class notaValida {

    public static void main(String[] args) {
        int nota = 0;
        Scanner leia = new Scanner(System.in);
        
        while(nota >= 0 && nota <= 10){
            System.out.println("Digite sua nota: ");
            nota = leia.nextInt();

            if(nota > 10 || nota < 0){
                System.out.println("Digite uma nota valida!");
            }
        }
        System.out.println("Nota valida!");
    }
}
