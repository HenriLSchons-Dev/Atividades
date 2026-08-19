import java.util.Scanner;
public class Cadastro{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Computador c1 = new Computador();

        String c, g, s;
        boolean m;
        int menu, alt;

        do{
            System.out.println("-------------Menu---------------");
            System.out.println("1 - Cadastrar Computador");
            System.out.println("2 - Exibir Computador");
            System.out.println("3 - Alterar informação");
            System.out.println("0 - Sair");
            System.out.println("================================");
            menu = leia.nextInt();
            leia.nextLine();

            switch(menu){
                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                case 1:
                    System.out.println("Informe a CPU do computador: ");
                    c = leia.nextLine();
                    c1.setCpu(c);

                    System.out.println("Informe a GPU do computador: ");
                    g = leia.nextLine();
                    c1.setGpu(g);

                    System.out.println("Informe o Sistema Operacional: ");
                    s = leia.nextLine();
                    c1.setSistema(s);

                    System.out.println("O computador está em manutencao? ");
                    m = leia.nextBoolean();
                    c1.setManutencao(m);
                    leia.nextLine();
                    break;
                
                case 2:
                    System.out.println("Status da maquina: ");
                    c1.status();
                    break;

                case 3:
                    System.out.println("Qual dado quer alterar do cliente?");
                    System.out.println("1 - CPU");
                    System.out.println("2 - GPU");
                    System.out.println("3 - Sistema");
                    System.out.println("4 - Em manutencao");
                    alt = leia.nextInt();
                    leia.nextLine();

                    switch(alt){
                        case 1:
                            System.out.println("Informe qual a CPU atual: ");
                            c = leia.nextLine();
                            c1.setCpu(c);
                            break;
                        
                        case 2:
                            System.out.println("Informe qual a GPU atual: ");
                            g = leia.nextLine();
                            c1.setGpu(g);
                            break;

                        case 3:
                            System.out.println("Informe qual o SO atual: ");
                            s = leia.nextLine();
                            c1.setSistema(s);
                            break;

                        case 4:
                            System.out.println("Informe qual o estado da maquina: ");
                            m = leia.nextBoolean();
                            c1.setManutencao(m);
                            leia.nextLine();
                            break;
                            
                        default:
                            System.out.println("Erro: Digite um numero valido!");
                    }
                default:
                    System.out.println("Erro: Digite um numero valido!");
            }
        }while(menu != 0);
    }
}