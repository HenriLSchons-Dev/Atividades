public class engineRecomendacaoGrafo {
    public static void main(String[] args) {
        int[][] A = {
            {3, 2, 9, 7},
            {4, 9, 9, 1},
            {7, 5, 5, 6}
        };
        int[][] B = {
            {8, 9, 5},
            {6, 5, 6},
            {3, 7, 7},
            {9, 7, 2}
        };
        int[][] C = new int[3][3];
        int i, j, k;

        if(A[0].length == B.length){

            for(i = 0; i < A.length; i++){

                for(j = 0; j < B[0].length; j++){

                    for(k = 0; k < B.length; k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("Matriz Resultante:");

            for(i = 0; i < C.length; i++){

                for(j = 0; j < C[i].length; j++){
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }

        } 
        else{
            System.out.println("Nao e possivel multiplicar");
        }
    }
}