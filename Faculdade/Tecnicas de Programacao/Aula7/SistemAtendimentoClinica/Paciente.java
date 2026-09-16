public class Paciente{
    private String nome;
    private String cpf;
    private int idade;
    private String telefone;

    public Paciente(){

    }

    public Paciente(String nome, String cpf, int idade, String telefone){
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
        setTelefone(telefone);
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(validarCPF(cpf)){
            this.cpf = cpf.replace("-", "").replace(".", "");
        } else {
            System.out.println("CPF invalido!");
        }
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        } else {
            System.out.println("Idade invalida!");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && telefone.matches("\\d{11}")) {
            this.telefone = telefone;
        } else {
            System.out.println("Telefone inválido");
        }
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Telefone: " + this.telefone);
    }

    public void exibirDados(boolean exibirDadosPessoais){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if(exibirDadosPessoais){
            System.out.println("CPF: " + this.cpf);
            System.out.println("Telefone: " + this.telefone);
        }
    }
}