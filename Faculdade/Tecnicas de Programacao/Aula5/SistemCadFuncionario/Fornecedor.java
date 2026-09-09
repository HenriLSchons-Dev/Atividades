public class Fornecedor {

    private int codigo;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String email;
    private String telefone;

    public Fornecedor() {

    }

    public Fornecedor(String razaoSocial) {
        setRazaoSocial(razaoSocial);
    }

    public Fornecedor(int codigo, String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone) {
        setCodigo(codigo);
        setRazaoSocial(razaoSocial);
        setNomeFantasia(nomeFantasia);
        setCnpj(cnpj);
        setEmail(email);
        setTelefone(telefone);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        } else {
            System.out.println("Código inválido");
        }
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        if (razaoSocial == null || razaoSocial.trim().isEmpty()) {
            System.out.println("Razão social inválida");
        } else {
            this.razaoSocial = razaoSocial;
        }
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        if (nomeFantasia == null || nomeFantasia.trim().isEmpty()) {
            System.out.println("Nome fantasia inválido");
        } else {
            this.nomeFantasia = nomeFantasia;
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (validarCNPJ(cnpj)) {
            this.cnpj = cnpj.replace(".", "")
                            .replace("/", "")
                            .replace("-", "");
        } else {
            System.out.println("CNPJ inválido");
        }
    }

    public boolean validarCNPJ(String cnpj) {

        if (cnpj == null) {
            return false;
        }

        cnpj = cnpj.replace(".", "").replace("/", "").replace("-", "");

        if (cnpj.length() != 14) {
            return false;
        }

        if (!cnpj.matches("\\d{14}")) {
            return false;
        }

        if (cnpj.chars().distinct().count() == 1) {
            return false;
        }

        int[] pesosPrimeiroDigito = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma = 0;

        for (int i = 0; i < 12; i++) {
            int numero = Character.getNumericValue(cnpj.charAt(i));
            soma += numero * pesosPrimeiroDigito[i];
        }

        int resto = soma % 11;
        int primeiroDigito;

        if (resto < 2) {
            primeiroDigito = 0;
        } else {
            primeiroDigito = 11 - resto;
        }

        if (primeiroDigito != Character.getNumericValue(cnpj.charAt(12))) {
            return false;
        }

        int[] pesosSegundoDigito = {
            6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2
        };

        soma = 0;

        for (int i = 0; i < 13; i++) {
            int numero = Character.getNumericValue(cnpj.charAt(i));
            soma += numero * pesosSegundoDigito[i];
        }

        resto = soma % 11;
        int segundoDigito;

        if (resto < 2) {
            segundoDigito = 0;
        } else {
            segundoDigito = 11 - resto;
        }

        return segundoDigito == Character.getNumericValue(cnpj.charAt(13));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("E-mail inválido");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && telefone.matches("\\d{10,11}")) {
            this.telefone = telefone;
        } else {
            System.out.println("Telefone inválido!");
        }
    }

    public void exibirDados() {

        System.out.println("Código: " + this.codigo);
        System.out.println("Razão social: " + this.razaoSocial);
        System.out.println("Nome fantasia: " + this.nomeFantasia);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }

    public void exibirDados(boolean completo) {

        System.out.println("Código: " + this.codigo);
        System.out.println("Razão social: " + this.razaoSocial);
        System.out.println("Nome fantasia: " + this.nomeFantasia);

        if (completo) {
            System.out.println("CNPJ: " + this.cnpj);
            System.out.println("E-mail: " + this.email);
            System.out.println("Telefone: " + this.telefone);
        }
    }

    public boolean cadastroValido() {
        return razaoSocial != null && nomeFantasia != null && cnpj != null && email != null && telefone != null;
    }
}