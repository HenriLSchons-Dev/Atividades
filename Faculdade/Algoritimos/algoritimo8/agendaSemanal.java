import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class agendaSemanal{
    public static void main(String[] agrs){
        String[][] tarefas = {
            {"campanha", "analise", "planejamento"},
            {"recrutamento", "treinamento", "pagamento"},
            {"manutencao", "desenvolvimento", "suporte"}
        };
        int i, j, linha, coluna;
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual posicao deseja alterar? posicao dada por = (i, j)");
        linha = leia.nextInt();
        coluna = leia.nextInt();
        leia.nextLine();

        System.out.println("Oque deseja colocar no lugar?");
        for(i = 0; i < tarefas.length; i++){

            for(j = 0; j < tarefas[i].length; j++){
                if(linha == i && coluna == j){
                    tarefas[i][j] = leia.nextLine();
                }
            }
        }

        System.out.println("A matriz com alteracao feita e: ");
        for(i = 0; i < tarefas.length; i++){

            for(j = 0; j < tarefas[i].length; j++){
                System.out.print(tarefas[i][j] + "; ");
            }
            System.out.println();
        }
    }
}