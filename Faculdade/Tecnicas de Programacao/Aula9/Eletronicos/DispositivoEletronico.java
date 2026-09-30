public abstract class DispositivoEletronico {
    protected String marca;
    protected int potenciaWatts;

    public DispositivoEletronico(String marca, int potenciaWatts) {
        setMarca(marca);
        setPotenciaWatts(potenciaWatts);
    }

    public abstract double calcularConsumoDiario(int horasUso);

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

}