package entities;

public class Funcionario {

    public String nome;

    public double salarioBruto;

    public double taxa;

    public double salarioLiquido(){
        return salarioBruto -taxa;
    }
    public double aumentarSalario(double porcentagem){
        return salarioBruto = salarioBruto + salarioBruto*((porcentagem)/100);
    }
    public String toString(){
        return "Funcionário: " + nome + ", $ " + salarioLiquido();
    }



}
