public class filtroEstoque {
    public static void main(String[] args) {
        int[][] matriz = {
            {58, 40, 14, 4, 5},
            {2, 17, 15, 41, 15},
            {47, 2, 57, 33, 55}
        };
        int i, j, limite = 15;

        for(i = 0; i < matriz.length; i++){

            for(j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] < limite){
                    System.out.println("Estoque critico em [" + i + "][" + j + "] = " + matriz[i][j]);
                }
            }
        }

    }
}