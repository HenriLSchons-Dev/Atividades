import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class monitoramentoServidores{
    public static void main(String[] args){
        int[] vetor = new int[7];
        int i, maior = 0, menor = 101, media = 0, uso = 0, posicao = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite os valores do uso de CPU dos 7 servidores, em porcentagem:");
        for(i = 0; i < vetor.length; i++){
            vetor[i] = leia.nextInt();
            
            if(maior < vetor[i]){
                maior = vetor[i];

                if(maior >= 80){
                    uso = maior;
                    posicao = i;
                }                
            }

            if(menor > vetor[i]){
                menor = vetor[i];
            }

            media += vetor[i];
        }

        System.out.println("O maior uso registrado de CPU foi de: " + maior);
        System.out.println("O menor uso registrado de CPU foi de: " + menor);
        System.out.println("A media de uso das CPUs dos servidores foi de: " + media);
        System.out.println("A quantidade de servidores que ficaram acima de 80% foi: " + uso);
        System.out.println("O servidor com maior uso de CPU registrado foi o servidor de numero: " + (posicao + 1));
    }
}