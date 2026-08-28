import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class OrdemDeAplicacao{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        List<Talhao> talhoes = new ArrayList<>();

        int idTalhao;
        String cultura;
        double areaHectares;
        double nivelInfestacao;
        String nome;
        String tipoPragaAlvo;
        double dosagemPorHectare;
        double precoPorLitro;
        double estoqueLitros;
        double porcentagemEficacia;
        double area = areaHectares;

        if(talhoes.isEmpty()){
            int menu;
            do { 
                System.out.println("========================================================");
                System.out.println("Faca o cadastro dos talhoes afetados pelas pragas: ");

                System.out.println("Informe o codigo de identificacao do talhao: ");
                idTalhao = leia.nextInt();
                leia.nextLine();

                System.out.println("Informe a cultura usada nesse talhao: ");
                cultura = leia.nextLine();

                System.out.println("Informe a area desse talhao, em Hectares: ");
                areaHectares = leia.nextDouble();
                leia.nextLine();

                System.out.println("Informe o nivel de infestacao, em percentual: ");
                nivelInfestacao = leia.nextDouble();
                leia.nextLine();

                System.out.println("========================================================");

                talhoes.add(new Talhao(idTalhao, cultura, areaHectares, nivelInfestacao));
                
                System.out.println(" ");

                System.out.println("============== MENU ================");
                System.out.println("1 - continuar cadastro de talhoes");
                System.out.println("0 - encerrar cadastro de talhoes");
                System.out.println("====================================");
                menu = leia.nextInt();
            } while (menu != 0);
        }

        System.out.println(" ");

        for(Talhao Talhao : talhoes){
            System.out.println("===============================================");
            System.out.println("Informe o nome do defensivo utilisado: ");
            nome = leia.nextLine();

            System.out.println("Informe o tipo/classe de praga alvo, sendo elas:");
            System.out.println("Classe IV");
            System.out.println("Classe III");
            System.out.println("Classe II");
            System.out.println("Classe I");
            tipoPragaAlvo = leia.nextLine();

            System.out.println("Informe a dosagem, em litro, por hectare a ser utilizada para a aplicacao dos defensivos: ");
            dosagemPorHectare = leia.nextDouble();
            leia.nextLine();

            System.out.println("Informe o preco por litro do defensivo utilizado: ");
            precoPorLitro = leia.nextDouble();
            leia.nextLine();

            System.out.println("Informe o estoque atual desse defensivo, em litros: ");
            estoqueLitros = leia.nextDouble();
            leia.nextLine();

            System.out.println("Informe a porcentagem de eficacia desse defensivo: ");
            porcentagemEficacia = leia.nextDouble();
            leia.nextLine();

            System.out.println("===================================================");

            aplicar();
        }
    }
}