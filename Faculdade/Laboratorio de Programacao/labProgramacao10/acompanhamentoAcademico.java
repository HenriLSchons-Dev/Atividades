/**
 * 
 * @author Henri Lopes Schons
 */
public class acompanhamentoAcademico{
    public static void main(String[] args) {

        double[][] notas = {
            {8.0, 7.5, 9.0, 8.5},
            {6.0, 5.5, 7.0, 6.5},
            {4.0, 3.5, 5.0, 4.5},
            {9.0, 8.5, 10.0, 9.5},
            {7.0, 6.5, 7.5, 8.0}
        };
        double[] medias = new double[notas.length];
        double maiorNota = notas[0][0];
        double menorNota = notas[0][0];
        double somaTurma = 0;
        double mediaGeral;
        int satisfatorio = 0, acompanhamento = 0, critico = 0;

        for (int i = 0; i < notas.length; i++) {
            double somaAluno = 0;

            for (int j = 0; j < notas[i].length; j++) {
                somaAluno += notas[i][j];

                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                }

                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                }
            }
            medias[i] = somaAluno / notas[i].length;
            somaTurma += medias[i];

            if (medias[i] >= 7) {
                satisfatorio++;
            } else if (medias[i] >= 5) {
                acompanhamento++;
            } else {
                critico++;
            }
        }
        mediaGeral = somaTurma / notas.length;

        System.out.println("Média de cada estudante:");
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Aluno %d: %.2f%n", i + 1, medias[i]);
        }

        System.out.printf("Maior nota registrada: " + maiorNota);
        System.out.printf("Menor nota registrada: " + menorNota);
        System.out.printf("Média geral da turma: " + mediaGeral);

        System.out.println("Classificação dos estudantes:");
        System.out.println("Satisfatórios: " + satisfatorio);
        System.out.println("Acompanhamento: " + acompanhamento);
        System.out.println("Situação crítica: " + critico);

        System.out.println("Estudantes acima da média geral:");

        for (int i = 0; i < medias.length; i++) {
            if (medias[i] > mediaGeral) {
                System.out.printf("Aluno %d -> Média %.2f%n", i + 1, medias[i]);
            }
        }
    }
}