package entities;

public class ContaNoBanco {
    private int numeroDaConta;
    private String titularDaConta;
    private double saldoDaConta;

    public ContaNoBanco(int numeroDaConta, String titularDaConta, double depositoInicial){
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
        depositar(depositoInicial);
    }
    public ContaNoBanco(int numeroDaConta, String titularDaConta){
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitularDaConta() {
        return titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void depositar(double valorADepositar){
        saldoDaConta += valorADepositar;
        System.out.println("Movimentação bancária: ");
        dadosBancarios();
    }
    public void sacar(double valorASacar){
        saldoDaConta = saldoDaConta - valorASacar - 5.0;
        System.out.println("Movimentação bancária: ");
        dadosBancarios();
    }
    public void dadosBancarios(){
        System.out.println("Dados bancários: ");
        System.out.println("Conta: "+ getNumeroDaConta() + ", " + "Titular da conta: " + getTitularDaConta() + ", " + "Saldo: $" + getSaldoDaConta());
    }


}
