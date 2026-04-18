import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class contrlTemperatura {

    public static void main(String[] args) {
        int temp, maior = 0, menor = 0;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Qual a temperatura do ambiente agora?");
            temp = leia.nextInt();
            
            if(maior < temp && temp != 999){
                maior = temp;
            }
            
            if(menor > temp && temp != 999){
                menor = temp;
            }
        }while(temp != 999);
        System.out.println("A maior temperatura registrada: " + maior);
        System.out.println("A menor temperatura registrada: " + menor);
    }
}
