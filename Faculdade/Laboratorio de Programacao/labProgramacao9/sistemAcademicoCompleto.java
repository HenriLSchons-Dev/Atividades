/**
 * 
 * @author Henri Lopes Schons
 */
public class sistemAcademicoCompleto{
    public static void main(String[] args){
        String[] alunos = {
            "Henri",
            "Thiago",
            "Joao Pedro",
            "Pedro",
            "Lucas"
        };
        double[][] notas = {
            {7.5, 8.0},
            {5.0, 6.5},
            {9.0, 8.5},
            {6.0, 4.5},
            {8.0, 7.0}
        };
        int i, j;
        double maiorMedia = 0, soma = 0;

        String melhorAluno = "";

        for(i = 0; i < notas.length; i++){
            double somaAluno = 0;

            for(j = 0; j < notas[i].length; j++){
                somaAluno += notas[i][j];
            }
            double mediaAluno = somaAluno / 2;

            System.out.println("Aluno: " + alunos[i]);
            System.out.println("Media: " + mediaAluno);

            if(mediaAluno >= 7){
                System.out.println("Situacao: Aprovado");
            }
            else if(mediaAluno >= 5){
                System.out.println("Situacao: Recuperacao");
            }
            else{
                System.out.println("Situacao: Reprovado");
            }
            System.out.println();

            soma += mediaAluno;

            if(mediaAluno > maiorMedia){

                maiorMedia = mediaAluno;
                melhorAluno = alunos[i];

            }
        }
        double mediaTurma = soma / alunos.length;

        System.out.println("Maior media da turma: " + maiorMedia);
        System.out.println("Melhor aluno: " + melhorAluno);
        System.out.println("Media geral da turma: " + mediaTurma);
    }
}