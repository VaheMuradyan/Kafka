package com.example.productmicroservice.service;

import com.example.productmicroservice.service.dto.CreateProductDto;

import java.util.concurrent.ExecutionException;

public interface ProductService {
    String createProduct(CreateProductDto dto) throws ExecutionException, InterruptedException;
}
