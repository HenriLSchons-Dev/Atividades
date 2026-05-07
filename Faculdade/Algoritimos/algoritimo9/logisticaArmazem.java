/**
 * 
 * @author Henri Lopes Schons
 */
public class logisticaArmazem{
    public static void main(String[] args){
        int[][] estoque = {
            {15, 46, 58},
            {18, 60, 28},
            {6, 2, 42}
        };
        int i, j, soma;

        for(i = 0; i < estoque.length; i++) {
            soma = 0;

            for(j = 0; j < estoque[i].length; j++) {
                soma += estoque[i][j];
            }

            System.out.println("Corredor " + (i + 1) + ": " + soma + " itens");

            if(soma > 90){
                System.out.println("ALERTA DE SOBRECARGA!");
            }
        }
    }
}