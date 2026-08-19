import java.util.Scanner;
public class Cadastro{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Cliente c1 = new Cliente();

        String n, m;
        int i, menu, alt;

        do { 
            System.out.println("-------------Menu---------------");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Exibir cliente");
            System.out.println("3 - Alterar informação");
            System.out.println("0 - Sair");
            System.out.println("================================");
            menu = leia.nextInt();
            leia.nextLine();

            switch (menu){
                case 0:
                    break;
                case 1:
                    System.out.println("Bem vindo ao cadastro do cliente!");
                    System.out.println("");

                    System.out.println("Informe o nome do cliente: ");
                    n = leia.nextLine();
                    c1.setNome(n);

                    System.out.println("Informe anos tem o cliente: ");
                    i = leia.nextInt();
                    c1.setIdade(i);
                    leia.nextLine();

                    System.out.println("Informe o cpf do cliente: ");
                    m = leia.nextLine();
                    c1.setCpf(m);
                    break;
                case 2:
                    System.out.println("Dados do cliente cadastrado: ");
                    c1.statusCliente();
                    break;
                case 3:
                    System.out.println("Qual dado quer alterar do cliente?");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Idade");
                    System.out.println("3 - CPF");
                    alt = leia.nextInt();
                    leia.nextLine();

                    switch (alt){
                        case 1:
                            System.out.println("Informe o novo nome do cliente: ");
                            n = leia.nextLine();
                            c1.setNome(n);
                            break;
                        case 2:
                            System.out.println("Informe a nova idade do cliente: ");
                            i = leia.nextInt();
                            c1.setIdade(i);
                            leia.nextLine();
                            break;
                        case 3:
                            System.out.println("Informe o novo cpf do cliente: ");
                            m = leia.nextLine();
                            c1.setCpf(m);
                            break;
                    }
                default:
                    System.out.println("Erro: Digite um numero valido");
            }  
        } while (menu != 0);
        System.out.println("Sistema encerrado!");
    }
}