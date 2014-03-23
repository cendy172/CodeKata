package com.liqing.kata.binarysearch;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EqualUtilsTest {

    @Test
    public void shouldReturnTrueWhenTwoNumbersAreEqual() {
        assertThat(EqualUtils.isEqual(2, 2), is(true));
    }

    @Test
    public void shouldReturnFalseWhenTwoNumbersAreNotEqual() {
        assertThat(EqualUtils.isEqual(2, 3), is(false));

    }

    @Test
    public void shouldReturnTrueWhenNumber1GreaterThanNumber2() {
        assertThat(EqualUtils.isGreater(3, 2), is(true));
    }

    @Test
    public void shouldReturnFalseWhenNumber1LessThanNumber2() {
        assertThat(EqualUtils.isGreater(2, 3), is(false));
    }


}
