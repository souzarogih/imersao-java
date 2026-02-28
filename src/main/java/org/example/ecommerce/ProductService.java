package org.example.ecommerce;

import org.example.ecommerce.produtos.Produto;

import java.util.Optional;

import static com.programaai.db.Db.create;

public class ProductService {

    private final ProductRepository repo = create(ProductRepository.class, Produto.class);

    public void salvarProduto(Produto produto){
        System.out.println("Salvando produto: " + produto.getNome());

        repo.save(produto);

        System.out.println("Produto salvo com sucesso!");
    }

    public Produto buscarProduto(String codigoProduto){
        System.out.println("Buscando produto: " + codigoProduto);

        Optional<Produto> produto = repo.findByCode(codigoProduto);

        if (produto.isEmpty()) {
            throw new RuntimeException("Produto não encontrado: " + codigoProduto);
        }

        return produto.get();
    }

    public void deletarProduto(String codigoProduto){
        System.out.println("Deletando produto: " + codigoProduto);

        Optional<Produto> produto = repo.findByCode(codigoProduto);

        if (produto.isEmpty()) {
            throw new RuntimeException("Produto não encontrado para deletar: " + codigoProduto);
        }

        // como seu ID é codigoProduto
        repo.deleteById(codigoProduto);

        System.out.println("Produto deletado com sucesso!");
    }

    public void atualizarPreco(String codigoProduto, double novoPreco){
        System.out.println("Atualizando preço do produto: " + codigoProduto);

        repo.update(codigoProduto, obj -> {
            Produto p = (Produto) obj;
            p.setPreco(novoPreco);
        });

        System.out.println("Preço atualizado com sucesso!");
    }

    public void listarProdutos(){
        System.out.println("Listando produtos:");

        repo.findAll().forEach(obj -> {
            Produto p = (Produto) obj;
            System.out.println(
                    p.getCodigoProduto() + " - " +
                            p.getNome() + " - R$ " +
                            p.getPreco()
            );
        });
    }
}
