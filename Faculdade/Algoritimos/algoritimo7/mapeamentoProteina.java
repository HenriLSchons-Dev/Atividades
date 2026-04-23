import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class mapeamentoProteina{
    public static void main(String[] args){
        double[] ph = new double[10];
        double media, soma = 0, foraFaixaIdeal = 0;
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o valor de ph das proteinas? ");        
        for(i = 0; i < ph.length; i++){
            ph[i] = leia.nextDouble();
            soma += ph[i];

            if(ph[i] > 7.5 || ph[i] < 6.5){
                foraFaixaIdeal++;
            }
        }

        media = soma / 10;
        
        System.out.println("A media dos valores dos phs analisados e: " + media);
        System.out.println("Tivemos " + foraFaixaIdeal + " proteinas fora da faixa ideal.");
    }
}