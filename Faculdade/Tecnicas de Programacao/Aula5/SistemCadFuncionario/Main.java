import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List<Fornecedor> fornecedores = new ArrayList<>();

        int menu;

        do {

            System.out.println("========================================================");
            System.out.println("                 CADASTRO DE FORNECEDOR                ");
            System.out.println("========================================================");

            System.out.println("1 - Cadastrar fornecedor");
            System.out.println("2 - Exibir fornecedores");
            System.out.println("3 - Testar CNPJ");
            System.out.println("4 - Testar cadastro válido");
            System.out.println("0 - Encerrar sistema");
            System.out.println("========================================================");

            System.out.print("Escolha uma opção: ");
            menu = leia.nextInt();
            leia.nextLine();

            switch (menu) {

                case 1:

                    System.out.println("========================================================");
                    System.out.println("                 CADASTRO DE FORNECEDOR                ");
                    System.out.println("========================================================");

                    System.out.print("Informe o código: ");
                    int codigo = leia.nextInt();
                    leia.nextLine();

                    System.out.print("Informe a razão social: ");
                    String razaoSocial = leia.nextLine();

                    System.out.print("Informe o nome fantasia: ");
                    String nomeFantasia = leia.nextLine();

                    System.out.print("Informe o CNPJ: ");
                    String cnpj = leia.nextLine();

                    System.out.print("Informe o e-mail: ");
                    String email = leia.nextLine();

                    System.out.print("Informe o telefone: ");
                    String telefone = leia.nextLine();

                    Fornecedor fornecedor = new Fornecedor(codigo, razaoSocial, nomeFantasia, cnpj, email, telefone);

                    fornecedores.add(fornecedor);

                    System.out.println("========================================================");
                    System.out.println("                 Fornecedor cadastrado!                 ");
                    System.out.println("========================================================");

                    break;

                case 2:

                    System.out.println("========================================================");
                    System.out.println("                FORNECEDORES CADASTRADOS               ");
                    System.out.println("========================================================");

                    if (fornecedores.isEmpty()) {

                        System.out.println("Nenhum fornecedor cadastrado.");

                    } else {

                        for (Fornecedor f : fornecedores) {

                            f.exibirDados();

                            System.out.println("----------------------------");
                        }
                    }

                    break;

                case 3:

                    System.out.println("========================================================");
                    System.out.println("                    TESTE DE CNPJ                       ");
                    System.out.println("========================================================");

                    System.out.print("Informe um CNPJ para validar: ");
                    String cnpjTeste = leia.nextLine();

                    Fornecedor teste = new Fornecedor();

                    if (teste.validarCNPJ(cnpjTeste)) {
                        System.out.println("CNPJ válido!");
                    } else {
                        System.out.println("CNPJ inválido!");
                    }

                    break;

                case 4:

                    System.out.println("========================================================");
                    System.out.println("                 TESTE DE CADASTRO                      ");
                    System.out.println("========================================================");

                    if (fornecedores.isEmpty()) {

                        System.out.println("Nenhum fornecedor cadastrado.");

                    } else {

                        Fornecedor ultimoFornecedor =
                                fornecedores.get(fornecedores.size() - 1);

                        if (ultimoFornecedor.cadastroValido()) {
                            System.out.println("Cadastro válido!");
                        } else {
                            System.out.println("Cadastro possui dados inválidos.");
                        }
                    }

                    break;

                case 0:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");

                    break;
            }

        } while (menu != 0);
    }
}