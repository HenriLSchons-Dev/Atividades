import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class contarPositivos {
    public static void main(String[] args) {
        int[] num = new int[5];
        int i, contaPositivos = 0;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite 5 numeros: ");
        for(i = 0; i < num.length; i++){
            num[i] = leia.nextInt();
        }
        
        for(i = 0; i < num.length; i++){
            if(num[i] <= 0){
                contaPositivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + contaPositivos);
    }
}
