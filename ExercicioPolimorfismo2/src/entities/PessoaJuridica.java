package entities;

public class PessoaJuridica extends Contribuinte {

    private int numeroDeFuncionarios;

    public PessoaJuridica(String name, Double rendaAnual, int numeroDeFuncionarios) {
        super(name, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double calculaImposto() {
        Double impostoAserPago = this.getRendaAnual() * 0.16;
        if (this.getNumeroDeFuncionarios() > 10){
            impostoAserPago = this.getRendaAnual() * 0.14;
        }
        return impostoAserPago;
    }
}
