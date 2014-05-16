package com.liqing.kata.kata09;

import org.junit.Before;
import org.junit.Test;

import static com.liqing.kata.kata09.GoodType.A;
import static com.liqing.kata.kata09.GoodType.B;
import static com.liqing.kata.kata09.GoodType.C;
import static com.liqing.kata.kata09.GoodType.D;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckOutTest {

    private CheckOut checkOut;

    @Before
    public void setUp() {
        PriceRule priceRule = new PriceRule();
        priceRule.addGoods(new Goods(A, 50, 3, 130));
        priceRule.addGoods(new Goods(B, 30, 2, 45));
        priceRule.addGoods(new Goods(C, 20));
        priceRule.addGoods(new Goods(D, 15));
        checkOut = new CheckOut(priceRule);

    }

    @Test
    public void shouldGetPriceWithoutSpecialPrice() {
        assertThat(checkOut.price(""), is(0));
        assertThat(checkOut.price("A"), is(50));
        assertThat(checkOut.price("AB"), is(80));
        assertThat(checkOut.price("CDBA"), is(115));
        assertThat(checkOut.price("AA"), is(100));
    }
}
