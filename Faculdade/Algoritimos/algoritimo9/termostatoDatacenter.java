import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class termostatoDatacenter{
    public static void main(String[] args){
        double[][] temp = new double[3][3];
        double media = 0;
        int i, j;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o valor termico do rack de servidor?");
        for(i = 0; i < temp.length; i++){

            for(j = 0; j < temp[i].length; j++){
                
                temp[i][j] = leia.nextDouble();  
                media += temp[i][j];              
            }
        }
        media = media / 9;

        System.out.println("A media da temperatura no servidor e: " + media);
    }
}