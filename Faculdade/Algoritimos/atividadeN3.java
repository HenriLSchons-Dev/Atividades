import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons e Joao Pedro Sapalacio
 */
public class atividadeN3{
    public static void main(String[] args) {
        String[][] minecraft = {
            {"L","L","O","L","L","O","L","L"},
            {"O","L","L","L","O","L","L","L"},
            {"L","O","L","L","L","L","O","L"},
            {"L","L","L","O","L","L","L","O"},
            {"O","L","L","L","L","O","L","L"},
            {"L","L","O","L","L","L","L","O"},
            {"L","O","L","L","O","L","L","L"},
            {"L","L","L","O","L","L","O","L"}
        };
        String[][] longLegs = {
            {"O","L","L","O","L","L","L","O"},
            {"L","L","O","L","L","O","L","L"},
            {"L","O","L","L","L","L","O","L"},
            {"O","L","L","L","O","L","L","L"},
            {"L","L","O","L","L","L","L","O"},
            {"L","O","L","L","O","L","L","L"},
            {"L","L","L","O","L","L","O","L"},
            {"O","L","L","L","L","O","L","L"}
        };
        String[][] backrooms = {
            {"L","O","L","L","L","O","L","L"},
            {"L","L","L","O","L","L","O","L"},
            {"O","L","L","L","L","O","L","L"},
            {"L","L","O","L","L","L","L","O"},
            {"L","O","L","L","O","L","L","L"},
            {"L","L","L","O","L","L","O","L"},
            {"O","L","L","L","L","L","L","O"},
            {"L","L","O","L","L","O","L","L"}
        };
        String[][] theAmazingDigitalCircus = {
            {"L","L","O","L","L","L","O","L"},
            {"O","L","L","L","O","L","L","L"},
            {"L","L","O","L","L","O","L","L"},
            {"L","O","L","L","L","L","O","L"},
            {"O","L","L","O","L","L","L","L"},
            {"L","L","L","L","O","L","L","O"},
            {"L","O","L","L","L","O","L","L"},
            {"L","L","O","L","L","L","L","O"}
        };
        String[] letrasAssentos = {"A", "B", "C", "D", "E", "F", "G", "H"};
        int[] numeroAssentos = {1, 2, 3, 4, 5, 6, 7, 8};
        int i, j, k, filmeEscolha, numeroEscolhido, quantosAssentos = 0;
        boolean sair = false, pedidoFinalizado;
        String letraEscolhida;
        String[] assentosEscolhidos = new String[20];
        Scanner leia = new Scanner(System.in);

        while(!sair == true){
            System.out.println("Filmes em cartaz: ");
            System.out.println("1 - Minecraft: o filme");
            System.out.println("2 - Long Legs");
            System.out.println("3 - Backrooms");
            System.out.println("4 - The Amazing Digital Circus");
            System.out.println("Digite o numero de qual filem deseja ver");
            filmeEscolha = leia.nextInt();

            switch (filmeEscolha){
                case 1 -> {

                    //faz a primeira linha sendo o indice dos numeros das cadeiras
                    System.out.print("\t");
                    for(j = 0; j < numeroAssentos.length; j++){
                        System.out.print(numeroAssentos[j] + "\t");
                    }
                    System.out.println();

                    //exibe as cadeiras e as colunas sendo o indice das letras das cadeiras
                    for(i = 0; i < minecraft.length; i++){
                        System.out.print(letrasAssentos[i] + "\t");
                        for(j = 0; j < minecraft[i].length; j++){
                            System.out.print(minecraft[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    do{
                    System.out.println("Qual a letra do assento desejado?");
                    letraEscolhida = leia.next().toUpperCase();

                    System.out.println("Qual o numero do assento desejado?");
                    numeroEscolhido = leia.nextInt();

                    System.out.println("Assentos escolhidos:");

                    int linha = letraEscolhida.charAt(0) - 'A';
                    int coluna = numeroEscolhido - 1;

                    // Verifica se o assento existe
                    if(linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8){

                        // Verifica disponibilidade
                        if(minecraft[linha][coluna].equals("L")){

                            System.out.println("Assento reservado com sucesso!");

                            // Armazena no vetor
                            assentosEscolhidos[quantosAssentos] = letraEscolhida + String.valueOf(numeroEscolhido);
                            quantosAssentos++;

                            // Marca como ocupado
                            minecraft[linha][coluna] = "O";

                            System.out.println("Assentos escolhidos: ");
                            for(k = 0; k < quantosAssentos; k++){
                                System.out.println(assentosEscolhidos[k]);
                            }

                        }else{
                            System.out.println("Assento ocupado!");

                        }

                    }else{

                        System.out.println("Assento invalido!");

                    }

                    // Exibe a sala atualizada
                    System.out.println("Sala atualizada:");

                    System.out.print("\t");
                    for(j = 0; j < numeroAssentos.length; j++){
                        System.out.print(numeroAssentos[j] + "\t");
                    }
                    System.out.println();

                    for(i = 0; i < minecraft.length; i++){
                        System.out.print(letrasAssentos[i] + "\t");

                        for(j = 0; j < minecraft[i].length; j++){
                            System.out.print(minecraft[i][j] + "\t");
                        }

                        System.out.println();
                    }

                    System.out.println("Pedido finalizado? digite true ou false");
                    pedidoFinalizado = leia.nextBoolean();
                    }while(!pedidoFinalizado);

                }
                case 2 -> {
                    
                    //faz a primeira linha sendo o indice dos numeros das cadeiras
                    System.out.print("\t");
                    for(j = 0; j < numeroAssentos.length; j++){
                        System.out.print(numeroAssentos[j] + "\t");
                    }
                    System.out.println();

                    //exibe as cadeiras e as colunas sendo o indice das letras das cadeiras
                    for(i = 0; i < longLegs.length; i++){
                        System.out.print(letrasAssentos[i] + "\t");
                        for(j = 0; j < longLegs[i].length; j++){
                            System.out.print(longLegs[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    do{
                    System.out.println("Qual a letra do assento desejado?");
                    letraEscolhida = leia.next().toUpperCase();

                    System.out.println("Qual o numero do assento desejado?");
                    numeroEscolhido = leia.nextInt();

                    System.out.println("Assentos escolhidos:");

                    int linha = letraEscolhida.charAt(0) - 'A';
                    int coluna = numeroEscolhido - 1;

                    // Verifica se o assento existe
                    if(linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8){

                        // Verifica disponibilidade
                        if(minecraft[linha][coluna].equals("L")){

                            System.out.println("Assento reservado com sucesso!");

                            // Armazena no vetor
                            assentosEscolhidos[quantosAssentos] = letraEscolhida + String.valueOf(numeroEscolhido);
                            quantosAssentos++;

                            // Marca como ocupado
                            minecraft[linha][coluna] = "O";

                            System.out.println("Assentos escolhidos: ");
                            for(k = 0; k < quantosAssentos; k++){
                                System.out.println(assentosEscolhidos[k]);
                            }

                        }else{
                            System.out.println("Assento ocupado!");

                        }

                    }else{

                        System.out.println("Assento invalido!");

                    }

                    // Exibe a sala atualizada
                    System.out.println("Sala atualizada:");

                    System.out.print("\t");
                    for(j = 0; j < numeroAssentos.length; j++){
                        System.out.print(numeroAssentos[j] + "\t");
                    }
                    System.out.println();

                    for(i = 0; i < minecraft.length; i++){
                        System.out.print(letrasAssentos[i] + "\t");

                        for(j = 0; j < minecraft[i].length; j++){
                            System.out.print(minecraft[i][j] + "\t");
                        }

                        System.out.println();
                    }

                    System.out.println("Pedido finalizado? digite true ou false");
                    pedidoFinalizado = leia.nextBoolean();
                    }while(!pedidoFinalizado);

                }
                case 3 -> {
                    
                    //faz a primeira linha sendo o indice dos numeros das cadeiras
                    System.out.print("\t");
                    for(j = 0; j < numeroAssentos.length; j++){
                        System.out.print(numeroAssentos[j] + "\t");
                    }
                    System.out.println();

                    //exibe as cadeiras e as colunas sendo o indice das letras das cadeiras
                    for(i = 0; i < backrooms.length; i++){
                        System.out.print(letrasAssentos[i] + "\t");
                        for(j = 0; j < backrooms[i].length; j++){
                            System.out.print(backrooms[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    do{
                    System.out.println("Qual a letra do assento desejado?");
                    letraEscolhida = leia.next().toUpperCase();

                    System.out.println("Qual o numero do assento desejado?");
                    numeroEscolhido = leia.nextInt();

                    System.out.println("Assentos escolhidos:");

                    int linha = letraEscolhida.charAt(0) - 'A';
                    int coluna = numeroEscolhido - 1;

                    // Verifica se o assento existe
                    if(linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8){

                        // Verifica disponibilidade
                        if(minecraft[linha][coluna].equals("L")){

                            System.out.println("Assento reservado com sucesso!");

                            // Armazena no vetor
                            assentosEscolhidos[quantosAssentos] = letraEscolhida + String.valueOf(numeroEscolhido);
                            quantosAssentos++;

                            // Marca como ocupado
                            minecraft[linha][coluna] = "O";

                            System.out.println("Assentos escolhidos: ");
                            for(k = 0; k < quantosAssentos; k++){
                                System.out.println(assentosEscolhidos[k]);
                            }

                        }else{
                            System.out.println("Assento ocupado!");

                        }

                    }else{

                        System.out.println("Assento invalido!");

                    }

                    // Exibe a sala atualizada
                    System.out.println("Sala atualizada:");

                    System.out.print("\t");
                    for(j = 0; j < numeroAssentos.length; j++){
                        System.out.print(numeroAssentos[j] + "\t");
                    }
                    System.out.println();

                    for(i = 0; i < minecraft.length; i++){
                        System.out.print(letrasAssentos[i] + "\t");

                        for(j = 0; j < minecraft[i].length; j++){
                            System.out.print(minecraft[i][j] + "\t");
                        }

                        System.out.println();
                    }

                    System.out.println("Pedido finalizado? digite true ou false");
                    pedidoFinalizado = leia.nextBoolean();
                    }while(!pedidoFinalizado);

                }
                case 4 -> {
                    
                    //faz a primeira linha sendo o indice dos numeros das cadeiras
                    System.out.print("\t");
                    for(j = 0; j < numeroAssentos.length; j++){
                        System.out.print(numeroAssentos[j] + "\t");
                    }
                    System.out.println();

                    //exibe as cadeiras e as colunas sendo o indice das letras das cadeiras
                    for(i = 0; i < theAmazingDigitalCircus.length; i++){
                        System.out.print(letrasAssentos[i] + "\t");
                        for(j = 0; j < theAmazingDigitalCircus[i].length; j++){
                            System.out.print(theAmazingDigitalCircus[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    do{
                    System.out.println("Qual a letra do assento desejado?");
                    letraEscolhida = leia.next().toUpperCase();

                    System.out.println("Qual o numero do assento desejado?");
                    numeroEscolhido = leia.nextInt();

                    System.out.println("Assentos escolhidos:");

                    int linha = letraEscolhida.charAt(0) - 'A';
                    int coluna = numeroEscolhido - 1;

                    // Verifica se o assento existe
                    if(linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8){

                        // Verifica disponibilidade
                        if(minecraft[linha][coluna].equals("L")){

                            System.out.println("Assento reservado com sucesso!");

                            // Armazena no vetor
                            assentosEscolhidos[quantosAssentos] = letraEscolhida + String.valueOf(numeroEscolhido);
                            quantosAssentos++;

                            // Marca como ocupado
                            minecraft[linha][coluna] = "O";

                            System.out.println("Assentos escolhidos: ");
                            for(k = 0; k < quantosAssentos; k++){
                                System.out.println(assentosEscolhidos[k]);
                            }

                        }else{
                            System.out.println("Assento ocupado!");

                        }

                    }else{

                        System.out.println("Assento invalido!");

                    }

                    // Exibe a sala atualizada
                    System.out.println("Sala atualizada:");

                    System.out.print("\t");
                    for(j = 0; j < numeroAssentos.length; j++){
                        System.out.print(numeroAssentos[j] + "\t");
                    }
                    System.out.println();

                    for(i = 0; i < minecraft.length; i++){
                        System.out.print(letrasAssentos[i] + "\t");

                        for(j = 0; j < minecraft[i].length; j++){
                            System.out.print(minecraft[i][j] + "\t");
                        }

                        System.out.println();
                    }

                    System.out.println("Pedido finalizado? digite true ou false");
                    pedidoFinalizado = leia.nextBoolean();
                    }while(!pedidoFinalizado);
                    
                }
                default -> System.out.println("Valor digitado nao esperado, digite um valor valido");
            }

            System.out.println("Digite true caso queira sair do programa, caso deseja continuar utilizando digite false: ");
            sair = leia.nextBoolean();
        }

        System.out.println("Programa encerrado!");
        
    }
}