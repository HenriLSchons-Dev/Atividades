import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/

public class testeCarga {
    public static void main(String[] args) {
        double[] requisicoes = new double[100];
        int i, falha = 0;
        Scanner leia = new Scanner(System.in);

        for(i = 0; i < requisicoes.length - 1; i++){
            System.out.println("Qual o valor da requisicao? ");
            requisicoes[i] = leia.nextDouble();
            if(requisicoes[i] >= 95){
                falha++;
            }
        }
        System.out.println("Tivemos um total de " + falha + " falahas.");
    }
}