/**
 * 
 * @author Henri Lopes Schons
 */
public class sistemAnaliseEnergia{
    public static void main(String[] args){
        int[][] matriz = {
            {320, 280, 450, 390, 510, 470, 300, 520, 410, 360},
            {300, 260, 430, 400, 490, 460, 310, 540, 420, 350}
        };
        int i, j, media = 0, diaAcima = 0, maiorConsumo = 0, menorConsumo = 0;

        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                media += matriz[i][j];

                if(matriz[i][j] > maiorConsumo){
                    maiorConsumo = matriz[i][j];
                }

                if(matriz[i][j] < menorConsumo){
                    menorConsumo = matriz[i][j];
                }
            }
        }
        media /= 20;

        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){

                if(matriz[i][j] > media){
                    diaAcima++;
                }

                if(matriz[i][j] > 500){
                    System.out.println("Maquina "+ (i + 1) + " no dia " + (j + 1) + " teve consumo critico!");
                }
            }
        }
        System.out.println();

        System.out.println("Tivemos um total de " + diaAcima + " consumos acima da media");
        System.out.println("A media energetica das maquinas foi: " + media);
        System.out.println("Maior consumo registrado: " + maiorConsumo);
        System.out.println("Menor consumo registrado: " + menorConsumo);
    }
}