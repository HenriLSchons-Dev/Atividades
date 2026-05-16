import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class sistemCorrecaoProva{
    public static void main(String[] args){
        int[] vetor = new int[5];
        int i, maior = 0, menor = 11, aprovado = 0, reprovado = 0, recuperacao = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite as notas dos 5 alunos:");
        for(i = 0; i < vetor.length; i++){
            vetor[i] = leia.nextInt();
            
            if(vetor[i] >= 7){
                aprovado++;
            }
            else if(vetor[i] >= 5){
                recuperacao++;
            }
            else{
                reprovado++;
            }

            if(maior < vetor[i]){
                maior = vetor[i];
            }

            if(menor > vetor[i]){
                menor = vetor[i];
            }
            
        }
        System.out.println("A maior nota presente na sala foi: " + maior);
        System.out.println("A menor nota presente na sala foi: " + menor);
        System.out.println("O numero de alunos aprovados foi: " + aprovado);
        System.out.println("O numero de em recuperacao foi: " + recuperacao);
        System.out.println("O numero de alunos reprovados foi: " + reprovado);
    }
}