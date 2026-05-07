

/**
 * 
 * @author Henri Lopes Schons
 */
public class cheksumCriptografia{
    public static void main(String[] args) {
        int[][] tokens = {
            {12, 3, 7, 15},
            {0, 9, 14, 5},
            {6, 11, 2, 13},
            {8, 1, 10, 4}
        };
        int[] diagonal = new int[4];
        int i, j;

        for(i = 0; i < tokens.length; i++){

            for(j = 0; j < tokens[i].length; j++){
                if(i == 0 && j == 3){
                    diagonal[0] = tokens[i][j];
                }
                else if(i == 1 && j == 2){
                    diagonal[1] = tokens[i][j];
                }
                else if(i == 2 && j == 1){
                    diagonal[2] = tokens[i][j];
                }
                else if(i == 3 && j == 0){
                    diagonal[3] = tokens[i][j];
                }
            }
        }

        System.out.println("O vetor gerado foi: ");
        for(i = 0; i < diagonal.length; i++){
            System.out.print(diagonal[i] + "; ");
        }
    }
}