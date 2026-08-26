import java.util.Scanner;
public class Venda {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Produto[] estoque = new Produto[5];
        estoque[0] = new Produto(101, "Arroz", 6.99, 9, "cesta basica");
        estoque[1] = new Produto(102, "Feijao", 7.99, 8, "cesta basica");
        estoque[2] = new Produto(302, "Detergente", 9.99, 11, "produto de limpeza");
        estoque[3] = new Produto(509, "Doritos", 8.99, 21, "outro");
        estoque[4] = new Produto(607, "RedBull", 12.50, 6, "bebida");

        Produto[] carrinho = new Produto[20];
        int[] quantidadeCarrinho = new int[20];
        
        int idEscolhido;
        int posicaoProduto = -1;
        int itensCarrinho = 0;
        int opcao;
        double valorPago;

        do {
            System.out.println("\n===== FRENTE DE CAIXA =====");
            System.out.println("1 - Ver produtos");
            System.out.println("2 - Adicionar produto ao carrinho");
            System.out.println("3 - Finalizar compra");
            System.out.println("0 - Sair");
            System.out.println("==============================");

            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("\n===== PRODUTOS DISPONÍVEIS =====");

                    for (int i = 0; i < estoque.length; i++) {
                        System.out.println("\nCódigo: " + estoque[i].getCodigo());
                        System.out.println("Nome: " + estoque[i].getNome());
                        System.out.println("Preço: R$ " + estoque[i].getPreco());
                        System.out.println("Estoque: " + estoque[i].getEstoque());
                        System.out.println("Categoria: " + estoque[i].getCategoria());
                    }

                    break;


                case 2:

                    System.out.print("Digite o código do produto desejado: ");
                    idEscolhido = leia.nextInt();

                    posicaoProduto = 0;

                    for (int i = 0; i < estoque.length; i++) {

                        if (estoque[i].getCodigo() == idEscolhido) {
                            posicaoProduto = i;
                            break;
                        }
                    }

                    if (posicaoProduto == -1) {
                        System.out.println("Produto não encontrado!");

                    } else {
                        System.out.print("Digite a quantidade desejada: ");
                        int quantidade = leia.nextInt();

                        if (estoque[posicaoProduto].darBaixa(quantidade)) {

                            carrinho[itensCarrinho] = estoque[posicaoProduto];

                            quantidadeCarrinho[itensCarrinho] = quantidade;

                            itensCarrinho++;

                            System.out.println("Produto adicionado ao carrinho!");

                        } else {

                            System.out.println("Estoque insuficiente!");
                        }
                    }
                    break;

                case 3:

                    if (itensCarrinho == 0) {
                        System.out.println("O carrinho está vazio!");
                        break;
                    }

                    double subtotal = 0;
                    double impostosTotais = 0;
                    
                    System.out.println("\n==========================================");
                    System.out.println("CUPOM FISCAL - SUPERMERCADO");
                    System.out.println("==========================================");
                    System.out.println("Item | Nome | Qtd | Pr.Unit | Total");
                    System.out.println("------------------------------------------");

                    for (int i = 0; i < itensCarrinho; i++) {
                        double totalItem =  carrinho[i].getPreco() * quantidadeCarrinho[i];
                        double impostoItem = carrinho[i].calcularImposto() * quantidadeCarrinho[i];

                        subtotal += totalItem;

                        impostosTotais += impostoItem;

                        System.out.println( (i + 1) + " | " + carrinho[i].getNome() + " | " + quantidadeCarrinho[i] + " | R$ " + carrinho[i].getPreco() + " | R$ " + totalItem);
                    }

                    System.out.println("------------------------------------------");
                    System.out.println("SUBTOTAL: R$" + subtotal);
                    System.out.println("TOTAL DE IMPOSTOS: R$" + impostosTotais);
                    System.out.println("TOTAL A PAGAR: R$" + subtotal);
                    System.out.println("Digite o valor recebido: R$ ");
                    valorPago = leia.nextDouble();

                    if (valorPago < subtotal) {
                        System.out.println(
                                "Saldo insuficiente!"
                        );

                    } else {
                        double troco = valorPago - subtotal;
                        System.out.printf(
                                "TROCO: R$" + troco);
                    }
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println(
                            "Opção inválida!"
                    );
            }
        } while (opcao != 0);
    }
}