package entities;

public abstract class Contribuinte {

    protected String name;
    protected Double rendaAnual;

    public Contribuinte(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }
    public abstract Double calculaImposto();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
}
