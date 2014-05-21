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
    public void shouldAddBall() {
        sortingBall.newRound();
        sortingBall.add(20);

        List<Integer> balls = sortingBall.balls();

        assertThat(balls.size(), is(1));
        assertThat(balls.get(0), is(20));
    }

    @Test
    public void shouldAddSorted() {
        sortingBall.newRound();
        sortingBall.add(20);
        sortingBall.add(10);

        List<Integer> balls = sortingBall.balls();

        assertThat(balls.size(), is(2));
        assertThat(balls.get(0), is(10));
        assertThat(balls.get(1), is(20));
    }

    @Test
    public void shouldAddSortedByASC() {
        sortingBall.newRound();
        sortingBall.add(20);
        sortingBall.add(10);
        sortingBall.add(30);

        List<Integer> balls = sortingBall.balls();

        assertThat(balls.size(), is(3));
        assertThat(balls.get(0), is(10));
        assertThat(balls.get(1), is(20));
        assertThat(balls.get(2), is(30));
    }




}