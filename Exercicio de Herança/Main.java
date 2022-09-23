package Main;

public class Main {
    public static void main(String[] args) {
    Visitante v1= new Visitante();
    v1.setNome("Juvenal");
    v1.setIdade(22);
    v1.setSexo("M");
    System.out.println(v1.toString());
    Aluno a1 = new Aluno();
    a1.setNome("Cláudio");
    a1.setMatricula(1111);
    a1.setCurso("Informática");
    a1.setIdade(16);
    a1.setSexo("M");
    a1.pagarMensalidade();
    System.out.println(a1.toString());
    Bolsista b1 = new Bolsista();
    b1.setNome("Jubileu");
    b1.setMatricula(2222);
    b1.setBolsa(25.4f);
    b1.setSexo("M");
    b1.pagarMensalidade();
    System.out.println(b1.getMatricula());
    }
}
