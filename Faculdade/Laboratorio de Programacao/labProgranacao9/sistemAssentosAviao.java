/**
 * 
 * @author Henri Lopes Schons
 */
public class sistemAssentosAviao{
    public static void main(String[] args){
        int[][] matriz = {
            {1, 0, 1, 1},
            {0, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 0, 1, 1}
        };
        double ocupacao;
        int i, j, livre = 0, ocupado = 0;

        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] == 0){
                    livre++;
                }
                else{
                    ocupado++;
                }

            }
        }
        ocupacao = (ocupado / 16.0) * 100;

        if(ocupacao >= 70){
            System.out.println("O voo está lotado");
            System.out.println();
        }
        else{
            System.out.println("Voo ainda nao lotado!");
            System.out.println();
        }
        System.out.println("O total de assentos livres: " + livre);
        System.out.println("O total de assentos ocupados: " + ocupado);
        System.out.println("O voo teve " + ocupacao + "% da ocupacao");
    }
}