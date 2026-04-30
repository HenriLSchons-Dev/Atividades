/**
 * 
 * @author Henri Lopes Schons
 */
public class trocaLinhas{
    public static void main(String[] agrs){
        int[][] troca = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int i, j;
        int[]auxiliar = troca[0];
        troca[0] = troca[1];
        troca[1] = auxiliar;

        for(i = 0; i < troca.length; i++){
            
            for(j = 0; j < troca[i].length; j++){
                System.out.print(troca[i][j] + " ");
            }
            System.out.println();
        }
    }
}