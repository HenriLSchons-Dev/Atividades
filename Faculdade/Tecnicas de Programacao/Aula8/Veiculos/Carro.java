public class Carro extends Veiculo{
    protected int qntdPortas;
    protected boolean portamalas;

    public Carro(){

    }

    public Carro(String marca, String modelo, int ano, int qntdPortas, boolean portamalas){
        super(marca, modelo, ano);
        setQntdPortas(qntdPortas);
        setPortamalas(portamalas);
    }

    public int getQntdPortas() {
        return qntdPortas;
    }

    public void setQntdPortas(int qntdPortas) {
        this.qntdPortas = qntdPortas;
    }

    public void abrirPortamalas(){
        this.portamalas = true;
        System.out.println("Portamalas aberto!");
    }

    public boolean isPortamalas() {
        if(this.portamalas == true){
            System.out.println("Portamalas esta aberto");
            return portamalas;
        } else {
            System.out.println("Portamalas esta fechado");
            return portamalas;
        }
    }

    public void setPortamalas(boolean portamalas) {
        this.portamalas = portamalas;
    }

}