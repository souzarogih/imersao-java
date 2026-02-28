package org.example.ecommerce.produtos;

import com.programaai.db.DbId;

public class Produto {

    @DbId
    private String codigoProduto;
    private String nome;
    private double preco;
    private int unidadeEstoque;
    private EspecificacoesTecnicas especificacoesTecnicas;
    private Marca marca;

    public Produto(String codigoProduto, String nome, double preco, int unidadeEstoque, EspecificacoesTecnicas especificacoesTecnicas, Marca marca) {
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.preco = preco;
        this.unidadeEstoque = unidadeEstoque;
        this.especificacoesTecnicas = especificacoesTecnicas;
        this.marca = marca;
    }

    public Produto() {
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getUnidadeEstoque() {
        return unidadeEstoque;
    }

    public void setUnidadeEstoque(int unidadeEstoque) {
        this.unidadeEstoque = unidadeEstoque;
    }

    public EspecificacoesTecnicas getEspecificacoesTecnicas() {
        return especificacoesTecnicas;
    }

    public void setEspecificacoesTecnicas(EspecificacoesTecnicas especificacoesTecnicas) {
        this.especificacoesTecnicas = especificacoesTecnicas;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigoProduto='" + codigoProduto + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", unidadeEstoque=" + unidadeEstoque +
                ", especificacoesTecnicas=" + especificacoesTecnicas +
                ", marca=" + marca +
                '}';
    }
}
