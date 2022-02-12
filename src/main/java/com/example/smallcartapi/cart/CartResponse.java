package com.example.smallcartapi.cart;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartResponse {
    private List<Cart> listCart;
    private String message;
    private String status;
}
