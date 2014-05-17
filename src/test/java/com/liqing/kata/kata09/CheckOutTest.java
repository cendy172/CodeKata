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

    @Test
    public void shouldGetPriceWithSpecialPrice() {
        assertThat(checkOut.price("AAA"), is(130));
        assertThat(checkOut.price("AAAA"), is(180));
        assertThat(checkOut.price("AAAAA"), is(230));
        assertThat(checkOut.price("AAAAAA"), is(260));

        assertThat(checkOut.price("AAAB"), is(160));
        assertThat(checkOut.price("AAABB"), is(175));
        assertThat(checkOut.price("AAABBD"), is(190));
        assertThat(checkOut.price("DABABA"), is(190));
    }

    @Test(expected = RuntimeException.class)
    public void shouldGetTotalFromScanWhenEmpty() {
        checkOut.scan("");
    }

    @Test
    public void shouldGetTotalFromScanWhenWithoutSpecialPrice() {
        checkOut.scan("C");
        checkOut.scan("D");
        checkOut.scan("B");
        checkOut.scan("A");

        int total = checkOut.total();

        assertThat(total, is(115));
    }

    @Test
    public void shouldGetTotalFromScanWhenWithSpecialPrice() {
        checkOut.scan("D");
        checkOut.scan("A");
        checkOut.scan("B");
        checkOut.scan("A");
        checkOut.scan("B");
        checkOut.scan("A");

        int total = checkOut.total();

        assertThat(total, is(190));
    }
}
