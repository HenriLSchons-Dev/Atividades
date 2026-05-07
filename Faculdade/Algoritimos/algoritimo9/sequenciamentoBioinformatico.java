/**
 * 
 * @author Henri Lopes Schons
 */
public class sequenciamentoBioinformatico{
    public static void main(String[] args) {
        int[][] cadeia = {
            {815, 520, 189},
            {761, 692, 510},
            {495, 934, 475}
        };
        int i, j;
        boolean simetrico = true;
        
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