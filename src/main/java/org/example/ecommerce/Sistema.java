package org.example.ecommerce;

import org.example.ecommerce.produtos.EspecificacoesTecnicas;
import org.example.ecommerce.produtos.Marca;
import org.example.ecommerce.produtos.Produto;

public class Sistema {
    public static void main(String[] args) {

        EspecificacoesTecnicas especificacoesTecnicas = new EspecificacoesTecnicas();
        especificacoesTecnicas.setPeso(2.51);
        especificacoesTecnicas.setAltura(0.51);
        especificacoesTecnicas.setLargura(0.16);
        especificacoesTecnicas.setCor("Preta");

        Marca marca = new Marca("Coca cola", "Coca cola company");

        Produto produto = new Produto();
        produto.setCodigoProduto("1");
        produto.setNome("Coca Cola");
        produto.setPreco(12.59);
        produto.setUnidadeEstoque(100);
        produto.setEspecificacoesTecnicas(especificacoesTecnicas);
        produto.setMarca(marca);

        Produto produto2 = new Produto();
        produto2.setCodigoProduto("2");
        produto2.setNome("Coca Cola 2");
        produto2.setPreco(12.60);
        produto2.setUnidadeEstoque(102);
        produto2.setEspecificacoesTecnicas(especificacoesTecnicas);
        produto2.setMarca(marca);

        ProductService productService = new ProductService();
        productService.salvarProduto(produto);
        productService.salvarProduto(produto2);

        System.out.println(productService.buscarProduto(produto.getCodigoProduto()));


    }
}
