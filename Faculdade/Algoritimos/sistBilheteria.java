import java.util.Scanner;
/**
 * 
 * @author Henri Lopes Schons e Joao Pedro Sapalacio
 */
public class sistBilheteria{
    public static void main(String[] args) {
        String[][] minecraft1 = {
            {"L","L","O","L","L","O","L","L"},
            {"O","L","L","L","O","L","L","L"},
            {"L","O","L","L","L","L","O","L"},
            {"L","L","L","O","L","L","L","O"},
            {"O","L","L","L","L","O","L","L"},
            {"L","L","O","L","L","L","L","O"},
            {"L","O","L","L","O","L","L","L"},
            {"L","L","L","O","L","L","O","L"}
        };//ocupado: 16 inteiras
        String[][] minecraft2 = {
            {"O","L","L","O","L","L","L","O"},
            {"L","L","O","L","L","O","L","L"},
            {"L","O","L","L","L","L","O","L"},
            {"O","L","L","L","O","L","L","L"},
            {"L","L","O","L","L","L","L","O"},
            {"L","O","L","L","O","L","L","L"},
            {"L","L","L","O","L","L","O","L"},
            {"O","L","L","L","L","O","L","L"}
        };//ocupado: 17 inteiras
        String[][] backrooms = {
            {"L","O","L","L","L","O","L","L"},
            {"L","L","L","O","L","L","O","L"},
            {"O","L","L","L","L","O","L","L"},
            {"L","L","O","L","L","L","L","O"},
            {"L","O","L","L","O","L","L","L"},
            {"L","L","L","O","L","L","O","L"},
            {"O","L","L","L","L","L","L","O"},
            {"L","L","O","L","L","O","L","L"}
        };//ocupado: 16 inteiras
        String[] letrasAssentos = {"A", "B", "C", "D", "E", "F", "G", "H"};
        int[] numeroAssentos = {1, 2, 3, 4, 5, 6, 7, 8};
        int i, j, k, filmeEscolha, sessao,totalSala1 = 480, totalSala2 = 510, totalSala3 = 480, numeroEscolhido, tipoIngresso;
        boolean sair = false, pedidoFinalizado;
        String letraEscolhida;
        String[] assentosEscolhidos = new String[20];
        Scanner leia = new Scanner(System.in);

        //obs: algumas funções usadas eu não conhecia, usei o site 'Stack Overflow' para pesquisar e entender sobre essas funcones que usei

        while(!sair){
            System.out.println("Filmes em cartaz: ");
            System.out.println("1 - Minecraft: o filme");
            System.out.println("2 - Backrooms");
            System.out.println("Digite o numero de qual filme deseja ver");
            filmeEscolha = leia.nextInt();

            switch (filmeEscolha){
                case 1 -> {
                    System.out.println("Sessoes disponiveis hoje: ");
                    System.out.println("1 - sessao as 14:20");
                    System.out.println("2 _ sessao as 16:50");
                    sessao = leia.nextInt();

                    switch(sessao){
                        case 1 ->{
                            int valorCompra = 0;
                            int quantosAssentos = 0;

                            //faz a primeira linha sendo o indice dos numeros das cadeiras
                            System.out.print("\t");
                            for(j = 0; j < numeroAssentos.length; j++){
                                System.out.print(numeroAssentos[j] + "\t");
                            }
                            System.out.println();

                            //exibe as cadeiras e as colunas sendo o indice das letras das cadeiras
                            for(i = 0; i < minecraft1.length; i++){
                                System.out.print(letrasAssentos[i] + "\t");
                                for(j = 0; j < minecraft1[i].length; j++){
                                    System.out.print(minecraft1[i][j] + "\t");
                                }
                                System.out.println();
                            }

                            do{
                            System.out.println("Qual a letra do assento desejado?");
                            letraEscolhida = leia.next().toUpperCase();

                            System.out.println("Qual o numero do assento desejado?");
                            numeroEscolhido = leia.nextInt();

                            int linha = letraEscolhida.charAt(0) - 'A';
                            int coluna = numeroEscolhido - 1;

                            // Verifica se o assento existe
                            if(linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8){

                                // Verifica disponibilidade
                                if(minecraft1[linha][coluna].equals("L")){
                                    System.out.println("Tipo do ingresso:");
                                    System.out.println("1 - Inteira (R$30,00)");
                                    System.out.println("2 - Meia (R$15,00)");

                                    tipoIngresso = leia.nextInt();
                                    
                                    boolean ingressoValido = false;

                                    switch(tipoIngresso){
                                        case 1 ->{
                                            valorCompra += 30;
                                            totalSala1 += 30;
                                            ingressoValido = true;
                                            System.out.println("Ingresso inteira adicionada.");
                                        }
                                        case 2 ->{
                                            valorCompra += 15;
                                            totalSala1 += 15;
                                            ingressoValido = true;
                                            System.out.println("Ingresso meia adicionada.");
                                        }
                                        default -> System.out.println("Tipo de ingresso invalido!");
                                    }

                                    if(ingressoValido){

                                        System.out.println("Assento reservado com sucesso!");

                                        // Armazena no vetor
                                        assentosEscolhidos[quantosAssentos] = letraEscolhida + numeroEscolhido;
                                        quantosAssentos++;

                                        // Marca como ocupado
                                        minecraft1[linha][coluna] = "O";

                                        System.out.println("Assentos escolhidos:");
                                        for(k = 0; k < quantosAssentos; k++){
                                            System.out.println(assentosEscolhidos[k]);
                                        }

                                        System.out.println("Assento " + letraEscolhida + numeroEscolhido + " reservado com sucesso!");
                                        System.out.println("Valor total da compra: R$" + valorCompra);
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

                            for(i = 0; i < minecraft1.length; i++){
                                System.out.print(letrasAssentos[i] + "\t");

                                for(j = 0; j < minecraft1[i].length; j++){
                                    System.out.print(minecraft1[i][j] + "\t");
                                }

                                System.out.println();
                            }
                            System.out.println();

                            System.out.println("Pedido finalizado? digite true ou false");
                            pedidoFinalizado = leia.nextBoolean();
                            }while(!pedidoFinalizado);

                        }
                        case 2 ->{
                            int valorCompra = 0;
                            int quantosAssentos = 0;

                            //faz a primeira linha sendo o indice dos numeros das cadeiras
                            System.out.print("\t");
                            for(j = 0; j < numeroAssentos.length; j++){
                                System.out.print(numeroAssentos[j] + "\t");
                            }
                            System.out.println();

                            //exibe as cadeiras e as colunas sendo o indice das letras das cadeiras
                            for(i = 0; i < minecraft2.length; i++){
                                System.out.print(letrasAssentos[i] + "\t");
                                for(j = 0; j < minecraft2[i].length; j++){
                                    System.out.print(minecraft2[i][j] + "\t");
                                }
                                System.out.println();
                            }

                            do{
                            System.out.println("Qual a letra do assento desejado?");
                            letraEscolhida = leia.next().toUpperCase();

                            System.out.println("Qual o numero do assento desejado?");
                            numeroEscolhido = leia.nextInt();

                            int linha = letraEscolhida.charAt(0) - 'A';
                            int coluna = numeroEscolhido - 1;

                            // Verifica se o assento existe
                            if(linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8){

                                // Verifica disponibilidade
                                if(minecraft2[linha][coluna].equals("L")){
                                    System.out.println("Tipo do ingresso:");
                                    System.out.println("1 - Inteira (R$30,00)");
                                    System.out.println("2 - Meia (R$15,00)");

                                    tipoIngresso = leia.nextInt();
                                    boolean ingressoValido = false;
                                    
                                    switch(tipoIngresso){
                                        case 1 ->{
                                            valorCompra += 30;
                                            totalSala2 += 30;
                                            ingressoValido = true;
                                            System.out.println("Ingresso inteira adicionada.");
                                        }
                                        case 2 ->{
                                            valorCompra += 15;
                                            totalSala2 += 15;
                                            ingressoValido = true;
                                            System.out.println("Ingresso meia adicionada.");
                                        }
                                        default -> System.out.println("Tipo de ingresso invalido!");
                                    }

                                    if(ingressoValido){

                                        System.out.println("Assento reservado com sucesso!");

                                        // Armazena no vetor
                                        assentosEscolhidos[quantosAssentos] = letraEscolhida + numeroEscolhido;
                                        quantosAssentos++;

                                        // Marca como ocupado
                                        minecraft2[linha][coluna] = "O";

                                        System.out.println("Assentos escolhidos:");
                                        for(k = 0; k < quantosAssentos; k++){
                                            System.out.println(assentosEscolhidos[k]);
                                        }

                                        System.out.println("Assento " + letraEscolhida + numeroEscolhido + " reservado com sucesso!");
                                        System.out.println("Valor total da compra: R$" + valorCompra);
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

                            for(i = 0; i < minecraft2.length; i++){
                                System.out.print(letrasAssentos[i] + "\t");

                                for(j = 0; j < minecraft2[i].length; j++){
                                    System.out.print(minecraft2[i][j] + "\t");
                                }

                                System.out.println();
                            }
                            System.out.println();

                            System.out.println("Pedido finalizado? digite true ou false");
                            pedidoFinalizado = leia.nextBoolean();
                            }while(!pedidoFinalizado);

                        }
                        default -> System.out.println("digite um numero valido para selecionar a sessão desejada!");
                    }
                }
                case 2 -> {
                    int valorCompra = 0;
                    int quantosAssentos = 0;

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

                    int linha = letraEscolhida.charAt(0) - 'A';
                    int coluna = numeroEscolhido - 1;

                    // Verifica se o assento existe
                    if(linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8){

                        // Verifica disponibilidade
                        if(backrooms[linha][coluna].equals("L")){
                            System.out.println("Tipo do ingresso:");
                            System.out.println("1 - Inteira (R$30,00)");
                            System.out.println("2 - Meia (R$15,00)");

                            tipoIngresso = leia.nextInt();
                            boolean ingressoValido = false;
                            
                            switch(tipoIngresso){
                                case 1 ->{
                                    valorCompra += 30;
                                    totalSala3 += 30;
                                    ingressoValido = true;
                                    System.out.println("Ingresso inteira adicionada.");
                                }
                                case 2 ->{
                                    valorCompra += 15;
                                    totalSala3 += 15;
                                    ingressoValido = true;
                                    System.out.println("Ingresso meia adicionada.");
                                }
                                default -> System.out.println("Tipo de ingresso invalido!");
                            }

                            if(ingressoValido){

                                System.out.println("Assento reservado com sucesso!");

                                // Armazena no vetor
                                assentosEscolhidos[quantosAssentos] = letraEscolhida + numeroEscolhido;
                                quantosAssentos++;

                                // Marca como ocupado
                                backrooms[linha][coluna] = "O";

                                System.out.println("Assentos escolhidos:");
                                for(k = 0; k < quantosAssentos; k++){
                                    System.out.println(assentosEscolhidos[k]);
                                }

                                System.out.println("Assento " + letraEscolhida + numeroEscolhido + " reservado com sucesso!");
                                System.out.println("Valor total da compra: R$" + valorCompra);
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

                    for(i = 0; i < backrooms.length; i++){
                        System.out.print(letrasAssentos[i] + "\t");

                        for(j = 0; j < backrooms[i].length; j++){
                            System.out.print(backrooms[i][j] + "\t");
                        }

                        System.out.println();
                    }
                    System.out.println();

                    System.out.println("Pedido finalizado? digite true ou false");
                    pedidoFinalizado = leia.nextBoolean();
                    }while(!pedidoFinalizado);

                }
                default -> System.out.println("Valor digitado nao esperado, digite um valor valido");
            }

            System.out.println("Digite true caso queira sair do programa, caso deseja continuar utilizando digite false: ");
            sair = leia.nextBoolean();
        }

        System.out.println("Total arrecadado na sala 1 - Minecraft: $" + totalSala1);
        System.out.println("Total arrecadado na sala 2 - Minecraft: $" + totalSala2);
        System.out.println("Total arrecadado na sala 3 - Backrooms: $" + totalSala3);
        System.out.println("Programa encerrado!");
    }
}