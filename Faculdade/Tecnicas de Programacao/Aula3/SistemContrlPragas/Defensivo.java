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

    public double litrosTotais(double area){
        double calculoLitrosTotais = this.dosagemPorHectare * area;
        return calculoLitrosTotais;
    }

    public double aplicar(double area){
        double calculoDosagem = dosagemPorHectare * area;

        if(estoqueLitros >= calculoDosagem){
            System.out.println("Aplicacao feita com sucesso!");
            return this.estoqueLitros -= calculoDosagem;
        } else{
            System.out.println("Nao foi possivel fazer a aplicacao por falta de estoque!");
            return 0;
        }
    }

    public String tabelaTaxas(){
        String tabelaOperacionalFormatada = this.tipoPragaAlvo.toLowerCase();

        if(tabelaOperacionalFormatada.equals("classe iv")){
            return "5%";
        } else if(tabelaOperacionalFormatada.equals("classe iii")){
            return "8%";
        } else{
            return "12%";
        }
    }

    public double custoTaxas(double custoInsumos){
        String tabelaOperacionalFormatada = this.tipoPragaAlvo.toLowerCase();

        if(tabelaOperacionalFormatada.equals("classe iv")){
            return custoInsumos * 0.05;
        } else if(tabelaOperacionalFormatada.equals("classe iii")){
            return custoInsumos * 0.08;
        } else{
            return custoInsumos * 0.12;
        }
    }

    public double custoTotal(double custoInsumos){
        String tabelaOperacionalFormatada = this.tipoPragaAlvo.toLowerCase();

        if(tabelaOperacionalFormatada.equals("classe iv")){
            return custoInsumos * 1.05;
        } else if(tabelaOperacionalFormatada.equals("classe iii")){
            return custoInsumos * 1.08;
        } else{
            return custoInsumos * 1.12;
        }
    }

    public double reduzirPraga(double nivel){
        double calculoReducao = nivel - (nivel * (this.porcentagemEficacia / 100));
        return calculoReducao;
    }

    public double custoInsumos(double area){
        double calculoDosagem = this.dosagemPorHectare * area;
        double custos = this.precoPorLitro * calculoDosagem;
        return custos;
    }
}