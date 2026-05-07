/**
 * 
 * @author Henri Lopes Schons
 */
public class maiorFaturamento{
    public static void main(String[] agrs){
        double[][] faturamento = {
            {48320, 52910, 46780, 59200},
            {31450, 28990, 35670, 33120},
            {72800, 68450, 75300, 70920}
        };
        int i, j;
        double maior = 0;

        for(i = 0; i < faturamento.length; i++){

            for(j = 0; j < faturamento[i].length; j++){
                if(maior < faturamento[i][j]){
                    maior = faturamento[i][j];
                }
            }
        }

        System.out.println("O maior faturamento e: " + maior);
    }
}