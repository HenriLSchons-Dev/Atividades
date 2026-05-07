/**
 * 
 * @author Henri Lopes Schons
 */
public class mapaAtendimento{
    public static void main(String[] agrs){
        int[][] matriz = {
            {8, 12, 4},
            {6, 8, 9},
            {10, 6, 12}
        };
        int i, j, soma = 0, media;
        
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                soma += matriz[i][j];
            }
        }
        media = soma / 9;

        System.out.println("A soma total da matriz: " + soma);
        System.out.println("A media da matriz: " + media);
    }
}