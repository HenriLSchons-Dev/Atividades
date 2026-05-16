/**
 * 
 * @author Henri Lopes Schons
 */
public class sistemVendaLoja{
    public static void main(String[] args){
        int[][] matriz = {
            {620, 750, 680, 820},
            {540, 610, 590, 700},
            {900, 880, 950, 1020},
            {430, 520, 480, 510},
            {760, 790, 850, 810}
        };
        double total = 0, maiorVenda = 0, media, vendedor = 0;
        int i, j;

        for(i = 0; i < matriz.length; i++){
            int somaDiaria = 0;

            for(j = 0; j < matriz[i].length; j++){
                total += matriz[i][j];
                somaDiaria += matriz[i][j];
            }

            System.out.println("O vendedor " + (i + 1) + " vendeu um total de: " + somaDiaria);

            if(somaDiaria > 5000){
                System.out.println("Meta atingida!");
            }

            System.out.println();

            if(maiorVenda < somaDiaria){
                maiorVenda = somaDiaria;
                vendedor = i + 1;
            }

            maiorVenda = somaDiaria;
        }
        media = total / 20;

        System.out.println("A media de vendas foi: " + media);
        System.out.println("O vendedor " + vendedor + " teve a maior venda");
    }
}