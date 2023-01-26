package entities;

public class PessoaFisica extends Contribuinte{

    private Double gastosComSaude;

    public PessoaFisica(String name, Double rendaAnual, Double gastosComSaude) {
        super(name, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double calculaImposto() {
        Double impostoAserPago = 0.0;
        if (this.getRendaAnual() < 20000.0) {
            impostoAserPago = this.getRendaAnual() * 0.15;
        }else {
            impostoAserPago = this.getRendaAnual() * 0.25;
        }
        if (this.getGastosComSaude() > 0){
                impostoAserPago = impostoAserPago - (this.getGastosComSaude()*0.5);
        }

        return impostoAserPago;
    }
}
