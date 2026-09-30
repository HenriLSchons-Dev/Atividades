public class Main{
    public static void main(String[] args) {
        Documento doc1 = new CPF("12345678900");
        Documento doc2 = new CPF("123");
        Documento doc3 = new CNPJ("12345678000190");

        System.out.println("CPF 1 válido? " + doc1.validar());
        System.out.println("CPF 2 válido? " + doc2.validar());
        System.out.println("CNPJ válido? " + doc3.validar());
    }
}