import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/

public class bonusRetencao {
    public static void main(String[] args) {
        double salario, bonus;
        int tempo;
        Scanner leia = new Scanner(System.in);

        System.out.println("Quanto tempo trabalhado? (em anos COMPLETOS)");
        tempo = leia.nextInt();

        System.out.println("Qual o salario do funcionario?");
        salario = leia.nextDouble();

        if(tempo > 5){
            bonus = salario * 1.20;
            System.out.println("Salario com bonus de 20%: R$" + bonus);
        }
        else if(tempo >= 2){
            bonus = salario * 1.10;
            System.out.println("Salario com bonus de 10%: R$" + bonus);
        }
        else{
            System.out.println("Salario sem nenhum bonus: R$" + salario);
        }
    }
}