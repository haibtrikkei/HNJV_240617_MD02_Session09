package product.service.impl;

import product.entity.Product;
import product.service.ProductService;

public class ProductServiceImpl implements ProductService {
    @Override
    public Product[] findAll() {
        return new Product[0];
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public Product update(Product product, String id) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Product[] findByName(String name) {
        return new Product[0];
    }

    public int cong(int a, int b){
        return a+b;
    }
}
