package com.liqing.kata.kata09;

import java.util.HashMap;

public class CheckOut {

    private HashMap<GoodType, Integer> items;
    private PriceRule priceRule;

    public CheckOut(PriceRule priceRule) {
        this.priceRule = priceRule;
    }

    public int price(String itemsString) {
        initItems(itemsString);
        return calculateTotal();
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
        items = new HashMap<GoodType, Integer>();
        for (char item : itemsString.toCharArray()) {
            GoodType goodType = GoodType.valueOf(String.valueOf(item));
            Integer integer = items.get(goodType);
            if (integer == null) {
                items.put(goodType, 1);
            } else {
                items.put(goodType, integer + 1);
            }
        }
    }
}
