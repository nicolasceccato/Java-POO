package entities;

import java.util.Objects;

public class Produtos {
    private  String nome;
    private Double preco;

    public Produtos(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;


        return Objects.equals(nome, produtos.nome) && Objects.equals(preco, produtos.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }
}
