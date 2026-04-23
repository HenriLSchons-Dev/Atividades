import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/

public class ocupacaoPatio {
    public static void main(String[] args) {
        String[] placas = new String[50];
        int i = 0;
        boolean continua = true;
        Scanner leia = new Scanner(System.in);

        do { 
            System.out.println("Digite a placa que deseja registrar: ");
            System.out.println("Ou digite FIM, para encerrar.");
            placas[i] = leia.nextLine();

            if (placas[i].equals("FIM")) {
                continua = false;
            } 
            else {
                i++;
            }

        } while (i < 50 && continua);

        System.out.println("Total de vagas ocupadas: " + i);
    }
}