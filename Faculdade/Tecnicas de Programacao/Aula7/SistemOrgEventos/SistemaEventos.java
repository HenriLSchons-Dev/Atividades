import java.util.ArrayList;
import java.util.List;
public class SistemaEventos {
    public static void main(String[] args) {

        try {
            Espaco meuEspaco = new Espaco("Villa del Balbianello", "ás margens do Lago de Como, em Lenno - Italia", 200, "Festa");

            Evento meuEvento = new Evento("Star Wars Encounter", "11/09", 20000, 75.99);

            Organizador meuOrganizador = new Organizador("Henri", "109102992", "Festas");

            List<Evento> eventos = new ArrayList<>();

            eventos.add(meuEvento);

            meuOrganizador.assumirEvento(meuEvento, meuEspaco);
            meuEvento.verificarCapacidade(meuEspaco);

            System.out.println("\nEventos cadastrados:");

            for (Evento evento : eventos) {
                evento.exibirDados();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Sistema de eventos finalizado.");
        }
    }
}