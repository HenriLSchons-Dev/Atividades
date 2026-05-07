import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class logisticaArmazem{
    public static void main(String[] args){
        int[][] estoque = new int[3][5];
        int i, j, soma;
        Scanner leia = new Scanner(System.in);

        System.out.println("Preencha a matriz com quanto sitens tem cada prateleira da fileira: ");
        for(i = 0; i < estoque.length; i++){
            soma = 0;

            for(j = 0; j < estoque[i].length; j++){

                estoque[i][j] = leia.nextInt();

                if(i == 1){
                    soma += estoque[i][j];
                }
                else if(i == 2){
                    soma += estoque[i][j];
                }
                else{
                    soma += estoque[i][j];
                }

            }
            System.out.println("A soma do corredor " + (i + 1) + " e igual a: " + soma);
        }

    }
}