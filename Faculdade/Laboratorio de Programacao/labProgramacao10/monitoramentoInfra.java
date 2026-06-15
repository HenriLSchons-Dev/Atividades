import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class monitoramentoInfra{
    public static void main(String[] args) {
        int[] usoCPU = new int[7];
        int i, media = 0, maior = 0, menor = 101, servidorMaior = 0, acimaDaMedia = 0;;
        Scanner leia = new Scanner(System.in);

        for (i = 0; i < usoCPU.length; i++) {
            System.out.print("Digite o uso da CPU do servidor " + (i + 1) + ": ");
            usoCPU[i] = leia.nextInt();

            media += usoCPU[i];

            if (usoCPU[i] > maior) {
                maior = usoCPU[i];
                servidorMaior = i + 1;
            }

            if (usoCPU[i] < menor) {
                menor = usoCPU[i];
            }
        }

        media /= usoCPU.length;

        for (i = 0; i < usoCPU.length; i++) {
            if (usoCPU[i] > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("Maior utilização: " + maior + "%");
        System.out.println("Menor utilização: " + menor + "%");
        System.out.println("Média de utilização: " + media + "%");
        System.out.println("Servidores acima da média: " + acimaDaMedia);
        System.out.println("Servidor que merece atenção prioritária: Servidor " + servidorMaior);

    }
}