import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class indicaImparPar{
    public static void main(String[] agrs){
        int[][] matriz = new int[4][3];
        int i, j, impar = 0, par = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite numeros inteiros para preencher a matriz");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
            }
        }

        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0){
                    par++;
                }
                else{
                    impar++;
                }
            }
        }

        System.out.println("Foram digitados " + par + " numeros pares");
        System.out.println("Alem de " + impar + "numeros impares");
    }
}