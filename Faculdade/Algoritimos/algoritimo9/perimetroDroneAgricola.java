/**
 * 
 * @author Henri Lopes Schons
 */
public class perimetroDroneAgricola{
    public static void main(String[] args) {
        int[][] drone = {
            {316, 374, 344},
            {750, 499, 723},
            {290, 484, 810},
            {239, 411, 860},
            {204, 126, 600}
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

        if(soma > 122){
            System.out.println("ALERTA DE EXCESSO!");
        }
    }
}