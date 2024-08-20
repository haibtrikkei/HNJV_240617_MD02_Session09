package product.service;

import product.entity.Product;

public interface ProductService {
    Product[] findAll();
    Product save(Product product);
    Product update(Product product, String id);
    boolean delete(String id);
    Product[] findByName(String name);
}
