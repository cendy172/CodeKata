package com.liqing.kata.kata09;

import java.util.HashMap;

public class PriceRule {

    private final HashMap<GoodType, Goods> goodsPrices;

    public PriceRule() {
        goodsPrices = new HashMap<GoodType, Goods>();
    }

    public void addGoods(Goods goods) {
        this.goodsPrices.put(goods.getName(), goods);
    }

    public Goods getGoods(GoodType goodType) {
        return goodsPrices.get(goodType);
    }
}
