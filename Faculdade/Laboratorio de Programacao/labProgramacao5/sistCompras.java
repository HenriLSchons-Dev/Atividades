import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class sistCompras {

    public static void main(String[] args) {
        int produtos = -1, total = 0, preco;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Digite o preco do produto: ");
            preco = leia.nextInt();
            total = total + preco;
            produtos++;
        }while(preco != -1);
        System.out.println("Total da sua compra: " + total);
        System.out.println("Quantidade de produtos: " + produtos);
    }
}