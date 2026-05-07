public class rankingTorneio {
    public static void main(String[] args) {
        int[][] matriz = {
            {554, 470, 916},
            {838, 123, 549},
            {602, 346, 229},
            {647, 365, 163}
        };
        int i, j, soma, maior = 0, equipe = 0;

        for(i = 0; i < matriz.length; i++){
            soma = 0;

            for(j = 0; j < matriz[i].length; j++){
                soma += matriz[i][j];
            }

            System.out.println("Equipe " + (i + 1) + ": " + soma + " pontos");

            if(soma > 95){
                System.out.println("Equipe passou de 95 pontos");
            }

            if(soma > maior){
                maior = soma;
                equipe = i + 1;
            }
        }

        System.out.println("Maior pontuacao: Equipe " + equipe);
    }
}