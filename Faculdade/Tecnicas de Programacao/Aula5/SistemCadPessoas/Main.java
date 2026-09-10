import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        int menu;

        do {

            System.out.println("========================================================");
            System.out.println("                 CADASTRO DE PESSOAS                   ");
            System.out.println("========================================================");

            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Exibir pessoas");
            System.out.println("3 - Testar CPF");
            System.out.println("0 - Encerrar sistema");
            System.out.println("========================================================");

            System.out.print("Escolha uma opção: ");
            menu = leia.nextInt();
            leia.nextLine();

            switch (menu) {

                case 1:

                    System.out.println("========================================================");
                    System.out.println("                 CADASTRO DE PESSOA                     ");
                    System.out.println("========================================================");

                    System.out.print("Informe o ID: ");
                    int id = leia.nextInt();
                    leia.nextLine();

                    System.out.print("Informe o nome: ");
                    String nome = leia.nextLine();

                    System.out.print("Informe o CPF: ");
                    String cpf = leia.nextLine();

                    System.out.print("Informe o e-mail: ");
                    String email = leia.nextLine();

                    System.out.print("Informe o telefone (11 dígitos): ");
                    String telefone = leia.nextLine();

                    Pessoa pessoa = new Pessoa(cpf, email, id, nome, telefone);

                    pessoas.add(pessoa);

                    System.out.println("========================================================");
                    System.out.println("                  Pessoa cadastrada!                    ");
                    System.out.println("========================================================");

                    break;

                case 2:

                    System.out.println("========================================================");
                    System.out.println("                 PESSOAS CADASTRADAS                   ");
                    System.out.println("========================================================");

                    if (pessoas.isEmpty()) {

                        System.out.println("Nenhuma pessoa cadastrada.");

                    } else {

                        for (Pessoa p : pessoas) {

                            p.exibirDados();

                            System.out.println("----------------------------");
                        }
                    }

                    break;

                case 3:

                    System.out.println("========================================================");
                    System.out.println("                    TESTE DE CPF                        ");
                    System.out.println("========================================================");

                    System.out.print("Informe um CPF para validar: ");
                    String cpfTeste = leia.nextLine();

                    Pessoa teste = new Pessoa();

                    if (teste.validarCPF(cpfTeste)) {
                        System.out.println("CPF válido!");
                    } else {
                        System.out.println("CPF inválido!");
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