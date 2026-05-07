import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class controleEstoque{
    public static void main(String[] agrs){
        int[][] produtos = new int[2][3];
        int i, j, zerado = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual a quantidade do produto que esta nesse posicao no estoque?");
        for(i = 0; i < produtos.length; i++){

            for(j = 0; j < produtos[i].length; j++){
                produtos[i][j] = leia.nextInt();

                if(produtos[i][j] == 0){
                    zerado++;
                }
                
            }
        }

        System.out.println("Temos um total de " + zerado + " produtos em falta");
    }
}