import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class sistVotacao {

    public static void main(String[] args) {
        int voto, candidatoA = 0, candidatoB = 0, emBranco = 0, nulo = 0, total = 0;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Qual candidato deseja votar?");
            System.out.println("1 - Candidato A");
            System.out.println("2 - Candidato B");
            System.out.println("3 - Voto em branco");
            System.out.println("4 - Voto nulo");
            
            voto = leia.nextInt();
            
            if(voto == 1){
                candidatoA++;
                total++;
            }
            else if(voto == 2){
                candidatoB++;
                total++;
            }
            else if(voto == 3){
                emBranco++;
                total++;
            }
            else if(voto == 4){
                nulo++;
                total++;
            }
            else{
                System.out.println("Digite um valor válido!");
            }
        }while(voto != 0);
        System.out.println("Quantidade de votos no candidato A: " + candidatoA);
        System.out.println("Quantidade de votos do candidato B: " + candidatoB);
        System.out.println("Quantidade de votos em branco: " + emBranco);
        System.out.println("Quantidade de votos nulos: "+ nulo);
        System.out.println("Quantidade de votos TOTAL: " + total);
    }
}
