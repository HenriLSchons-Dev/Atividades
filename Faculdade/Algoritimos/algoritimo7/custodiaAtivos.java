import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/

public class custodiaAtivos {
    public static void main(String[] args) {
        double investido, valorFinal, taxa;
        Scanner leia = new Scanner(System.in);

        System.out.println("Quanto deseja investir?");
        investido = leia.nextDouble();

        taxa = investido * 0.005;
        valorFinal = taxa + investido;

        System.out.println("O valor final da transacao e de: R$" + valorFinal);
        System.out.println("A taxa paga para essa transacao e: R$" + taxa);
    }
}