import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class avaliacaoProduto {
    public static void main(String[] args) {
        int[] nota = new int[8];
        int i, maior = 0, menor = 6, qntdNotaMax = 0;
        double media = 0;
        Scanner leia = new Scanner(System.in);

        for (i = 1; i <= 10; i++) {
            do{
                System.out.println("Digite a nota do cliente " + i + ": ");
                nota[i] = leia.nextInt();
            }while(nota[i] > 5 || nota[i] < 1);

            media += nota[i];

            if (nota[i] > maior) {
                maior = nota[i];
            }

            if (nota[i] < menor) {
                menor = nota[i];
            }

            if (nota[i] == 5) {
                qntdNotaMax++;
            }
        }
        media /= 10;

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Média: " + media);
        System.out.println("Quantidade de notas 5: " + qntdNotaMax);
    }
}