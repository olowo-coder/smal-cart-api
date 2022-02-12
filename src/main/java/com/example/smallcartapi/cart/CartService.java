package com.example.smallcartapi.cart;

import net.bytebuddy.utility.RandomString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface CartService {
    CartResponse saveCartItems(Map<String, String> items);


    CartResponse getAllCart();
}
