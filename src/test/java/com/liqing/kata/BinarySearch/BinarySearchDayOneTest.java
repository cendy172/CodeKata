package com.liqing.kata.binarysearch;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchDayOneTest
{

	private BinarySearchDayOne binarySearchDayOne;
	private ArrayList<Integer> source;

	@Before
	public void setUp()
	{
		binarySearchDayOne = new BinarySearchDayOne();
		source = new ArrayList<Integer>();
		source.add(1);
		source.add(2);
		source.add(3);
		source.add(5);
		source.add(6);
		source.add(7);
		source.add(8);
		source.add(9);
	}

	@Test
	public void shouldReturnIndexWhenFind()
	{
		assertThat(binarySearchDayOne.chop(1, source), is(0));
		assertThat(binarySearchDayOne.chop(2, source), is(1));
		assertThat(binarySearchDayOne.chop(5, source), is(3));
		assertThat(binarySearchDayOne.chop(8, source), is(6));
		assertThat(binarySearchDayOne.chop(9, source), is(7));
	}

	@Test
	public void shouldReturnErrorNumberWhenNotFind()
	{
		assertThat(binarySearchDayOne.chop(0, source), is(-1));
		assertThat(binarySearchDayOne.chop(10, source), is(-1));
	}
}
