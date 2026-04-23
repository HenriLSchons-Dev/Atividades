import java.util.Scanner;
/**
 *
 * @author Henri Lopes Schons
 */
public class contarNumeros {

    public static void main(String[] args) {
        int num=1, digitados = 0;
        Scanner leia = new Scanner(System.in);
        
        while(num != 0){
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            digitados++;
        }
        System.out.println("Foram digitados " + digitados + " numeros");
    }
}