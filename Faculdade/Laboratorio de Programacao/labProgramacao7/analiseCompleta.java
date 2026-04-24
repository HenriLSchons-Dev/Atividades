import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class analiseCompleta {
    public static void main(String[] args) {
        double[] num = new double[8];
        double soma = 0, media, maior = 0, menor = 0;
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 8 numeros: ");
        for(i = 0; i < num.length; i++){
            num[i] = leia.nextDouble();

            soma += num[i];

            if(i == 0){
                maior = num[i];
                menor = num[i];
            } 
            else {
                if(maior < num[i]){
                    maior = num[i];
                }
                else if(menor > num[i]){
                    menor = num[i];
                }
            }

        }

        media = soma / 8;

        System.out.println("O maior numero e: " + maior);
        System.out.println("O menor numero e: " + menor);
        System.out.println("A soma dos valores e: " + soma);
        System.out.println("A media dos valores e: " + media);

    }
}