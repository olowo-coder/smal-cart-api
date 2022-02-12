package com.example.smallcartapi.product;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
@CrossOrigin("*")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<Product>> fetchAllProducts(){
        return ResponseEntity.ok(productService.fetchingAllProducts());
    }

    @PostMapping("/save")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Product> upProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.updateProduct(product));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> upProduct(@PathVariable String id){
        productService.deleteProduct(id);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }


}
