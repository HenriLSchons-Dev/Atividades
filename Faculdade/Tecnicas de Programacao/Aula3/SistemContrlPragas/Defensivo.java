public class Defensivo{
    private String nome;
    private String tipoPragaAlvo;
    private double dosagemPorHectare;
    private double precoPorLitro;
    private double estoqueLitros;
    private double porcentagemEficacia;

    public Defensivo(String nome, String tipoPragaAlvo, double dosagemPorHectare, double precoPorLitro, double estoqueLitros, double porcentagemEficacia){
        this.nome = nome;
        this.tipoPragaAlvo = tipoPragaAlvo;
        this.dosagemPorHectare = dosagemPorHectare;
        this.precoPorLitro = precoPorLitro;
        this.estoqueLitros = estoqueLitros;
        this.porcentagemEficacia = porcentagemEficacia;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipoPragaAlvo(String tipoPragaAlvo){
        this.tipoPragaAlvo = tipoPragaAlvo;
    }

    public String getTipoPragaAlvo(){
        return this.tipoPragaAlvo;
    }

    public void setDosagemPorHectare(double dosagemPorHectare){
        if(dosagemPorHectare > 0){
            this.dosagemPorHectare = dosagemPorHectare;
        } else{
            System.out.println("Erro: Digite um valor correto para a dosagem!");
        }
    }

    public double getDosagemPorHecatare(){
        return this.dosagemPorHectare;
    }

    public void setPrecoPorLitro(double precoPorLitro){
        if(precoPorLitro > 0){
            this.precoPorLitro = precoPorLitro;
        } else{
            System.out.println("Erro: Digite um valor valido para o preco por litro!");
        }
    }

    public double getPrecoPorLitro(){
        return this.precoPorLitro;
    }

    public void setEstoqueLitros(double estoqueLitros){
        this.estoqueLitros = estoqueLitros;
    }

    public double getEstoqueLitros(){
        return this.estoqueLitros;
    }

    public void setPorcentagemEficacia(double porcentagemEficacia){
        this.porcentagemEficacia = porcentagemEficacia;
    }

    public double getPorcentagemEficacia(){
        return this.porcentagemEficacia;
    }

    public double aplicar(double area){
        double calculoDosagem = dosagemPorHectare * area;

        if(estoqueLitros > calculoDosagem){
            this.estoqueLitros -= calculoDosagem;
            System.out.println("Aplicacao feita com sucesso!");
        } else{
            System.out.println("Nao foi possivel fazer a aplicacao por falta de estoque!");
        }
        return 0;
    }

    public double tabelaOperacional(double custoTotal){
        String tabelaOperacionalFormatada = this.tipoPragaAlvo.toLowerCase();

        if(tabelaOperacionalFormatada.equals("classe iv")){
            return custoTotal * 0.05;
        } else if(tabelaOperacionalFormatada.equals("classe iii")){
            return custoTotal * 0.08;
        } else{
            return custoTotal * 0.12;
        }
    }
}