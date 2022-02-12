package com.example.smallcartapi.cart;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.utility.RandomString;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j
public class CartServiceImpl implements CartService{
    private final CartRepository cartRepository;

    public CartResponse saveCartItems(Map<String, String> items){
        final String uniqueIdGenerator = RandomString.make(12);
        List<Cart> all = new ArrayList<>();
        for(Map.Entry<String, String> val : items.entrySet() ){
            Cart cart = new Cart();
            cart.setProductId(val.getKey());
            cart.setQuantity(Long.parseLong(val.getValue()));
            cart.setUniqueId(uniqueIdGenerator);
            all.add(cart);
        }

        cartRepository.saveAll(all);
        return CartResponse.builder().message("All items Saved").status("OK").build();
    }


    public CartResponse getAllCart(){
        return CartResponse.builder().listCart(cartRepository.findAll()).build();
    }
}
