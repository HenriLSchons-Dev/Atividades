public class Talhao{
    private int idTalhao;
    private String cultura;
    private double areaHectares;
    private double nivelInfestacao;

    public Talhao(int idTalhao, String cultura, double areaHectares, double nivelInfestacao){
        this.idTalhao = idTalhao;
        this.cultura = cultura;
        this.areaHectares = areaHectares;
        this.nivelInfestacao = nivelInfestacao;
    }

    public void setIdTalhao(int idTalhao){
        this.idTalhao = idTalhao;
    }

    public int getIdTalhao(){
        return this.idTalhao;
    }

    public void setCultura(String cultura){
        this.cultura = cultura;
    }

    public String getCultura(){
        return this.cultura;
    }

    public void setAreaHectare(double areaHectares){
        this.areaHectares = areaHectares;
    }

    public double getAreaHectares(){
        return this.areaHectares;
    }

    public void setNivelInfestacao(double nivelInfestacao){
        if(nivelInfestacao > 0){
            this.nivelInfestacao = nivelInfestacao;
        } else{
            System.out.println("Erro: Digite o nivel de infestacao!");
        }
    }

    public double getNivelInfestacao(){
        return this.nivelInfestacao;
    }
}