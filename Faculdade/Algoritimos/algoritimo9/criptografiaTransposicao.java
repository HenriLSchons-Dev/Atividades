public class criptografiaTransposicao {
    public static void main(String[] args) {
        String[][] matriz = {
            {"H", "G", "I"},
            {"V", "H", "D"},
            {"W", "A", "M"},
            {"M", "J", "S"}
        };
        int i, j;
        String resultado = "";

        for(j = 0; j < matriz[0].length; j++){

            for(i = 0; i < matriz.length; i++){
                if(!matriz[i][j].equals(" ")){
                    resultado += matriz[i][j];
                }
            }
        }

        System.out.println("String criptografada: " + resultado);
    }
}