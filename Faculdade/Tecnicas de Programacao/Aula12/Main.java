public class Main {
    public static void main(String[] args) {

        CalculoFrete[] fretes = {
                new Correios("74000-000", 3.5),
                new FreteExpress("74000-000", 3.5),
                new RetiradaLoja("74000-000", 3.5)
        };

        System.out.println("=== 1. CALCULAR FRETES ===");
        for (CalculoFrete f : fretes) {
            System.out.printf("%s (CEP %s, %.1f kg): R$ %.2f%n",
                    f.getClass().getSimpleName(), f.getCep(), f.getPesoKg(), f.calcularFrete());
        }

        System.out.println("\n=== 2. RASTREIO ===");
        for (CalculoFrete f : fretes) {
            if (f instanceof Rastreio r) {
                String codigo = r.gerarCodigoRastreio();
                System.out.printf("%s -> código: %s | status: %s%n",
                        f.getClass().getSimpleName(), codigo, r.consultarStatus(codigo));
            }
        }

        System.out.println("\n=== 3. AGENDAMENTO DE ENTREGA ===");
        for (CalculoFrete f : fretes) {
            if (f instanceof Agendar a) {
                System.out.printf("%s -> %s%n",
                        f.getClass().getSimpleName(), a.agendarEntrega("25/10/2026 14:00"));
            }
        }

        System.out.println("\n=== 4. DESCONTOS (10%) ===");
        for (CalculoFrete f : fretes) {
            if (f instanceof Desconto d) {
                System.out.printf("%s -> de R$ %.2f por R$ %.2f%n",
                        f.getClass().getSimpleName(), f.calcularFrete(),
                        d.aplicarDesconto(f.calcularFrete(), 10));
            }
        }
    }
}