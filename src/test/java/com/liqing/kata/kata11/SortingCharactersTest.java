package com.liqing.kata.kata11;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SortingCharactersTest {

    private SortingCharacters sortingCharacters;

    @Before
    public void setUp() {
        sortingCharacters = new SortingCharacters();
    }

    @Test
    public void shouldSortingCharacters() {
        String sorted = sortingCharacters.sort("When not studying nuclear physics, Bambi likes to play beach volleyball.");

        assertThat(sorted, is("aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy"));
    }
}