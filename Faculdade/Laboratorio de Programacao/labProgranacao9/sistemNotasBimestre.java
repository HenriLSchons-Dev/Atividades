/**
 * 
 * @author Henri Lopes Schons
 */
public class sistemNotasBimestre{
    public static void main(String[] args){
        double[][] matriz = {
            {7.5, 8.0, 6.5, 9.0},
            {5.0, 6.5, 7.0, 6.0},
            {9.0, 8.5, 9.5, 10.0},
            {6.0, 5.5, 7.0, 8.0},
            {8.5, 7.5, 8.0, 7.0}
        };
        double maiorMedia = 0, menorMedia = 11, media = 0;
        int i, j;

        for(i = 0; i < matriz.length; i++){
            double mediaAluno = 0;

            for(j = 0; j < matriz[i].length; j++){
                mediaAluno += matriz[i][j];
                
            }
            media += mediaAluno;
            mediaAluno /= 4;

            if(mediaAluno > maiorMedia){
                maiorMedia = mediaAluno;
            }
            if(mediaAluno < menorMedia){
                menorMedia = mediaAluno;
            }
            
            if(mediaAluno >= 7){
                System.out.println("Aluno " + (i + 1) + " aprovado!");
            }
            else if(mediaAluno >= 5){
                System.out.println("Aluno " + (i + 1) + " de recuperação!");
            }
            else{
                System.out.println("Aluno " + (i + 1) + " reprovado!");
            }
            System.out.println("O aluno " + (i + 1) + " teve a media de notas: " + mediaAluno);
            System.out.println();
        }
        media /= 20; 

        System.out.println("A maior media registrada nessa sala foi: " + maiorMedia);
        System.out.println("A menor media registrada nessa sala foi: " + menorMedia);
        System.out.println("A media geral dessa sala foi: " + media);
    }
}