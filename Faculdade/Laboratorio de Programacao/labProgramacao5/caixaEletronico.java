import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class caixaEletronico {

    public static void main(String[] args) {
        int num;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Oque deseja fazer no caixa?");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            num = leia.nextInt();
            
            if(num == 1){
                System.out.println("Deposito realizado");
            }
            else if(num == 2){
                System.out.println("Saque realizado");
            }
            else{
                System.out.println("Seu saldo é de: R$ XXXXX");
            }
        }while(num != 0);
    }
}