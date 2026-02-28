package org.example.ecommerce;

import com.programaai.db.DbQuery;
import com.programaai.db.DbRepository;
import org.example.ecommerce.produtos.Produto;

import java.util.Optional;

public interface ProductRepository extends DbRepository {
    @DbQuery(field = "codigoProduto")
    Optional<Produto> findByCode(String code);
}
