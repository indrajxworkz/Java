package com.xworkz.asianpaints.asian;

public class AsianRunner {

    /*  id, color, type, price, quantity */

    public static void main(String[] args) {

        AsianPaint paint = new AsianPaint();
        paint.setPaintId(1);
        paint.setPaintColor("Sky Blue");
        paint.setPaintType("Emulsion");
        paint.setPrice(450.00);
        paint.setQuantity("10l");
        System.out.println("Asian paint info: " + paint);

        AsianPaint paint1 = new AsianPaint();
       /* paint1.setPaintId(2);
        paint1.setPaintColor("Olive Green");
        paint1.setPaintType("Distemper");
        paint1.setPrice(350.00);
        paint1.setQuantity("15l");*/
        System.out.println("Asian paint info: " + paint1);
        boolean isEqual = paint.equals(paint1);
        System.out.println(isEqual);

        AsianPaint paint2 = new AsianPaint();
       /* paint2.setPaintId(3);
        paint2.setPaintColor("Crimson Red");
        paint2.setPaintType("Enamel");
        paint2.setPrice(600.00);
        paint2.setQuantity("8l");*/
        System.out.println("Asian paint info: " + paint2);

        paint1 = paint2;


        AsianPaint paint3 = new AsianPaint();
        paint3.setPaintId(4);
        paint3.setPaintColor("Pure White");
        paint3.setPaintType("Emulsion");
        paint3.setPrice(500.00);
        paint3.setQuantity("12l");
        System.out.println("Asian paint info: " + paint3);

        AsianPaint paint4 = new AsianPaint();
        paint4.setPaintId(5);
        paint4.setPaintColor("Charcoal Black");
        paint4.setPaintType("Satin Finish");
        paint4.setPrice(750.00);
        paint4.setQuantity("5l");
        System.out.println("Asian paint info: " + paint4);




    }

}
