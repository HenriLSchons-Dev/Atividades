import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class filtroAudiencia{
    public static void main(String[] args){
        int[] tempoAssistido = new int[10];
        int[] tempo = new int[10];
        int i;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o tempo assistido, em minutos: ");
        for(i = 0; i < tempoAssistido.length; i++){
            tempoAssistido[i] = leia.nextInt();

            if(tempoAssistido[i] >= 30){
                tempo[i] = tempoAssistido[i];
            }
        }

        System.out.print("O vetor que possui apenas valores acimade 30minutos assistidos da audiencia é: ");
        for(i = 0; i < tempo.length; i++){
            System.out.print(tempo[i]);
        }
    }
}