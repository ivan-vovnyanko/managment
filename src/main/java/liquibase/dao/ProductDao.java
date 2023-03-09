package liquibase.dao;

import liquibase.model.Product;

public interface ProductDao {
    Product save(Product product);

    Product get(Long id);
}
