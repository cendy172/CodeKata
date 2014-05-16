package com.liqing.kata.kata09;

public class Goods {

    public static int NA = 0;

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

    public void setName(GoodType name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpecialNum() {
        return specialNum;
    }

    public void setSpecialNum(int specialNum) {
        this.specialNum = specialNum;
    }

    public int getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(int specialPrice) {
        this.specialPrice = specialPrice;
    }
}
