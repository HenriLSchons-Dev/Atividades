public class Aluno{
    private String nome;
    private int matricula;
    private int idade;
    private String email;

    public Aluno(){

    }

    public Aluno(String nome, int matricula, int idade, String email){
        setNome(nome);
        setMatricula(matricula);
        setIdade(idade);
        setEmail(email);
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula <= 0){
            System.out.println("Matricula invalida!");
        } else {
            this.matricula = matricula;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade <= 0){
            System.out.println("Idade invalida!");
        } else {
            this.idade = idade;
        }
    }

    public boolean verificarMaioridade(){
        if(getIdade() >= 18){
            System.out.println("Individuo é maior de idade!");
            return true;
        } else {
            System.out.println("Dectado um menor de idade!");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null && email.contains("@") && email.contains(".")){
            this.email = email;
        } else{
            System.out.println("Email invalido!");
        }
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Idade: " + this.idade);
        System.out.println("Email: " + this.email);
    }

    public void exibirDados(boolean dadosSensiveis){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if(dadosSensiveis){
            System.out.println("Email: " + this.email);
        }
    }
}