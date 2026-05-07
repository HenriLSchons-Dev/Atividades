import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class varreduraRamsomware {
    public static void main(String[] args) {
        int[][] matriz = {
            {919, 149, 860},
            {184, 972, 463},
            {626, 985, 216}
        };
        int i, j, id, contador;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o ID: ");
        id = leia.nextInt();

        contador = 0;

        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] == id){
                    System.out.println("ID encontrado em [" + i + "][" + j + "]");
                    contador++;
                }
            }
        }

        if(contador == 0){
            System.out.println("Setor limpo");
        }
        else{
            System.out.println("Quantidade de ocorrencias existentes: " + contador);
        }
    }
}