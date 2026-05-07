import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class sequenciamentoBioinformatico{
    public static void main(String[] args) {
        int[][] cadeia = new int[3][3];
        int i, j;
        boolean simetrico = true;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite valores inteiros para preencher a matriz: ");        
        for(i = 0; i < cadeia.length; i++){

            for(j = 0; j < cadeia[i].length; j++){
                cadeia[i][j] = leia.nextInt();                
            }

        }
        
        for(i = 0; i < cadeia.length; i++){
            for(j = 0; j < cadeia[i].length; j++){
                if(cadeia[i][j] != cadeia[j][i]){
                    simetrico = false;
                }
            }
        }
                
        if(simetrico == true){
            System.out.println("A matriz e simetrica!");
        }
        else{
            System.out.println("A matriz nao e simetrica");
        }
        
    }
}