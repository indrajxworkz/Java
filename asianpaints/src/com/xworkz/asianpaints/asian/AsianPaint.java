package com.xworkz.asianpaints.asian;

public class AsianPaint {

    private int paintId;

    private String paintColor;

    private String paintType;

    private double price;

    private String quantity;

    @Override
    public String toString() {
        return "AsianPaint{" +
                "paintId=" + paintId +
                ", paintColor=" + paintColor  +
                ", paintType=" + paintType  +
                ", price=" + price +
                ", quantity=" + quantity  +
                '}';
    }

    public void setPaintId(int paintId){
        this.paintId = paintId;
    }

    public void  setPaintColor(String paintColor){
        this.paintColor = paintColor;
    }

    public void setPaintType(String paintType){
        this.paintType = paintType;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    public int getPaintId() {
        return paintId;
    }

    public String getPaintColor(){
        return paintColor;
    }

    public String getPaintType(){
        return paintType;
    }

    public  double getPrice(){
        return price;
    }

    public String getQuantity(){
        return quantity;
    }

    @Override
    public int hashCode(){
        return paintId;
    }

    @Override
    public boolean equals(Object object){
        AsianPaint asianPaint = (AsianPaint) object;
        if(this.hashCode() == asianPaint.hashCode()){
            if (this.paintColor == asianPaint.paintColor){
                return true;
            }
            return true;
        }
        return false;

    }

}
