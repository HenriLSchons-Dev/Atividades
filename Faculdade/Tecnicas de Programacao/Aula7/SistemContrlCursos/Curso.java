public class Curso{
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private double valor;

    public Curso(){

    }

    public Curso(int codigo, String nome, int cargaHoraria, double valor){
        setCodigo(codigo);
        setNome(nome);
        setCargaHoraria(cargaHoraria);
        setValor(valor);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo > 0){
            this.codigo = codigo;
        } else {
            System.out.println("Codigo invalido!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Nome invalido!");
        } else {
            this.nome = nome;
        }
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if(cargaHoraria > 0){
            this.cargaHoraria = cargaHoraria;
        } else {
            System.out.println("Carga horaria invalida!");
        }
    }

    public double calcularValorPorHora(){
        try {
            double calculoValor = getValor() / getCargaHoraria();
            return calculoValor;
        } catch (ArithmeticException e) {
            System.out.println("Nao e possivel dividir por 0!");
        }
        return 0;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor > 0){
            this.valor = valor;

        } else {
            System.out.println("Valor invalido!");
        }
    }
    
    public boolean validarCurso(){
        if(this.nome != null && this.nome.trim().isEmpty()){
            if(this.cargaHoraria > 0){
                if(this.valor > 0){
                    return true;
                }
            }
        }
        return false;
    }

    public void exibirDados(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Carga horaria: " + this.cargaHoraria);
        System.out.println("Valor: " + this.valor);
    }

    public void exibirDados(boolean verMaisDados){
        System.out.println("Nome: " + this.nome);
        System.out.println("Valor: " + this.valor);

        if(verMaisDados){
            System.out.println("Carga horaria: " + this.cargaHoraria);
            System.out.println("Codigo: " + this.codigo);
        }
    }
}