import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/
public class maxValor {
    public static void main(String[] args) {
        double[] valor = new double[5];
        double maxValor = 0;
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 5 valores quaisquer: ");
        for(i = 0; i < valor.length; i++){
            valor[i] = leia.nextDouble();
        }
        for(i = 0; i < valor.length; i++){
            if(valor[i] > maxValor){
                maxValor = valor[i];
            }
        }

        System.out.println("O maior valor é: " + maxValor);
    }
}