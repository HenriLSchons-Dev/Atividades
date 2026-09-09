public class Documento {

    private String tipo;
    private String arquivo;
    private String competencia;

    public Documento(String tipo, String arquivo, String competencia) {

        this.tipo = tipo;
        this.arquivo = arquivo;
        this.competencia = competencia;
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getArquivo() {
        
        return arquivo;
    }
    public void setArquivo(String arquivo) {

        this.arquivo = arquivo;
    }

    public String getCompetencia() {

        return competencia;
    }

    public void setCompetencia(String competencia) {

        this.competencia = competencia;
    }  
}