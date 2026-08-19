import java.util.Scanner;
public class Cadastro{
    public static void main(String[] agrs){
        Scanner leia = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[10];

        String nome, cpf;
        boolean contrato;
        int menu, posicao, alt;

        do { 
            System.out.println("-------------MENU---------------");
            System.out.println("1 - Cadastrar funcionario");
            System.out.println("2 - Listar funcionarios");
            System.out.println("3 - Alterar uma informação de um funcionario cadastrado");
            System.out.println("0 - Sair");
            System.out.println("================================");
            menu = leia.nextInt();
            leia.nextLine();

            switch (menu){
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                
                case 1:
                    System.out.println("Informe a posição de cadastro do funcionario (0 a 9): ");
                    posicao = leia.nextInt();
                    leia.nextLine();

                    if (posicao >= 0 && posicao < 10) {

                        System.out.println("Informe o nome do funcionario: ");
                        nome = leia.nextLine();

                        System.out.println("Informe o cpf: ");
                        cpf = leia.nextLine();

                        System.out.println("Contarto valido: ");
                        contrato = leia.nextBoolean();
                        leia.nextLine();

                        funcionarios[posicao] = new Funcionario(nome, cpf, contrato);

                        System.out.println("Funcionario cadastrado com sucesso!");

                    } else {
                        System.out.println("Erro: Digite uma posição válida!");
                    }
                    break;

                case 2:
                    System.out.println("Funcionarios cadastrados: ");

                    for(int i = 0; i < 10; i++){
                        if (funcionarios[i] != null) {

                            System.out.println("\nPosicao: " + i);
                            System.out.println("Nome: " + funcionarios[i].getNome());
                            System.out.println("cpf: " + funcionarios[i].getCpf());
                            System.out.println("Quantidade: " + funcionarios[i].isContratado());
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("Informe a posição do funcionario que deseja alterar (0 a 9): ");
                    posicao = leia.nextInt();
                    leia.nextLine();

                    if (posicao >= 0 && posicao <= 9 && funcionarios[posicao] != null) {
                        System.out.println("Qual informação deseja alterar?");
                        System.out.println("1 - Nome");
                        System.out.println("2 - CPF");
                        System.out.println("3 - Contrato");
                        alt = leia.nextInt();
                        leia.nextLine();

                        switch (alt) {
                            case 1:
                                System.out.println("Informe o novo nome: ");
                                nome = leia.nextLine();

                                funcionarios[posicao].setNome(nome);
                                break;

                            case 2:
                                System.out.println("Informe o novo CPF: ");
                                cpf = leia.nextLine();

                                funcionarios[posicao].setCpf(cpf);
                                break;

                            case 3:
                                System.out.println("Informe o novo estado do contrato: ");
                                contrato = leia.nextBoolean();
                                leia.nextLine();

                                funcionarios[posicao].setContratado(contrato);
                                break;

                            default:
                                System.out.println("Erro: Digite uma opção válida!");
                        }
                    } else {
                        System.out.println("Funcionario não encontrado!");
                    }
                    break;
                
                default:
                    System.out.println("Erro: Digite um numero valido!");
            }
        } while (menu != 0);
    }
}