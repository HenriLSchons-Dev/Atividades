public class PontoCaptacaoRio{
    private int idPonto;
    private String nomeRio;
    private String culturaIrrigada;
    private double limiteOutorga;
    private double volumeCaptacaoRio;
    private double precoBaseM3;
    private boolean bloqueado;

    public PontoCaptacaoRio(int idPonto, String nomeRio, String culturaIrrigada, double limiteOutorga, double volumeCaptacaoRio, double precoBaseM3){
        this.idPonto = idPonto;
        this.nomeRio = nomeRio;
        this.culturaIrrigada = culturaIrrigada;
        this.limiteOutorga = limiteOutorga;
        this.volumeCaptacaoRio = volumeCaptacaoRio;
        this.precoBaseM3 = precoBaseM3;
    }

    public void setIdPonto(int idPonto){
        this.idPonto = idPonto;
    }

    public int getIdPonto(){
        return this.idPonto;
    }

    public void setNomeRio(String nomeRio){
        this.nomeRio = nomeRio;
    }

    public String getNomeRio(){
        return this.nomeRio;
    }

    public void setCulturaIrrigada(String culturaIrrigada){
        this.culturaIrrigada = culturaIrrigada;
    }

    public String getCulturaIrrigada(){
        return this.culturaIrrigada;
    }

    public void setLimiteOutorga(double limiteOutorga){
        if(limiteOutorga > 0){
            this.limiteOutorga = limiteOutorga;
        } else{
            System.out.println("Erro: Favor inserir valor valido!");
        }
    }

    public double getLimiteOutorga(){
        return this.limiteOutorga;
    }

    public void setvolumeCaptacaoRio(double volumeCaptacaoRio){
        if(volumeCaptacaoRio > limiteOutorga){
            bloqueado = true;
        }
        if(volumeCaptacaoRio >= 0){
            this.volumeCaptacaoRio = volumeCaptacaoRio;
        } else{
            System.out.println("Erro: Favor inserir valor valido!");
        }
    }

    public double getvolumeCaptacaoRio(){
        return this.volumeCaptacaoRio;
    }

    public void setPrecoBaseM3(double precoBaseM3){
        if(precoBaseM3 > 0){
            this.precoBaseM3 = precoBaseM3;
        } else{
            System.out.println("Erro: Favor inserir valor valido!");
        }
    }

    public double getPrecoBaseM3(){
        return this.precoBaseM3;
    }

    public void registrarCaptacao(double volumeM3) {
        if (bloqueado) {
            System.out.println("Operacao recusada!");
            System.out.println("O ponto de captacao esta BLOQUEADO.");
            return;
        }

        if (volumeM3 <= 0) {
            System.out.println("Erro: volume de captacao deve ser maior que zero.");
            return;
        }
        
        double calculoExcedente = volumeCaptacaoRio / limiteOutorga ;

        if(calculoExcedente >= 1.25){
            bloqueado = true;

            System.out.println("Operacao recusada!");
            System.out.println("Infracao ambiental grave identificada.");
            System.out.println("Ponto de captacao BLOQUEADO.");

            return;
        }
        
        double novoVolume = volumeCaptacaoRio + volumeM3;

        this.volumeCaptacaoRio = novoVolume;

        System.out.println("Captacao registrada com sucesso.");
    }

    public String getStatus(){
        if (bloqueado) {
            return "BLOQUEADO";
        }

        double porcentagem = volumeCaptacaoRio / limiteOutorga;
        if (porcentagem > 1.15) {
            return "ALERTA DE EXCESSO CRITICO";
        } else if (porcentagem > 1.00) {
            return "ALERTA DE EXCESSO MODERADO";
        } else {
            return "REGULAR";
        }
    }
}