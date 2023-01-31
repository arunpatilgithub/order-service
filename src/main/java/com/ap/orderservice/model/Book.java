package com.ap.orderservice.model;

public record Book(
        String isbn,
        String title,
        String author,
        Double price
){}
