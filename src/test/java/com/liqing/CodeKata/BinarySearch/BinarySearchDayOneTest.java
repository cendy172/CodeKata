package com.liqing.CodeKata.BinarySearch;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * User: LiQing Date: 8/6/13 Time: 7:45 PM
 */
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
	public void shouldReturnTrueWhenTwoNumbersAreEqual()
	{
		assertThat(binarySearchDayOne.isEqual(2, 2), is(true));
	}

	@Test
	public void shouldReturnFalseWhenTwoNumbersAreNotEqual()
	{
		assertThat(binarySearchDayOne.isEqual(2, 3), is(false));

	}

	@Test
	public void shouldReturnTrueWhenNumber1GreaterThanNumber2()
	{
		assertThat(binarySearchDayOne.isGreater(3, 2), is(true));
	}

	@Test
	public void shouldReturnFalseWhenNumber1LessThanNumber2()
	{
		assertThat(binarySearchDayOne.isGreater(2, 3), is(false));
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
