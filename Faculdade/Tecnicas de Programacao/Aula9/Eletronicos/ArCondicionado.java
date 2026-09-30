public class ArCondicionado extends DispositivoEletronico {
    public ArCondicionado(String marca, int potenciaWatts) {
        super(marca, potenciaWatts);
    }

    @Override
    public double calcularConsumoDiario(int horasUso) {
        return (potenciaWatts * horasUso) / 1000.0;
    }
}