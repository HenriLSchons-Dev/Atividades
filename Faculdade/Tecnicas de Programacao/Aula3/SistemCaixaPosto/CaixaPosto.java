import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CaixaPosto{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        List<Tanque> abastecer = new ArrayList<>();

        String tipoCombustivel;
        double precoPorLitro;
        double capacidadeTanqueLitros;
        double estoqueAtualLitros;

        System.out.println("============ Abastecer Carro ==============");
        System.out.println("Informe o tipo de combustivel desejado: ");
        System.out.println("Diesel");
        System.out.println("Etanol");
        System.out.println("Gasolina Comum");
        System.out.println("Gasolina Aditivada");
        tipoCombustivel = leia.nextLine();

        System.out.println("Informe o preco por litro do combustivel: ");
        precoPorLitro = leia.nextDouble();
        leia.nextLine();

        System.out.println("Informe a capacidade do tanque: ");
        capacidadeTanqueLitros = leia.nextDouble();
        leia.nextLine();

        System.out.println("Informe o estoque atual de combustivel: ");
        estoqueAtualLitros = leia.nextDouble();
        leia.nextLine();

        System.out.println("===========================================");

        Tanque tanque = new Tanque(tipoCombustivel, precoPorLitro, capacidadeTanqueLitros, estoqueAtualLitros);
        abastecer.add(tanque);

        boolean abastecido;
        do { 

            System.out.println("========== Forma de Abastecer ==========");
            System.out.println("1 - Abastecer por valor");
            System.out.println("2 - Abastecer por litro");
            System.out.println("========================================");
            int escolha = leia.nextInt();
            leia.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Informe o valor que deseja pagar para abastecer: ");
                    double valor = leia.nextDouble();
                    leia.nextLine();

                    double litrosAbastecidos = tanque.abastecerPorValor(valor);

                    if (litrosAbastecidos > 0) {
                        double subtotal = litrosAbastecidos * precoPorLitro;
                        double total = tanque.calculoTabelaTributaria(subtotal);
                        double troco = tanque.calcularTroco(valor, total);

                        System.out.println("=================================================");
                        System.out.println("      CUPOM FISCAL - POSTO DE COMBUSTIVEIS      ");
                        System.out.println("=================================================");
                        System.out.printf(" Combustivel:                     %s.%n",tanque.getTipoCombustivel());
                        System.out.printf(" Preco por litro:                 R$ %.2f.%n",tanque.getPrecoPorLitro());
                        System.out.printf(" Qnt. Abastecida:                 %.2f Litros.%n",litrosAbastecidos);
                        System.out.println("-------------------------------------------------");
                        System.out.printf(" SUBTOTAL:                        R$ %.2f.%n",subtotal);
                        System.out.printf(" IMPOSTOS RETIDOS (%s):          R$ %.2f.%n",tanque.valorTabela(), tanque.taxasTabela(subtotal));
                        System.out.printf(" TOTAL A PAGAR:                   R$ %.2f.%n",total);
                        System.out.printf(" VALOR PAGO (dinheiro):           R$ %.2f.%n",valor);
                        System.out.printf(" TROCO:                           R$ %.2f.%n",troco);
                        System.out.println("-------------------------------------------------");
                        System.out.printf(" Estoque restante no tanque:       %.2f L.%n",tanque.getEstoqueAtualLitros());
                        System.out.println("=================================================");

                    }

                    break;

                case 2:
                    System.out.println("Informe quantos litros deseja pagar para abastecer: ");
                    double litros = leia.nextDouble();
                    leia.nextLine();

                    double valorAPagar = tanque.abastecerPorLitro(litros);

                    if(valorAPagar > 0){
                        System.out.printf("O valor a ser pago é de R$ %.2f.%n", tanque.calculoTabelaTributaria(valorAPagar));
                        System.out.println("Informe a quantidade paga pelo cliente: ");
                        double pago = leia.nextDouble();
                        leia.nextLine();
                        double total = tanque.calculoTabelaTributaria(valorAPagar);
                        double troco = tanque.calcularTroco(pago, total);

                        System.out.println("=================================================");
                        System.out.println("      CUPOM FISCAL - POSTO DE COMBUSTIVEIS      ");
                        System.out.println("=================================================");
                        System.out.printf(" Combustivel:                    %s.%n", tanque.getTipoCombustivel());
                        System.out.printf(" Preco por litro:             R$ %.2f.%n", tanque.getPrecoPorLitro());
                        System.out.printf(" Qnt. Abastecida:                %.2f Litros.%n", litros);
                        System.out.println("-------------------------------------------------");
                        System.out.printf(" SUBTOTAL:                        R$ %.2f.%n", valorAPagar);
                        System.out.printf(" IMPOSTOS RETIDOS (%s):           R$ %.2f.%n", tanque.valorTabela(), tanque.taxasTabela(valorAPagar));
                        System.out.printf(" TOTAL A PAGAR:                   R$ %.2f.%n", total);
                        System.out.printf(" VALOR PAGO (dinheiro):           R$ %.2f.%n", pago);
                        System.out.printf(" TROCO:                           R$ %.2f.%n", troco);    
                        System.out.println("-------------------------------------------------");
                        System.out.printf(" Estoque restante no  tanque:   %.2f L.%n", tanque.getEstoqueAtualLitros());
                        System.out.println("=================================================");
                    }

                    break;

                default:
                    System.out.println("Erro: Forma de abastecimento nao reconhecido!");
            }
            abastecido = true;
        } while (abastecido != true);
    }
}