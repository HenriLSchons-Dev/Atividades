import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    public static void main(String[] agrs){
        Robo novoRobo = new Robo();
        Robo robo1 = new Robo(767, "Eva", "Explorador");
        Operador operador = new Operador();
        Laboratorio laboratorio = new Laboratorio("Laboratorio do Jorge");
        Scanner leia = new Scanner(System.in);

        laboratorio.adicionarRobo(robo1);
        int menu = -1;
        do {    
            System.out.println("====================================");
            System.out.println("        Laboratorio de Robotica     ");
            System.out.println("====================================");
            System.out.println("1 - cadastrar robo");
            System.out.println("2 - Listar robos");
            System.out.println("3 - Buscar robo");
            System.out.println("4 - Ligar robo");
            System.out.println("5 - Desligar robo");
            System.out.println("6 - Recarregar robo");
            System.out.println("7 - Controlar robo");
            System.out.println("8 - Exibir a quantidade de robos ativos");
            System.out.println("0 - Sair");
            try {
                menu = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro, digite um numero esperado");
            }
            leia.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("====== Iniciando cadastro de um Robo ======");
                    System.out.println("");

                    System.out.println("Informe o codigo do Robo");
                    int codigo = leia.nextInt();
                    leia.nextLine();
                    
                    System.out.println("Informe o nome do Robo");
                    String nome = leia.nextLine();
                    
                    System.out.println("Informe o tipo do Robo");
                    String tipo = leia.nextLine();

                    System.out.println("Informe quanto de bateria o robo apresenta");
                    int bateria = leia.nextInt();
                    leia.nextLine();

                    System.out.println("Informe se o robo esta ativo");
                    boolean ativo = leia.nextBoolean();

                    novoRobo = new Robo(codigo, nome, tipo, bateria, ativo);

                    laboratorio.adicionarRobo(novoRobo);
                    System.out.println("Robo cadastrado");
                    
                    break;
                case 2:
                    laboratorio.listarRobos();
                    break;
                case 3:
                    System.out.println("Digite o codigo, para saber se temos um Robo com esse codigo");
                    codigo = leia.nextInt();
                    leia.nextLine();
                    laboratorio.buscarRobo(codigo);
                    break;
                case 4:
                    novoRobo.ligar();
                    break;
                case 5:
                    novoRobo.desligar();
                    break;
                case 6:
                    novoRobo.recarregar();
                    break;
                case 7:
                    System.out.println("Informe qual operador vai atuar");
                    System.out.println("");

                    System.out.println("Informe o codigo do operador");
                    operador.setCodigo(leia.nextLine());

                    System.out.println("Informe o nome do operador");
                    nome = leia.nextLine();
                    operador.setNome(nome);

                    System.out.println("Informe qual o nivel de operacao que possui");
                    System.out.println("Iniciante");
                    System.out.println("Intermediario");
                    System.out.println("Avancado");
                    String nivel = leia.nextLine();
                    operador.setNivel(nivel); 
                    operador.controlarRobo(novoRobo);
                    
                    break;
                case 8:
                    laboratorio.contarRobosAtivos();
                    break;
            }

        } while (menu != 0);

        System.out.println("Programa encerrado");
    }
}