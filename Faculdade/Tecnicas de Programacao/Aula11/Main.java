import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        CpfService gerarCpf = new CpfService();

        int opcao = -1;
        do { 
            System.out.println("========= Gerenciador de CPF ===========");
            System.out.println("1 - Gerar novo CPF por estado");
            System.out.println("2 - Listar CPFs gerados");
            System.out.println("3 - Sair");
            opcao = leia.nextInt();
            leia.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite a sigla do estado (UF): ");
                    gerarCpf.setUf(leia.nextLine());
                    gerarCpf.gerarCpf();
                    
                    gerarCpf.adicionarCpf();
                    break;
                case 2:
                    gerarCpf.listarCpfs();
                    break;
            }
        } while (opcao != 3);

        System.out.println("Systema encerrado.");
    }
}