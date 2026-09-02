import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List<PontoCaptacaoRio> pontos = new ArrayList<>();
        GestorOutorga gestor = new GestorOutorga();

        int idPonto;
        String nomeRio;
        String culturaIrrigada;
        double limiteOutorga;
        double volumeCapitacaoHoje;
        double precoBaseM3;
        double volumeM3;
        int menu;

        do {

            System.out.println("========================================================");
            System.out.println("          CADASTRO DO PONTO DE CAPTACAO                 ");
            System.out.println("========================================================");

            System.out.println("Informe o ID do ponto de captacao: ");
            idPonto = leia.nextInt();
            leia.nextLine();

            System.out.println("Informe o nome do rio: ");
            nomeRio = leia.nextLine();

            System.out.println("Informe a cultura irrigada: ");
            culturaIrrigada = leia.nextLine();

            System.out.println("Informe o limite da outorga, em metros cubicos: ");
            limiteOutorga = leia.nextDouble();
            leia.nextLine();

            System.out.println("Informe o volume ja captado hoje, em metros cubicos: ");
            volumeCapitacaoHoje = leia.nextDouble();
            leia.nextLine();

            System.out.println("Informe o preco base por metro cubico: ");
            precoBaseM3 = leia.nextDouble();
            leia.nextLine();

            PontoCaptacaoRio ponto = new PontoCaptacaoRio(idPonto, nomeRio, culturaIrrigada, limiteOutorga, volumeCapitacaoHoje, precoBaseM3);
            pontos.add(ponto);

            System.out.println("========================================================");

            int opcao;
            do { 
                System.out.println("Sera captado mais agua?");
                System.out.println("1 - sim");
                System.out.println("2 - nao");
                opcao = leia.nextInt();
                leia.nextLine();

                System.out.println("Informe o volume a ser captado agora, em metros cubicos: ");
                volumeM3 = leia.nextDouble();
                leia.nextLine();

                ponto.registrarCaptacao(volumeM3);
                
            } while (opcao == 1);

            System.out.println("========================================================");

            gestor.emitirRelatorio(ponto);

            System.out.println(" ");

            System.out.println("============== MENU ================");
            System.out.println("1 - cadastrar outro ponto");
            System.out.println("0 - encerrar sistema");
            System.out.println("====================================");

            menu = leia.nextInt();
            leia.nextLine();

        } while (menu != 0);
    }
}