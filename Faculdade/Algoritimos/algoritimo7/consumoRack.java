import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/

public class consumoRack {
    public static void main(String[] args) {
        int racks;
        double custo, consumoH = 2.4, kWh;
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o custo de kilowats/hora? ");
        kWh = leia.nextDouble();

        System.out.println("Quantos racks, tem o servidor? ");
        racks = leia.nextInt();

        custo = (consumoH * 24) * kWh * racks;

        System.out.println("O custo diario para mantes esse servidor e de: R$" + custo);
    }
}