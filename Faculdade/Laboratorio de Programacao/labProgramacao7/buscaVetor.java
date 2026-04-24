import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class buscaVetor {
    public static void main(String[] args) {
        double[] vetor = new double[6];
        double busca;
        boolean encontrado = false;
        int i;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 6 valores: ");
        for(i = 0; i < vetor.length; i++){
            vetor[i] = leia.nextDouble();
        }

        System.out.println("Qual numero deseja buscar no vetor?");
        busca = leia.nextDouble();

        for(i = 0; i < vetor.length; i++){
            if(busca == vetor[i]){
                System.out.println("Valor encontrado!");
                System.out.println("Encontrado no indice: " + i);
                encontrado = true;
            }
        }

        if(encontrado == false){
            System.out.println("Valor nao encontrado");
        }
    }
}