import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class logisticaAutomatizada{
    public static void main(String[] args){
        int[] id = new int[15];
        String[] peso = new String[15];
        double[] kg = new double[15];
        double somaTot = 0, media, pesoMAIOR, pesoMENOR;
        int i, idMAIOR, idMENOR, busca;
        boolean encontrou = false;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o ID das cargas recebidas: ");
        for(i = 0; i < id.length; i++){
            id[i] = leia.nextInt();
        }

        System.out.println("Digite o peso em Kg das cargas respectivas aos IDs: ");
        for(i = 0; i < peso.length; i++){
           kg[i] = leia.nextInt();
           somaTot += kg[i];

           if(kg[i] > 1000){
            peso[i] = "PESADA";
           }
           else{
            peso[i] = "LEVE";
           }
        }

        media = somaTot / 15;

        System.out.println("A media dos pesos das 15 cargas e: Kg" + media);
        System.out.println("O peso total das 15 cargas e: Kg" + somaTot);

        pesoMAIOR = kg[0];
        pesoMENOR = kg[0];
        idMAIOR = id[0];
        idMENOR = id[0];

        for(i = 1; i < 15; i++){
            if(kg[i] > pesoMAIOR){
                pesoMAIOR = kg[i];
                idMAIOR = id[i];
            }

            if(kg[i] < pesoMENOR){
                pesoMENOR = kg[i];
                idMENOR = id[i];
            }
        }

        System.out.println("Carga mais pesada: ID " + idMAIOR + " Peso: " + pesoMAIOR);
        System.out.println("Carga mais leve: ID " + idMENOR + " Peso: " + pesoMENOR);

        do {
            System.out.print("Digite um ID para buscar (ou -1 para sair): ");
            busca = leia.nextInt();

            for(i = 0; i < id.length; i++){
                if(id[i] == busca){
                    System.out.println("Peso: " + kg[i] + " (" + peso[i] + ")");
                    encontrou = true;
                }
            }

            if(!encontrou && busca != -1){
                System.out.println("ID não encontrado.");
            }

        } while (busca != -1);

    }
}