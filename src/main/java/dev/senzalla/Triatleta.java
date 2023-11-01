package dev.senzalla;


public class Triatleta implements Ciclista, Corredor, Nadador {
    private String nome;
    private String record;
    private String estiloNado;
    private String estiloBike;
    private String estiloCorrida;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getRecord() {
        return record;
    }

    @Override
    public void setRecord(String record) {
        this.record = record;
    }

    @Override
    public String getEstiloNado() {
        return estiloNado;
    }

    @Override
    public void setEstiloNado(String estiloNado) {
        this.estiloNado = estiloNado;
    }

    @Override
    public String getEstiloBike() {
        return estiloBike;
    }

    @Override
    public void setEstiloBike(String estiloBike) {
        this.estiloBike = estiloBike;
    }

    @Override
    public String getEstiloCorrida() {
        return estiloCorrida;
    }

    @Override
    public void setEstiloCorrida(String estiloCorrida) {
        this.estiloCorrida = estiloCorrida;
    }
}
