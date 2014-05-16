package com.liqing.kata.kata09;

import java.util.HashMap;

public class CheckOut {

    private HashMap<GoodType, Integer> items;
    private PriceRule priceRule;

    public CheckOut(PriceRule priceRule) {
        this.priceRule = priceRule;
    }

    public int price(String itemsString) {
        int total = 0;
        initItems(itemsString);
        for (GoodType item : items.keySet()) {
            Goods goods = priceRule.getGoods(item);
            if (goods.hasSpecialPrice()) {
                total += (items.get(item) / goods.getSpecialNum()) * goods.getSpecialPrice();
                total += (items.get(item) % goods.getSpecialNum()) * goods.getPrice();
            } else {
                total += goods.getPrice();
            }
        }
        return total;
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
