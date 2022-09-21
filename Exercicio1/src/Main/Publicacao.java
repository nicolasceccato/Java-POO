package Main;

public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();

    public abstract void folhear(int p);
    public abstract void avacarPag();
    public abstract void voltarPag();
}
