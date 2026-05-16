import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class sistemEstoqueInteligente{
    public static void main(String[] args){
        int[][] matriz = new int[7][7];
        int i, j, total = 0, diaMaiorVenda = 0, diasAbaixo = 0, somaSemana = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de cada produto vendido em cada um dos dias da semana:");
        for(i = 0; i < matriz.length; i++){
            int somaDiaria = 0;
            int mediaDiaria;

            for(j = 0; j < matriz[i].length; j++){
                matriz[i][j] = leia.nextInt();
                total += matriz[i][j];
                somaDiaria += matriz[i][j];

                if(somaSemana < somaDiaria){
                    diaMaiorVenda = i;
                    //as linhas (i) representam os dias e as colunas (j) a quantidade de determinado produto vendido
                }
                
                if(somaDiaria <= 50){
                    diasAbaixo++;
                }

                somaSemana = somaDiaria;
            }
            mediaDiaria = somaDiaria / 7;
            System.out.println("A media diaria vendida foi: " + mediaDiaria);
        }

        System.out.println("O total vendido na semana foi: " + total);
        System.out.println("O dia com maior numero de vendas foi: " + diaMaiorVenda);
        System.out.println("Tiveram " + diasAbaixo + " dias abaixo da media");
    }
}