package com.example.smallcartapi.cart;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
public class Cart {

    @Id
    private String id;


}
