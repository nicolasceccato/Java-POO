package polimorfismo;

 public class Mamifero extends Animal{
  private String corDoPelo;

  public String getCorDoPelo() {
   return corDoPelo;
  }

  public void setCorDoPelo(String corDoPelo) {
   this.corDoPelo = corDoPelo;
  }

  @Override
  public void locomover() {
   System.out.println("Correndo");
   }
  @Override
  public void alimentar() {
   System.out.println("Mamando");
  }
  @Override
  public void emitirSom() {
   System.out.println("Som de mamífero");
  }

 }
