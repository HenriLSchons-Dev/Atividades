import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class chamadosPrioridade{
    public static void main(String[] agrs){
        int[][] chamados = new int[5][5];
        int i, j, aberto = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Preencha com 1 para chamados abertos, e 0 para sem chamados: ");
        for(i = 0; i < chamados.length; i++){

            for(j = 0; j < chamados[i].length; j++){
                chamados[i][j] = leia.nextInt();

                if(chamados[i][j] == 1){
                    aberto++;
                }
            }
        }
        
        System.out.println("Existem " + aberto + " chamados em aberto!");
    }
}