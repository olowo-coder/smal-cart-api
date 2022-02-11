package com.example.smallcartapi.product;

import java.util.List;

public interface ProductService {

    List<Product> fetchingAllProducts();

    Product addProduct(Product product);

    Product getProductById(String id);

    Product updateProduct(Product product);

    void deleteProduct(String id);
}
