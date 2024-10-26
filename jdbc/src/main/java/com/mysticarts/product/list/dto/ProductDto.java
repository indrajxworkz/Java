package com.mysticarts.product.list.dto;

public class ProductDto {
    private int product_id;
    private String product_name;
    private String category;
    private double product_price;




        public ProductDto() {

        }

        public ProductDto(int product_id, String product_name, String category) {

            this.product_id = product_id;
            this.product_name = product_name;
            this.category = category;


        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public void setProduct_name(String product_name) {
            this.product_name = product_name;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getProduct_id() {
            return product_id;
        }

        public String getProduct_name() {
            return product_name;
        }

        public String getCategory() {
            return category;
        }
    }
