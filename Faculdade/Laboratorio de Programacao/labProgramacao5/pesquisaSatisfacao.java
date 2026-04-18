import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class pesquisaSatisfacao {

    public static void main(String[] args) {
        int nivel, satisfeito = 0, neutro = 0, insatisfeito = 0;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Qual seu nivel de satisfação?");
            System.out.println("1 - satisfeito");
            System.out.println("2 - neutro");
            System.out.println("3 - insatisfeito");
            nivel = leia.nextInt();
            
            if(nivel == 1){
                satisfeito++;
            }
            else if(nivel == 2){
                neutro++;
            }
            else if(nivel == 3){
                insatisfeito++;
            }
            else{
                System.out.println("Digite um valor válido!");
            }
        }while(nivel != 0);
        System.out.println("Satisfeitos: " + satisfeito);
        System.out.println("Neutros: " + neutro);
        System.out.println("Insatisfeitos: " + insatisfeito);
    }
}