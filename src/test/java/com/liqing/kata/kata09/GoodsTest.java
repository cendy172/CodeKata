package com.liqing.kata.kata09;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GoodsTest {

    @Test
    public void shouldHasSpecialPrice() {
        Goods goods = new Goods(GoodType.A, 23, 2, 40);

        assertThat(goods.hasSpecialPrice(), is(true));
    }

    @Test
    public void shouldDoesNotHaveSpecialPrice() {
        Goods goods = new Goods(GoodType.A, 23);

        assertThat(goods.hasSpecialPrice(), is(false));
    }
}
