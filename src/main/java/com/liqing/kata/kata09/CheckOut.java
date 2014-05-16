package com.liqing.kata.kata09;

import java.util.ArrayList;

public class CheckOut {

    private ArrayList<GoodType> items;
    private PriceRule priceRule;

    public CheckOut(PriceRule priceRule) {
        this.priceRule = priceRule;
    }

    public int price(String items) {
        int total = 0;
        initItems(items);
        for (GoodType item : this.items) {
            total += priceRule.getGoods(item).getPrice();
        }
        return total;
    }

    private void initItems(String items) {
        this.items = new ArrayList<GoodType>();
        for (char item : items.toCharArray()) {
            this.items.add(GoodType.valueOf(String.valueOf(item)));
        }
    }
}
