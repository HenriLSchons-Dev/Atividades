/**
 * 
 * @author Henri Lopes Schons
 */
public class notasUnidade{
    public static void main(String[] agrs){
        double[][] notas = {
            {9.8, 10, 7.5},
            {4.5, 5.9, 7},
            {7.5, 8.2, 7.9}
        };
        double media, soma;
        int i, j;

        for(i = 0; i < notas.length; i++){
            soma = 0;
            for(j = 0; j < notas[i].length; j++){

                soma += notas[i][j];
            }

            media = soma / 3;
            System.out.println("O aluno " + i + " tem media: " + media);
        }
    }
}