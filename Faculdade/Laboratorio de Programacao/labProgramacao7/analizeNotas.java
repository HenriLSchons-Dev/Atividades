import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class analizeNotas {
    public static void main(String[] args) {
        double[] nota = new double[6];
        double soma = 0, media, maior = 0, menor = 0;
        int i, qntMaior = 0, qntMenor = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite suas 6 notas: ");
        for(i = 0; i < nota.length; i++){
            nota[i] = leia.nextDouble();
            soma += nota[i];
            if(nota[i] >= 6){
                qntMaior++;
            }
            else{
                qntMenor++;
            }

            if(i == 0){
                maior = nota[i];
                menor = nota[i];
            }
            else{
                if(maior < nota[i]){
                    maior = nota[i];
                }
                else if(menor > nota[i]){
                    menor = nota[i];
                }
            }
        }
        media = soma / 6;

        System.out.println("A media das suas notas e: " + media);
        System.out.println("A sua maior nota e: " + maior);
        System.out.println("A sua menor nota e: " + menor);
        System.out.println("Voce teve " + qntMenor + " notas abaixo de 6");
        System.out.print("Alem de " + qntMaior + " notas acima de 6");
    }
}