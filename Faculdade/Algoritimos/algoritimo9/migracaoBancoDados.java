/**
 * 
 * @author Henri Lopes Schons
 */
public class migracaoBancoDados{
    public static void main(String[] args){
        int[][] registros = {
            {4, 2, 3, 1},
            {4, 2, 3, 1},
            {4, 2, 3, 1},
            {4, 2, 3, 1}
        };
        int i, j, troca;

        System.out.println("Matriz atual: ");
        for(i = 0; i < registros.length; i++){

            for(j = 0; j < registros[i].length; j++){
                System.out.print(registros[i][j] + "; ");
            }
            System.out.println();
        }
        System.out.println();

        for(i = 0; i < registros.length; i++){
            troca = registros[i][0];
            registros[i][0] = registros[i][3];
            registros[i][3] = troca;
        }

        System.out.println("Os dados na ordem correta sao: ");
        for(i = 0; i < registros.length; i++){

            for(j = 0; j < registros[i].length; j++){
                System.out.print(registros[i][j] + "; ");
            }
            System.out.println();
        }
    }
}