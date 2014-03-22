package com.oo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class MileTest {

    @Before
    public void setUp() {

    }

    @Test
    public void shouldBeEqualWhenLengthAreSame() {
        Mile mile1 = new Mile(3);
        Mile mile2 = new Mile(3);

        assertThat(mile1, is(mile2));
    }

    @Test
    public void shouldNotEqualWhenLengthAreNotSame() {
        Mile mile1 = new Mile(3);
        Mile mile2 = new Mile(4);

        assertThat(mile1, not(mile2));
    }

    @After
    public void tearDown() {

    }
}
