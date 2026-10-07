import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class CpfService{
    private String cpf;
    private String uf;

    private List<String> cpfs = new ArrayList<>();

    public CpfService(){

    }


    public String getUf() {
        return uf;
    }

    public String numeroRegiao(){
        if(getUf().equals("DF") || getUf().equals("GO") || getUf().equals("MS") || getUf().equals("MT") || getUf().equals("TO")){
            return "1";
        } else if (getUf().equals("AC") || getUf().equals("AM") || getUf().equals("AP") || getUf().equals("PA") || getUf().equals("RO") || getUf().equals("RR")){
            return "2";
        } else if (getUf().equals("CE") || getUf().equals("MA") || getUf().equals("PI")) {
            return "3";
        } else if (getUf().equals("AL") || getUf().equals("PB") || getUf().equals("PE") || getUf().equals("RN")){
            return "4";
        } else if (getUf().equals("BA") || getUf().equals("SE")) {
            return "5";
        } else if (getUf().equals("MG")){
            return "6";
        } else if (getUf().equals("ES") || getUf().equals("RJ")){
            return "7";
        } else if (getUf().equals("SP")) {
            return "8";
        } else if (getUf().equals("PR") || getUf().equals("SC")){
            return "9";
        } else {
            return "0";
        }
    }

    public void setUf(String uf){
        if(uf == null){
            System.out.println("ERRO: UF invalida!");
        }

        uf = uf.toUpperCase().trim().replaceAll("[0-9]", "");

        if (uf.equals("DF") || uf.equals("GO") || uf.equals("MS") || uf.equals("MT") || uf.equals("TO") || uf.equals("AC") || uf.equals("AM") || uf.equals("AP") || uf.equals("PA") || uf.equals("RO") || uf.equals("RR") || uf.equals("CE") || uf.equals("MA") || uf.equals("PI") || uf.equals("AL") || uf.equals("PB") || uf.equals("PE") || uf.equals("RN") || uf.equals("BA") || uf.equals("SE") || uf.equals("MG") || uf.equals("ES") || uf.equals("RJ") || uf.equals("SP") || uf.equals("PR") || uf.equals("SC")) {
            this.uf = uf;

        } else {
            System.out.println("ERRO: UF invalida!");
            this.uf = null;
        }
    }

    public String getCpf(){
        return this.cpf;
    }
    
    public void gerarCpf(){
        Random random = new Random();
        cpf = "";

        for (int i = 0; i < 8; i++) {
            int numero = random.nextInt(10);
            cpf += numero;
        }
        cpf += numeroRegiao();

        int primeiroDigito = calcularDigitosVerificadores(cpf);
        cpf += primeiroDigito;

        int segundoDigito = calcularDigitosVerificadores(cpf);
        cpf += segundoDigito;

        cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);

        System.out.printf("CPF gerado com sucesso: %s (%s - %sª Regiao)%n", getCpf(), getUf(), numeroRegiao());
    }

    public int calcularDigitosVerificadores(String cpf){
        int soma = 0;

        for (int i = 0; i < cpf.length(); i++){
            int numero = Character.getNumericValue(cpf.charAt(i));

            int peso = cpf.length() + 1 - i;

            soma += numero * peso;
        }

        int resto = soma % 11;

        if(resto < 2){
            return 0;
        }

        return 11 - resto;
    } 

    public boolean validarCPF(String cpf) {

        if (cpf == null) {
            return false;
        }

        cpf = cpf.replace(".", "").replace("-", "");

        if (cpf.length() != 11) {
            return false;
        }

        if (!cpf.matches("\\d{11}")) {
            return false;
        }

        if (cpf.chars().distinct().count() == 1) {
            return false;
        }

        int soma = 0;

        for (int i = 0; i < 9; i++) {
            int numero = Character.getNumericValue(cpf.charAt(i));
            soma += numero * (10 - i);
        }

        int resto = soma % 11;
        int primeiroDigito;

        if (resto < 2) {
            primeiroDigito = 0;
        } else {
            primeiroDigito = 11 - resto;
        }

        if (primeiroDigito != Character.getNumericValue(cpf.charAt(9))) {
            return false;
        }

        soma = 0;

        for (int i = 0; i < 10; i++) {
            int numero = Character.getNumericValue(cpf.charAt(i));
            soma += numero * (11 - i);
        }

        resto = soma % 11;
        int segundoDigito;

        if (resto < 2) {
            segundoDigito = 0;
        } else {
            segundoDigito = 11 - resto;
        }

        return segundoDigito == Character.getNumericValue(cpf.charAt(10));
    }

    public void adicionarCpf(){
        if(validarCPF(getCpf())){
            cpfs.add(getCpf());
        }
    }

    public void listarCpfs(){
        System.out.println("========== Lista de CPFs gerados e validados ==========");
        int i = 1;
        for(String cpf : cpfs){
            System.out.println(i + ".   " + cpf);
            i++;
        }
        System.out.println("=======================================================");
    }
}