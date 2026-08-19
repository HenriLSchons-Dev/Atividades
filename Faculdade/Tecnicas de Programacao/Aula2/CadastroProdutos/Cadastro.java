import java.util.Scanner;
public class Cadastro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Produto[] produtos = new Produto[10];

        String nome;
        double preco;
        int quantidade;
        int menu, alt, posicao;

        do {
            System.out.println("-------------MENU---------------");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Alterar uma informação de um produto");
            System.out.println("0 - Sair");
            System.out.println("================================");
            menu = leia.nextInt();
            leia.nextLine();

            switch (menu) {
                case 0:
                    break;

                case 1:
                    System.out.println("Informe a posição do produto (0 a 9): ");
                    posicao = leia.nextInt();
                    leia.nextLine();

                    if (posicao >= 0 && posicao < 10) {

                        System.out.println("Informe o nome do produto: ");
                        nome = leia.nextLine();

                        System.out.println("Informe o preço do produto: ");
                        preco = leia.nextDouble();

                        System.out.println("Informe a quantidade em estoque do produto: ");
                        quantidade = leia.nextInt();
                        leia.nextLine();

                        produtos[posicao] = new Produto(nome, preco, quantidade);

                        System.out.println("Produto cadastrado com sucesso!");

                    } else {
                        System.out.println("Erro: Digite uma posição válida!");
                    }
                    break;

                case 2:
                    System.out.println("Produtos armazenados: ");

                    for (int i = 0; i < 10; i++) {

                        if (produtos[i] != null) {

                            System.out.println("\nPosicao: " + i);
                            System.out.println("Nome: " + produtos[i].getNome());
                            System.out.println("Preco: R$ " + produtos[i].getPreco());
                            System.out.println("Quantidade: " + produtos[i].getQuantidade());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Informe a posição do produto que deseja alterar (0 a 9): ");
                    posicao = leia.nextInt();
                    leia.nextLine();

                    if (posicao >= 0 && posicao <= 9 && produtos[posicao] != null) {
                        System.out.println("Qual informação deseja alterar?");
                        System.out.println("1 - Nome");
                        System.out.println("2 - Preço");
                        System.out.println("3 - Quantidade");
                        alt = leia.nextInt();
                        leia.nextLine();

                        switch (alt) {
                            case 1:
                                System.out.println("Informe o novo nome: ");
                                nome = leia.nextLine();

                                produtos[posicao].setNome(nome);
                                break;

                            case 2:
                                System.out.println("Informe o novo preço: ");
                                preco = leia.nextDouble();
                                leia.nextLine();

                                produtos[posicao].setPreco(preco);
                                break;

                            case 3:
                                System.out.println("Informe a nova quantidade: ");
                                quantidade = leia.nextInt();
                                leia.nextLine();

                                produtos[posicao].setQuantidade(quantidade);
                                break;

                            default:
                                System.out.println("Erro: Digite uma opção válida!");
                        }
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                default:
                    System.out.println("Erro: Digite uma opção válida!");
            }
        } while (menu != 0);
    }
}