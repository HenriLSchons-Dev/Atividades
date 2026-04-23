import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/

public class gerenciamentoStamina {
    public static void main(String[] args) {
        double custoAcao, stamina = 100;
        Scanner leia = new Scanner(System.in);

        System.out.println("Voce possui 100 de stamina atual!");
        while(stamina > 0){
            System.out.println("Qual o custo da acao que deseja fazer? ");
            custoAcao = leia.nextDouble();
            stamina -= custoAcao;
            System.out.println("Stamina atual: " + stamina);
        }
        System.out.println("Sua stamina se esgotou!");
    }
}