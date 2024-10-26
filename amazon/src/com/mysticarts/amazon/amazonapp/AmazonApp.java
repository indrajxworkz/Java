package com.mysticarts.amazon.amazonapp;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class AmazonApp {
    private int pro_Id;
    private String pro_Name;
    private String pro_category;
    private double pro_price;
    private String  pro_brand;
    private double pro_Ratings;

}
