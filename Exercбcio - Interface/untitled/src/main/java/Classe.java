import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

public class Classe {
    String nome = "fulano";
    String sobrenome = "ciclano";
    String email = "fulano@ciclano.com.br";

    public Classe(String nome, String sobrenome, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public Classe() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return "{" + " \"nome\":" + this.nome + " \"sobrenome\":" + this.sobrenome + " \"email\":" + this.email+ "}";
    }



}
