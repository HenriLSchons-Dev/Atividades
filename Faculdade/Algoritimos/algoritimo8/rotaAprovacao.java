/**
 * 
 * @author Henri Lopes Schons
 */
public class rotaAprovacao{
    public static void main(String[] agrs){
        double[][] notas = {
            {8.5, 7, 9},
            {9, 7.8, 8},
            {10, 8, 9.6}
        };
        int i, j;
        double soma = 0;

        for(i = 0; i < notas.length; i++){

            for(j = 0; j < notas[i].length; j++){
                
                if(i == j){
                    soma += notas[i][j];
                }
            }
        }

        System.out.println("A trilha de aprovacao e: " + soma);
    }
}