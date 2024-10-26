package com.mysticarts.product.list.dao;


import com.mysticarts.product.list.dto.ProductDto;

public interface ProductDao  {


    void insertProduct(ProductDto productDto);
    int getProductId();
}


