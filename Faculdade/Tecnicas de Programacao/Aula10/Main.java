import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Motorista motorista = new Motorista(1, "Carlos Silva", "12345678909", "47999999999", "12345678901", "D", "15/12/2028");

        Cobrador cobrador = new Cobrador(2, "João Santos", "98765432100", "47988888888", "COB001", "Manhã");

        Passageiro passageiroComum = new Passageiro(3, "Ana", "11122233344", "47977777777", "1000000001", 10.00, "COMUM");

        Passageiro passageiroEstudante = new Passageiro(4, "Pedro", "22233344455", "47966666666", "1000000002", 10.00, "ESTUDANTE");
    
        Passageiro passageiroIdoso = new Passageiro(5, "Maria", "33344455566", "47955555555", "1000000003", 10.00, "IDOSO");

        ArrayList<Pessoa> cadastroUnificado = new ArrayList<>();

        cadastroUnificado.add(motorista);
        cadastroUnificado.add(cobrador);
        cadastroUnificado.add(passageiroComum);
        cadastroUnificado.add(passageiroEstudante);
        cadastroUnificado.add(passageiroIdoso);

        System.out.println("==========================================");
        System.out.println("       CADASTRO GERAL DO SISTEMA");
        System.out.println("==========================================");

        for (Pessoa pessoa : cadastroUnificado) {
            pessoa.exibirInformacoes();
            System.out.println("------------------------------------------");
        }

        Terminal terminalCentral = new Terminal(1, "Terminal Central", "Centro");

        Terminal estacaoSul = new Terminal(2, "Estação Sul", "Zona Sul");

        Terminal terminalAeroporto = new Terminal(3, "Terminal Aeroporto", "Aeroporto");

        Terminal estacaoNorte = new Terminal(4, "Estação Norte", "Zona Norte");

        Rota rota = new Rota(10, "Linha 10 - Expressa");

        rota.adicionarTerminais(terminalCentral);
        rota.adicionarTerminais(estacaoSul);
        rota.adicionarTerminais(terminalAeroporto);
        rota.adicionarTerminais(estacaoNorte);

        System.out.println();
        System.out.println("==========================================");
        System.out.println("             ITINERÁRIO DA ROTA");
        System.out.println("==========================================");

        rota.imprimirRota();

        Onibus onibus = new Onibus("ABC1D23", "Mercedes-Benz", 2, 2, 0, 0);

        System.out.println();
        System.out.println("==========================================");
        System.out.println("        SIMULAÇÃO DE EMBARQUE");
        System.out.println("==========================================");

        System.out.println("Embarcando passageiro sentado...");
        onibus.embarcarPassageiro(true);

        System.out.println("Embarcando passageiro sentado...");
        onibus.embarcarPassageiro(true);

        System.out.println("Tentando embarcar outro passageiro sentado...");
        onibus.embarcarPassageiro(true);

        System.out.println();

        System.out.println("Embarcando passageiro em pé...");
        onibus.embarcarPassageiro(false);

        System.out.println("Embarcando passageiro em pé...");
        onibus.embarcarPassageiro(false);

        System.out.println("Tentando embarcar outro passageiro em pé...");
        onibus.embarcarPassageiro(false);

        System.out.println();
        System.out.println("==========================================");
        System.out.println("          SIMULAÇÃO DE BILHETAGEM");
        System.out.println("==========================================");

        System.out.println("Passageiro comum:");
        passageiroComum.debitarTarifa();

        System.out.println("Passageiro estudante:");
        passageiroEstudante.debitarTarifa();

        System.out.println("Passageiro idoso:");
        passageiroIdoso.debitarTarifa();

        System.out.println();
        System.out.println("==========================================");
        System.out.println("             SALDOS FINAIS");
        System.out.println("==========================================");

        System.out.printf("Passageiro Comum: R$ %.2f%n", passageiroComum.getSaldo());

        System.out.printf("Passageiro Estudante: R$ %.2f%n", passageiroEstudante.getSaldo());

        System.out.printf("Passageiro Idoso: R$ %.2f%n", passageiroIdoso.getSaldo());
    }
}