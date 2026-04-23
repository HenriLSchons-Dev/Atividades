import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/

public class freteCargaViva {
    public static void main(String[] args) {
        double distancia, orcamento;
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual a distancia ate o ponto de entrega? ");
        distancia = leia.nextDouble();

        orcamento = 1200 + (5 * distancia);

        System.out.println("O orcamento para realizar essa entrega: R$" + orcamento);
    }
}