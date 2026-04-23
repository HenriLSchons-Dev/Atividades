import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/

public class dosagemInsumos {
    public static void main(String[] args) {
        double litros, volume, insumo = 0.250, calc;
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o volume de agua do tanque? ");
        volume = leia.nextDouble();

        litros = volume / 10;
        calc = litros * insumo;

        System.out.println("A quantidade necessaria de insumos e: L" + calc);
    }
}