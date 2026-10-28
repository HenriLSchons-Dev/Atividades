public interface Rastreio {

    String gerarCodigoRastreio();

    String consultarStatus(String codigoRastreio);
}
