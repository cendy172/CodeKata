package com.liqing.kata.kata11;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SortingBallTest {

    private SortingBall sortingBall;

    @Before
    public void setUp() {
        sortingBall = new SortingBall();
    }

    @Test
    public void shouldAddSorted() {
        sortingBall.newRound();
        sortingBall.add(20);

        List<Integer> balls = sortingBall.balls();

        assertThat(balls.size(), is(1));
        assertThat(balls.get(0), is(20));
    }
}