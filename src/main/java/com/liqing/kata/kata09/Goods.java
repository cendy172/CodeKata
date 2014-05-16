package com.liqing.kata.kata09;

public class Goods {

    private static int NA = 0;

    private GoodType name;
    private int price;
    private int specialNum;
    private int specialPrice;

    public Goods(GoodType name, int price) {
        this(name, price, NA, NA);
    }

    public Goods(GoodType name, int price, int specialNum, int specialPrice) {
        this.name = name;
        this.price = price;
        this.specialNum = specialNum;
        this.specialPrice = specialPrice;
    }

    public GoodType getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSpecialNum() {
        return specialNum;
    }

    public int getSpecialPrice() {
        return specialPrice;
    }

    public boolean hasSpecialPrice() {
        return this.specialNum != NA;
    }
}
