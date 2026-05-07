/**
 * 
 * @author Henri Lopes Schons
 */
public class normalizacaoSatelite{
    public static void main(String[] args){
        int[][] pixels ={
            {12, 198, 45, 255},
            {87, 34, 210, 16},
            {143, 99, 0, 76},
            {221, 58, 174, 129}
        };
        int i, j;

        for(i = 0; i < pixels.length; i++){

            for(j = 0; j < pixels[i].length; j++){

                if(pixels[i][j] < 50){
                    pixels[i][j] = 0;
                }

            }
        }

        System.out.println("A matriz resultante e: ");
        for(i = 0; i < pixels.length; i++){

            for(j = 0; j< pixels[i].length; j++){
                System.out.print(pixels[i][j] + "; ");
            }
            System.out.println();
        }
    }
}