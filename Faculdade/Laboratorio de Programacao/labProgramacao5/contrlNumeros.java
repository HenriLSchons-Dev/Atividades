import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class contrlNumeros {

    public static void main(String[] args) {
        int num, soma = 0, quantidade = 0;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            
            if(num > 0){
                soma = soma + num;
                quantidade++;
            }
            else{
                System.out.println("Numero invalido!");
            }
        }while(num != -999);
        System.out.println("A soma dos numeros validos: " + soma);
        System.out.println("A quantidade de numeros: " + quantidade);
    }
}