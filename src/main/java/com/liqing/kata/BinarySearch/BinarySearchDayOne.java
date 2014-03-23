package com.liqing.kata.binarysearch;

import java.util.List;

import static com.liqing.kata.binarysearch.EqualUtils.isEqual;
import static com.liqing.kata.binarysearch.EqualUtils.isGreater;

public class BinarySearchDayOne {

    public int chop(int destination, List<Integer> source) {
        int low = 0, high = source.size() - 1;
        for (int i = high; low <= high; i = (low + high) / 2) {
            if (isEqual(destination, source.get(i))) {
                return i;
            } else if (isGreater(destination, source.get(i))) {
                low = nextIndex(i);
            } else {
                high = previousIndex(i);
            }
        }
        return -1;
    }

    private int nextIndex(int i) {
        return i + 1;
    }

    private int previousIndex(int i) {
        return i - 1;
    }

}
