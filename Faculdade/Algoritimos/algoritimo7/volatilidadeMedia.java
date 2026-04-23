import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons
 */
public class volatilidadeMedia{
    public static void main(String[] args){
        double[] precos = new double[7];
        double volatilidade;
        int i;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o preco do produto ao decorrer da semana: ");
        for(i = 0; i < precos.length; i++){
            precos[i] = leia.nextDouble();
        }

        if(precos[0] > precos[6]){
            volatilidade = precos[0] - precos[6]; 
        }
        else{
            volatilidade = precos[6] - precos[0];
        }
        
        System.out.println("A volatilidade do preço do fim ao final da semana é de: " + volatilidade);
    }
}