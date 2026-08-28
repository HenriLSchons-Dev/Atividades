public class Tanque{
    private String tipoCombustivel;
    private double precoPorLitro;
    private double capacidadeTanqueLitros;
    private double estoqueAtualLitros;

    public Tanque(String tipoCombustivel, double precoPorLitro, double capacidadeTanqueLitros, double estoqueAtualLitros){
        this.tipoCombustivel = tipoCombustivel;
        this.precoPorLitro = precoPorLitro;
        this.capacidadeTanqueLitros = capacidadeTanqueLitros;
        this.estoqueAtualLitros = estoqueAtualLitros;
    }

    public void setTipoCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel(){
        return this.tipoCombustivel;
    }

    public void setPrecoPorLitro(double precoPorLitro){
        if(precoPorLitro > 0){
            this.precoPorLitro = precoPorLitro;
        } else{
            System.out.println("Erro: Digite um preço valido!");
        }
    }

    public double getPrecoPorLitro(){
        return this.precoPorLitro;
    }

    public void setCapacidadeTanqueLitros(double capacidadeTanqueLitros){
        this.capacidadeTanqueLitros = capacidadeTanqueLitros;
    }

    public double getCapacidadeTanqueLitros(){
        return this.capacidadeTanqueLitros;
    }

    public void setEstoqueAtualLitros(double estoqueAtualLitros){
        if(estoqueAtualLitros <= capacidadeTanqueLitros){
            this.estoqueAtualLitros = estoqueAtualLitros;
        } else{
            System.out.println("Erro: Digite o valor correto para o estoque!");
        }
    }

    public double getEstoqueAtualLitros(){
        return this.estoqueAtualLitros;
    }

    public void abastecerPorValor(double valor){
        double calculoPorValor = valor / this.precoPorLitro;
        double calculoTanque = this.capacidadeTanqueLitros - this.estoqueAtualLitros;

        if(calculoPorValor <= calculoTanque){
            this.estoqueAtualLitros += calculoPorValor;
            System.out.println("Tanque abastecido!");
        } else{
            double ultrapassaLitros = calculoTanque - calculoPorValor;
            System.out.printf("O valor inserido ultrapassa a capacidade informada de litros do tanque em %.2f.%n ", ultrapassaLitros);
        }
    }

    public void abastecerPorLitro(double litros){
        double calculoTanque = this.capacidadeTanqueLitros - this.estoqueAtualLitros;

        if(calculoTanque != 0){
            double valorPagar = litros * this.precoPorLitro;
            System.out.printf("O tanque tem %.2f Litros livres.%n", calculoTanque);
            System.out.printf("O valor a pagar será de R$ %.2f.%n", valorPagar);
        } else{
            System.out.println("O tanque está cheio!");
        }
    }

    public  double tabelaTributaria(){
        String tipoCombustivelFormatado = this.tipoCombustivel.toLowerCase();

        if(tipoCombustivelFormatado.equals("diesel")){
            return precoPorLitro * 0.12;

        } else if(tipoCombustivelFormatado.equals("etanol")){
            return precoPorLitro * 0.18;

        } else if(tipoCombustivelFormatado.equals("gasolina comum")){
            return precoPorLitro * 0.27;

        } else if(tipoCombustivelFormatado.equals("gasolina aditivada")){
            return precoPorLitro * 0.29;
            
        } else{
            System.out.println("Erro: Digite o tipo correto");
        }

        return 0;
    }
}