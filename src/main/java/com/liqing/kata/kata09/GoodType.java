package com.liqing.kata.kata09;

public enum GoodType {

    A("A"), B("B"), C("C"), D("D");

    private final String name;

    private GoodType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
