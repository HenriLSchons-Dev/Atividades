import java.util.Scanner;
/** 
 * 
 * @author Henri Lopes Schons
*/

public class valvulaPressao {
    public static void main(String[] args) {
        double pressao;
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o valor da pressao atual? ");
        pressao = leia.nextDouble();

        if(pressao > 30){
            System.out.println("Pressao muito acima do adequado. PERIGO!");
        }
        else if(pressao >= 10){
            System.out.println("Pressao em nivel aceitavel. Estavel!");
        }
        else if(pressao < 10 && pressao > 0){
            System.out.println("Pressao abaixo do adequado. Baixa!");
        }
        else{
            System.out.println("Favor inserir valor valido!");
        }
    }
}