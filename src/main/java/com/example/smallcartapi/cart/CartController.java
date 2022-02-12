package com.example.smallcartapi.cart;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/cart")
@AllArgsConstructor
@CrossOrigin("*")
public class CartController {
    private final CartService cartService;

    @GetMapping("/all")
    public ResponseEntity<CartResponse> fetchAllCart(){
        return ResponseEntity.ok(cartService.getAllCart());
    }

    @PostMapping("/save")
    public ResponseEntity<CartResponse> saveCart(@RequestBody Map<String, String> cart){
        System.out.println(cart);
        return ResponseEntity.ok(cartService.saveCartItems(cart));
    }


}
