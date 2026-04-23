import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/

public class portalDigital {
    public static void main(String[] args) {
        double temp;
        boolean cartaoMestre, digital;
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual a temperatura atual? ");
        temp = leia.nextDouble();

        System.out.println("Possui a digital valida?");
        digital = leia.nextBoolean();

        System.out.println("Possui o cartao mestre?");
        cartaoMestre = leia.nextBoolean();

        if(temp < 37.5 && digital == true || cartaoMestre == true){
            System.out.println("Acesso liberado!");
        }
        else{
            System.out.println("Acesso negado!");
        }
    }
}