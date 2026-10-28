public class Main{
    public static void main(String[] args) {
        try{
            Ingresso ingressoPista = new IngressoPista("H7", "Star Wars", 67.40);
            Ingresso ingressoVIP = new IngressoVip("CupomValido", true, "A6", "Annabelle", 67.40);
            Ingresso ingressoMeia = new IngressoMeiaEntrada("67676767","N9", "Star Treck", 67.40);

            Bilheteria bilheteria = new Bilheteria();
            System.out.println("Venda 1: Ingresso Pista");
            bilheteria.processarVenda(ingressoPista);
 
            System.out.println("Venda 2: Ingresso VIP");
            bilheteria.processarVenda(ingressoVIP);
 
            System.out.println("Venda 3: Ingresso Meia-Entrada");
            bilheteria.processarVenda(ingressoMeia);

            } catch (IllegalArgumentException exception) {
                System.out.println("Excecao! Dados Invalidos");
        }

        System.out.println("");
        System.out.println("Tentativa com erro:");
        System.out.println("");
        try{
            Ingresso invalido = new IngressoVip(null, false, null, null, 0);
            invalido.calcularValorFinal();
            invalido.exibirResumo();
        } catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}