package com.liqing.kata.kata11;

import java.util.ArrayList;
import java.util.List;

public class SortingBall {

    private final ArrayList<Integer> balls;

    public SortingBall() {
        balls = new ArrayList<Integer>();
    }

    public void newRound() {
        balls.clear();
    }

    public void add(int number) {
        balls.add(number);
    }

    public List<Integer> balls() {
        return balls;
    }
}
