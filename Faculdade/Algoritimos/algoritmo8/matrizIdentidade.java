/**
 * 
 * @author Henri Lopes Schons
 */
public class matrizIdentidade{
    public static void main(String[] args) {
        int[][] identidade = new int[4][4];
        int i, j;

        for(i = 0; i < identidade.length; i++){
            
            for(j = 0; j < identidade[i].length; j++){

                if(i == j){
                    identidade[i][j] = 1;
                }
                else{
                    identidade[i][j] = 0;
                }
            }
        }
        
        for(i = 0; i < identidade.length; i++){

            for(j = 0; j < identidade[i].length; j++){
                System.out.print(identidade[i][j] + " ");
            }
            System.out.println();
        }
    }
}