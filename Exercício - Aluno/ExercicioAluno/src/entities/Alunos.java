package entities;

public class Alunos {

    public String nome;
    public double notas1;
    public double notas2;
    public double notas3;


    public double media = 0;
    public double mediaFinal(){
        media = notas1 + notas2 + notas3;
        return media;
    }
    public String status(){
        if (mediaFinal() >= 60){
            return "APROVADO";
        }
        return "REPROVADO";
    }
    public String toString(){
        if (status().equals("APROVADO")){
            return "MEDIA FINAL = " + mediaFinal() + "\n" + status();
        }
        return "MEDIA FINAL = " + mediaFinal() + "\n" + status() + "\n" +  "FALTOU " + (60-mediaFinal())+ " PONTOS";


    }

}
