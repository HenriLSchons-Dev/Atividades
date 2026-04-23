import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/

public class clubeVantagem {
    public static void main(String[] args) {
        double compra, valorFinal;
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o valor da sua compra? ");
        compra = leia.nextDouble();

        if(compra >= 500){
            valorFinal = compra * 0.90;
        }
        else{
            valorFinal = compra * 0.95;
        }

        System.out.println("O valor final da compra e: R$" + valorFinal);
    }
}