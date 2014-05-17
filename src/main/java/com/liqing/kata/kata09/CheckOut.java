package com.liqing.kata.kata09;

import java.util.HashMap;

public class CheckOut {

    private HashMap<GoodType, Integer> items;
    private PriceRule priceRule;

    public CheckOut(PriceRule priceRule) {
        this.priceRule = priceRule;
        items = new HashMap<GoodType, Integer>();
    }

    public int price(String itemsString) {
        try {
            initItems(itemsString);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException();
        }
        return calculateTotal();
    }

    public void scan(String item) {
        try {
            addItem(GoodType.valueOf(item));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException();
        }
    }

    public int total() {
        int total = calculateTotal();
        items.clear();
        return total;
    }

    private int calculateTotal() {
        int total = 0;
        for (GoodType item : items.keySet()) {
            total += calculateItem(item, priceRule.getGoods(item));
        }
        return total;
    }

    private int calculateItem(GoodType item, Goods goods) {
        if (goods.hasSpecialPrice()) {
            int itemTotal = (items.get(item) / goods.getSpecialNum()) * goods.getSpecialPrice();
            itemTotal += (items.get(item) % goods.getSpecialNum()) * goods.getPrice();
            return itemTotal;
        } else {
            return goods.getPrice();
        }
    }

    private void initItems(String itemsString) {
        items.clear();
        for (char item : itemsString.toCharArray()) {
            GoodType goodType = GoodType.valueOf(String.valueOf(item));
            addItem(goodType);
        }
    }

    private void addItem(GoodType goodType) {
        Integer integer = items.get(goodType);
        if (integer == null) {
            items.put(goodType, 1);
        } else {
            items.put(goodType, integer + 1);
        }
    }
}
