import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class contrlAlunos {

    public static void main(String[] args) {
        int media = 0, nota, maior = 0, quantidade = 0;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Digite a primeira nota do aluno: ");
            nota = leia.nextInt();
            
            if(nota != -1){
                quantidade++;
                media = (media + nota) / quantidade;
            
                if(maior < nota){
                    maior = nota;
                }
            }
            
        }while(nota != -1);
        System.out.println("Media das notas: " + media);
        System.out.println("Maior nota: " + maior);
    }
}
