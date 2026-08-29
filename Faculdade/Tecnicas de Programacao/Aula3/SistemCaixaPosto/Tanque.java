public class Tanque{
    private String tipoCombustivel;
    private double precoPorLitro;
    private double capacidadeTanqueLitros;
    private double estoqueAtualLitros;

    public Tanque(String tipoCombustivel, double precoPorLitro, double capacidadeTanqueLitros, double estoqueAtualLitros){
        this.tipoCombustivel = tipoCombustivel;
        setPrecoPorLitro(precoPorLitro);
        this.capacidadeTanqueLitros = capacidadeTanqueLitros;
        setEstoqueAtualLitros(estoqueAtualLitros);
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

    public double abastecerPorValor(double valor){
        double calculoPorValor = valor / this.precoPorLitro;

        if(calculoPorValor <= this.estoqueAtualLitros){
            this.estoqueAtualLitros -= calculoPorValor;
            return calculoPorValor;
        } else{
            return 0;
        }
    }

    public double abastecerPorLitro(double litros){
        double calculoPorLitro = litros * this.precoPorLitro;

        if(litros <= this.estoqueAtualLitros){
            this.estoqueAtualLitros -= litros;
            return calculoPorLitro;
        } else{
            return 0;
        }
    }

    public double calcularTroco(double pago, double total){
        if(pago >= total){
            return pago - total;
        } else{
            return 0;
        }
    }

    public String valorTabela(){
        String tipoCombustivelFormatado = this.tipoCombustivel.toLowerCase();

        if(tipoCombustivelFormatado.equals("diesel")){
            return "12%";

        } else if(tipoCombustivelFormatado.equals("etanol")){
            return "18%";

        } else if(tipoCombustivelFormatado.equals("gasolina comum")){
            return "27%";

        } else{
            return "29%";
        }
    }

    public double taxasTabela(double subtotal){
        String tipoCombustivelFormatado = this.tipoCombustivel.toLowerCase();

        if(tipoCombustivelFormatado.equals("diesel")){
            return subtotal * 0.12;

        } else if(tipoCombustivelFormatado.equals("etanol")){
            return subtotal * 0.18;

        } else if(tipoCombustivelFormatado.equals("gasolina comum")){
            return subtotal * 0.27;

        } else{
            return subtotal * 0.29;
            
        }
    }

    public  double calculoTabelaTributaria(double subtotal){
        String tipoCombustivelFormatado = this.tipoCombustivel.toLowerCase();

        if(tipoCombustivelFormatado.equals("diesel")){
            return subtotal * 1.12;

        } else if(tipoCombustivelFormatado.equals("etanol")){
            return subtotal * 1.18;

        } else if(tipoCombustivelFormatado.equals("gasolina comum")){
            return subtotal * 1.27;

        } else{
            return subtotal * 1.29;
            
        }
    }
}