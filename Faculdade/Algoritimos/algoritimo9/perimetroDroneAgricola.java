/**
 * 
 * @author Henri Lopes Schons
 */
public class perimetroDroneAgricola{
    public static void main(String[] args) {
        int[][] drone = {
            {7, 19, 3, 25, 11},
            {14, 0, 22, 8, 5},
            {17, 9, 1, 24, 13},
            {6, 20, 15, 2, 18},
            {10, 4, 23, 12, 16}
        };
        int i, j, soma = 0;

        for(i = 0; i < drone.length; i++){

            for(j = 0; j < drone[i].length; j++){
                if(i == 0 || j == 0 || j == 4 ||i == 4){
                    soma += drone[i][j];
                }
            }
        }
        System.out.println("A soma das laterais: " + soma);
    }
}