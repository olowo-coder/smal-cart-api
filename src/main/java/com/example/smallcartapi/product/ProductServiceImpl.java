package com.example.smallcartapi.product;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    public List<Product> fetchingAllProducts(){
        log.info("fetching all Products");
        return productRepository.findAll();
    }

    public Product addProduct(Product product){
        log.info("adding Product with name: {}", product.getName());
        return productRepository.save(product);
    }

    public Product getProductById(String id){
        log.info("getting product bt ID: {}", id);
        return productRepository.findById(id)
                .orElseThrow(()-> new IllegalStateException("Product not found"));
    }

    public Product updateProduct(Product product){
        log.info("updating Product with name: {}", product.getName());
        return productRepository.save(product);
    }

    public void deleteProduct(String id){
        log.info("deleting Product with ID: {}", id);
        productRepository.deleteById(id);
    }
}
