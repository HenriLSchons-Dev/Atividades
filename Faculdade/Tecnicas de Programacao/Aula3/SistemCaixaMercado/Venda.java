import java.util.Scanner;
public class Venda{
    public static void main(String[] agrs){
        Scanner leia = new Scanner(System.in);
        Produto[] estoque = new Produto[5];
        estoque[0] = new Produto(101, "Arroz", 6.99, 9, "cesta basica");
        estoque[1] = new Produto(102, "Feijao", 7.99, 8, "cesta basica");
        estoque[2] = new Produto(302, "Detergente", 9.99, 11, "produto de limpeza");
        estoque[3] = new Produto(509, "Doritos", 8.99, 21, "outro");
        estoque[4] = new Produto(607, "RedBull", 12.50, 6, "Bebida");

        Produto[] carrinho = new Produto[5];

        double impostosTotais;
        double subTotal;
        double valorPago;
        int id;
        String nomeProduto;
        double preco;
        int emEstoque;
        String categ;
        int posicao;
        int menu;

        do {
            System.out.println("-------------MENU---------------");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar carrinho");
            System.out.println("3 - Emitir cupom fiscal");
            System.out.println("0 - Sair");
            System.out.println("--------------------------------");
            menu = leia.nextInt();
            leia.nextLine();

            switch (menu) {
                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                case 1:
                    System.out.println("Informe a posição do produto (0 a 19): ");
                    posicao = leia.nextInt();
                    leia.nextLine();

                    if (posicao >= 0 && posicao < 20) {
                        System.out.println("Informe o codigo do produto: ");
                        id = leia.nextInt();
                        leia.nextLine();

                        System.out.println("Informe o nome do produto: ");
                        nomeProduto = leia.nextLine();

                        System.out.println("Informe o preço do produto: ");
                        preco = leia.nextDouble();
                        leia.nextLine();

                        System.out.println("Informe a quantidade em estoque do produto: ");
                        emEstoque = leia.nextInt();
                        leia.nextLine();

                        System.out.println("Informe a categoria desse produto: ");
                        categ = leia.nextLine();

                        estoque[posicao] = new Produto(id, nomeProduto, preco, emEstoque, categ);

                        System.out.println("Produto cadastrado com sucesso!");

                    } else {
                        System.out.println("Erro: Digite uma posição válida!");
                    }
                    break;

                case 2:
                    System.out.println("Produtos no carrinho: ");

                    for (int i = 0; i < 20; i++) {
                        if (carrinho[i] != null) {
                            System.out.println("\nPosicao: " + i);
                            System.out.println("ID #" + carrinho[i].getCodigo());
                            System.out.println("Nome: " + carrinho[i].getNome());
                            System.out.println("Preco: R$ " + carrinho[i].getPreco());
                            System.out.println("Quantidade: " + carrinho[i].getEstoque());
                            System.out.println("Categoria: " + carrinho[i].getCategoria());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Informe a posição do produto que deseja alterar (0 a 9): ");
                    posicao = leia.nextInt();
                    leia.nextLine();

                    if (posicao >= 0 && posicao <= 9 && carrinho[posicao] != null) {
                        System.out.println("Qual informação deseja alterar?");
                        System.out.println("1 - Nome");
                        System.out.println("2 - Preço");
                        System.out.println("3 - Quantidade");
                        alt = leia.nextInt();
                        leia.nextLine();

                        switch (alt) {
                            case 1:
                                System.out.println("Informe o novo nomeProduto: ");
                                nomeProduto = leia.nextLine();

                                carrinho[posicao].setNome(nomeProduto);
                                break;

                            case 2:
                                System.out.println("Informe o novo preço: ");
                                preco = leia.nextDouble();
                                leia.nextLine();

                                carrinho[posicao].setPreco(preco);
                                break;

                            case 3:
                                System.out.println("Informe a nova quantidade: ");
                                quantidade = leia.nextInt();
                                leia.nextLine();

                                carrinho[posicao].setQuantidade(quantidade);
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