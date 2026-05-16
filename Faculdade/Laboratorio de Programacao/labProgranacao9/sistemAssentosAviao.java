import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class sistemAssentosAviao{
    public static void main(String[] args){
        int[][] matriz = new int[4][4];
        int i, j, ocupacao, livre = 16, ocupado = 16;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 1 para acento ocupado, e 0 para assento livre:");
        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
                
                if(matriz[i][j] == 1){
                    livre--;
                }
                else if(matriz[i][j] == 0){
                    ocupado--;
                }
                else{
                    System.out.print("Inserir valor valido!");
                }

            }
        }
        ocupacao = (ocupado / 16) * 100;

        if(ocupacao >= 70){
            System.out.println("O voo está lotado");
        }
        else{
            System.out.println("Voo ainda nao lotado!");
        }
        System.out.println("O total de assentos livres: " + livre);
        System.out.println("O total de assentos ocupados: " + ocupado);
        System.out.println("O voo teve " + ocupacao + "% da ocupacao");
    }
}