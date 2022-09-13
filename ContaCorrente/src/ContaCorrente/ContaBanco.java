package ContaCorrente;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void estadoAtual(){
        System.out.println("--------------------------------");

        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        }else{
            if (t == "CP"){
                this.setSaldo(150);
            }
        }
        System.out.println("conta aberta!");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("conta tem dinheiro");
        }else{
            if (this.getSaldo() < 0){
                System.out.println("conta em debito");
            }else{
                this.setStatus(false);
                System.out.println("conta fechada!");
            }
        }

    }
    public void depositar(float quantia){
        if (this.getStatus() && quantia > 0){
            this.setSaldo(this.getSaldo() + quantia);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else {
            System.out.println("Impossivel depositar");
        }
    }
    public void sacar(float quantia){
        if (this.getStatus() && this.getSaldo() >= quantia){
            this.setSaldo(this.getSaldo()-quantia);
            System.out.println("saque realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossivel sacar");
        }
    }
    public void pagarMensal(float quantia){
        float v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }else{
            if (this.getTipo() == "CP"){
                v = 20;
            }
        }
        if(this.getStatus() && this.getSaldo() > v){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga por "+ this.getDono());
        }else{
            System.out.println("Impossivel pagar");
        }
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int x) {
        this.numConta = x;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String s) {
        this.tipo = s;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
