import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class atividadeExtra{
    public static void main(String[] args){
        double[][] notas = new double[5][1];
        double[] mediaDosAlunos = new double[5];
        List<Integer> matricula = new ArrayList<>();
        double media = 0, mediaAluno, maior = 0, menor = 0;
        int i, j, aprovado = 0, recuperacao = 0, reprovado = 0;
        Scanner leia = new Scanner(System.in);

        for(i = 0; i < notas.length; i++){
            mediaAluno = 0;

            for(j = 0; j < notas[i].length; j++){
                notas[i][j] = leia.nextDouble();
                media += notas[i][j];
                mediaAluno += notas[i][j];

            }
            mediaAluno /= 10;
            mediaDosAlunos[i] = mediaAluno;

            System.out.println("A media do aluno " + (i + 1) + " foi de: " + mediaAluno);

            if(mediaAluno >= 7){
                System.out.println("Aluno " + (i + 1) + " está aprovado!");
                aprovado++;
            }
            else if(mediaAluno >= 5){
                System.out.println("Aluno " + (i + 1) + " está de recuperacao");
                recuperacao++;
            }
            else {
                System.out.println("Aluno " + (i + 1) + " está reprovado");
                reprovado++;
            }

            if(i == 0){
                maior = mediaAluno;
                menor = mediaAluno;
            }
            else{
                if(maior < mediaAluno){
                    maior = mediaAluno;
                }
                else if(menor > mediaAluno){
                    menor = mediaAluno;
                }
            }

        }
        media /= 500;

        for(i = 0; i < mediaDosAlunos.length; i++){

            if(media < mediaDosAlunos[i]){
                matricula.add(i);
            }

        }

        System.out.println("A quantidade de alunos aprovados foi: " + aprovado);
        System.out.println("A quantidade de alunos de recuperação foi: " + recuperacao);
        System.out.println("A quantidade de alunos reprovados foi: " + reprovado);
        System.out.println("A media geral da turma foi: " + media);
        System.out.println("A maior media da turma foi: " + maior);
        System.out.println("A menor media da turma foi: " + menor);
        System.out.print("O numero de matricula dos alunos que tiveram a media acima da media geral da turma sao: \t" + matricula);
    }
}