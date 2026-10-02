public class Onibus{
    private String placa;
    private String modelo;
    private int capacidadeSentados;
    private int capacidadeEmPe;
    private int qntSentadosOcupados;
    private int qntEmPeOcupados;

    public Onibus(String placa, String modelo, int capacidadeSentados, int capacidadeEmPe, int qntSentadosOcupados, int qntEmPeOcupados){
        setPlaca(placa);
        setModelo(modelo);
        setCapacidadeSentados(capacidadeSentados);
        setCapacidadeEmPe(capacidadeEmPe);
        this.qntSentadosOcupados = qntSentadosOcupados;
        this.qntEmPeOcupados = qntEmPeOcupados;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if(placa != null && placa.matches("[A-Z]{3}[0-9][A-Z][0-9]{2}")){
            this.placa = placa;
        } else {
            System.out.println("Placa invalida!");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo == null || modelo.trim().isEmpty()){
            System.err.println("Modelo invalido");
        } else {
            this.modelo = modelo;
        }
    }

    public int getCapacidadeSentados() {
        return capacidadeSentados;
    }

    public void setCapacidadeSentados(int capacidadeSentados) {
        if(capacidadeSentados > 0){
            this.capacidadeSentados = capacidadeSentados;
        } else {
            System.out.println("Capacidade sentado invalida!");
        }
    }

    public int getCapacidadeEmPe() {
        return capacidadeEmPe;
    }

    public void setCapacidadeEmPe(int capacidadeEmPe) {
        if(capacidadeEmPe > 0){
            this.capacidadeEmPe = capacidadeEmPe;
        } else {
            System.out.println("Capacidade em pe ivalida!");
        }
    }

    public int getQntSentadosOcupados() {
        return qntSentadosOcupados;
    }

    public int getQntEmPeOcupados() {
        return qntEmPeOcupados;
    }

    public boolean  embarcarPassageiro(boolean sentado){
        if(sentado){
            if(qntSentadosOcupados < capacidadeSentados){
                this.capacidadeSentados++;
                return true;
            } else {
                System.out.println("ERRO: Capacidade de pessoas sentadas excedida!");
                return false;
            }
        } else {
            if(qntEmPeOcupados < capacidadeEmPe){
                this.capacidadeEmPe++;
                return true;
            } else {
                System.out.println("ERRO: Capacidade de pessoas em pe excedida!");
                return false;
            }
        }
    }

    public boolean desembarcarPassageiro(boolean sentado){
        if(sentado){
            if(qntSentadosOcupados <= capacidadeSentados){
                this.capacidadeSentados--;
                return true;
            } else {
                System.out.println("ERRO: Capacidade de pessoas sentadas invalida!");
                return false;
            }
        } else {
            if(qntEmPeOcupados <= capacidadeEmPe){
                this.capacidadeEmPe--;
                return true;
            } else {
                System.out.println("ERRO: Capacidade de pessoas em pe invalida!");
                return false;
            }
        }
    }

}