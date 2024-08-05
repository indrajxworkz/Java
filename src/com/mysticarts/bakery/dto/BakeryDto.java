package com.mysticarts.bakery.dto;

public class BakeryDto {

    private int itemId;
    private String itemName;
    private double itemPrice;
    private int discount;
    private String buyerName;

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }


}
