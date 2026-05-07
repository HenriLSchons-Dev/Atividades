/**
 * 
 * @author Henri Lopes Schons
 */
public class relatorioDesempenho{
    public static void main(String[] args) {
        double[][] resultado = {
            {7.5, 8.2, 6.9, 9.1},
            {5.8, 7.0, 8.6, 6.7},
            {9.3, 8.8, 7.9, 9.5}
        };
        int i, j;
        double melhor;

        for(i = 0; i < resultado.length; i++){
            melhor = 0;

            for(j = 0; j < resultado[i].length; j++){

                if(melhor < resultado[i][j]){
                    melhor = resultado[i][j];
                }

            }
            
            System.out.println("O melhor resultado da equipe " + (i + 1) + " foi: " + melhor);
        }
    }
}