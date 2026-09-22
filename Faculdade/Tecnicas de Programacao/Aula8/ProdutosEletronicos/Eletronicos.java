public class Eletronicos extends Produtos{
    protected double voltagem;
    protected int garantiaMeses;

    public Eletronicos(){

    }

    public Eletronicos(double preco, String nome, double voltagem, int garantiaMeses){
        super(preco, nome);
        setVoltagem(voltagem);
        setGarantiaMeses(garantiaMeses);
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public void detalharGarantia(){
        System.out.printf("A garantia do produto '%s', é garantida no periodo de ate %d meses depois da realizacao da compra", getNome(), getGarantiaMeses()); 
    }
}