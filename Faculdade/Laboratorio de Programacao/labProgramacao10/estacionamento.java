import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class estacionamento {
    public static void main(String[] args) {
        int[][] vagas = {
            {1, 0, 0, 1, 1},
            {0, 1, 1, 0, 0},
            {1, 1, 0, 0, 1},
            {0, 0, 1, 1, 0},
            {1, 0, 1, 0, 1}
        };
        int i, j, livre = 0, ocupada = 0;
        double percentual;
        Scanner leia = new Scanner(System.in);

        System.out.println("Mapa do estacionamento");
        for(i = 0; i < vagas.length; i++){
            for(j = 0; j < vagas[i].length; j++){
                System.out.print(vagas[i][j] + "\t");
            }
            System.out.println();
        }

        for(i = 0; i < vagas.length; i++){
            for(j = 0; j < vagas[i].length; j++){
                if(vagas[i][j] == 1){
                    livre++;
                }
                else{
                    ocupada++;
                }
            }
        }

        percentual = (ocupada * 100.0) / 25;

        System.out.println("Vagas livres: " + livre);
        System.out.println("Vagas ocupadas: " + ocupada);
        System.out.println("Percentual de ocupacao: " + percentual + "%");

        if (percentual > 80) {
            System.out.println("ALERTA: Ocupação acima de 80%! Considere expansão do estacionamento.");
        }

    }
}