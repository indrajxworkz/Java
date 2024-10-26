package com.xworkz.amozonproducts.update.get.method.products;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Products {


    private int productId;
    private String productName;
    private double price;
    private String category;
    private int ratings;


}
