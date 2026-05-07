public class painelPresenca {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 1, 1, 0, 1},
            {0, 0, 0, 0, 0},
            {1, 1, 0, 1, 0},
            {0, 1, 0, 1, 1}
        };
        int i, j, soma, menor = 999, linhaMenor = 0;

        for(i = 0; i < matriz.length; i++){
            soma = 0;

            for(j = 0; j < matriz[i].length; j++){
                soma += matriz[i][j];
            }

            System.out.println("Linha " + (i + 1) + ": " + soma + " presencas");

            if(soma < menor){
                menor = soma;
                linhaMenor = i;
            }
        }

        System.out.println("Linha com menor presenca: " + (linhaMenor + 1));
    }
}