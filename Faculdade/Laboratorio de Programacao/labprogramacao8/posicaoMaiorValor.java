import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class posicaoMaiorValor{
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int i, j, maior = 0, maiorI = 0, maiorJ = 0;
        Scanner leia = new Scanner(System.in);

       System.out.println("Digite valores inteiros para compor a matriz: ");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
                
                if(maior < matriz[i][j]){
                    maior = matriz[i][j];
                    maiorI = i;
                    maiorJ = j;
                }
            }
        }

        System.out.println("O maior numero presente na matriz é: " + maior);
        System.out.println("A sua posicao e (" + maiorI + "; " + maiorJ + ")");
    }
}